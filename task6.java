import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> rides = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();

            rides.add(type + " " + distance);
        }

        rides.stream()
             .filter(ride -> ride.startsWith("Cab"))
             .forEach(System.out::println);
    }
}

Input:
5
Bike 10
Cab 15
Auto 8
Cab 20
Bike 5
    Output:
Cab 15
Cab 20
