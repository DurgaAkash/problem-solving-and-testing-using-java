import java.util.*;
import java.util.stream.*;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> operations = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            operations.add(sc.nextLine());
        }

        double balance = operations.stream()
                .filter(x -> x.startsWith("Deposit"))
                .map(x -> Double.parseDouble(x.split(" ")[1]))
                .reduce(0.0, (a, b) -> a + b);

        double withdraw = operations.stream()
                .filter(x -> x.startsWith("Withdraw"))
                .map(x -> Double.parseDouble(x.split(" ")[1]))
                .reduce(0.0, (a, b) -> a + b);

        System.out.println((int)(balance - withdraw));
    }
}

Input:5
Deposit 1000
Deposit 500
Withdraw 200
Deposit 300
Withdraw 100
    Output:
1500
