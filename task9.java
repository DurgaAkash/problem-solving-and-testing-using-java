import java.util.*;
import java.util.stream.*;
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();

        List<String> operations = Arrays.asList("+", "/");

        String result = operations.stream()
                .filter(op -> op.equals(operator))
                .map(op -> {
                    try {
                        if (op.equals("+"))
                            return Calculator.add(a, b) == a + b;
                        else
                            return Calculator.divide(a, b) == a / b;
                    } catch (ArithmeticException e) {
                        return false;
                    }
                })
                .reduce(false, (x, y) -> x || y)
                ? "Test Passed" : "Test Failed";

        System.out.println(result);
    }
}

Input:
10 + 20
    Output:
Test Passed
