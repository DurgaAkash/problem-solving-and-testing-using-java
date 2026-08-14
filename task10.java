import java.util.*;
import java.util.stream.*;

class LoginSystem {

    static boolean validate(String username, String password) {
        return username.length() >= 3 &&
               username.length() <= 20 &&
               password.length() >= 6 &&
               password.length() <= 20 &&
               username.equals("admin") &&
               password.equals("admin123");
    }
}

public class task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        IntStream.range(0, n)
                .mapToObj(i -> new String[]{
                        sc.next(),
                        sc.next()
                })
                .map(login ->
                        LoginSystem.validate(login[0], login[1])
                        ? "SUCCESS"
                        : "FAILURE"
                )
                .forEach(System.out::println);
    }
}

Input:
4
admin admin123
user password
admin admin123
hello hello123
    output:
SUCCESS
FAILURE
SUCCESS
FAILURE
