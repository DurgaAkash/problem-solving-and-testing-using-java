import java.util.*;
import java.util.stream.*;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        int m = pattern.length();

        String result = IntStream.range(0, text.length() - m + 1)
                .filter(i -> text.substring(i, i + m).equals(pattern))
                .mapToObj(i -> String.valueOf(i))
                .reduce("", (a, b) -> a + b + " ");

        System.out.println(result);
    }
}

Input:
ABABAB
AB
    output:
0 2 4
