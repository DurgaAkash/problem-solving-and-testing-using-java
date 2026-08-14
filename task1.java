import java.util.Scanner;
import java.util.stream.IntStream;
class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of employees:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(" Updated Salaries of Employees");
        IntStream.range(0,arr.length)
                .map(i->arr[i]+(arr[i]*10/100))
                .forEach(System.out::println);
    }
}


Input:
enter the no of employees:
3
10000
20000
30000
output:    
Updated Salaries of Employees
11000
22000
33000
