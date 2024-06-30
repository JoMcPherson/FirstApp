package org.example;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("When will you pickup the car?");
        String date = scanner.nextLine();
        System.out.println("How many days for the rental?");
        int days = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Want an electronic toll tag for 3.95 a day?");
        String tag = scanner.nextLine();
        double etagPrice = tag.equals("yes") ? 3.95: 0;
        System.out.println("Want gps for 2.95 a day?");
        String gps = scanner.nextLine();
        double gpsPrice = gps.equals("yes") ? 2.95: 0;
        System.out.println("Want roadside assistance for 3.95 a day?");
        String roadside = scanner.nextLine();
        double roadsidePrice = roadside.equals("yes") ? 3.95: 0;
        System.out.println("How old are ya?");
        int age = scanner.nextInt();
        double total = (29.99+etagPrice + gpsPrice + roadsidePrice)*days;
        String extra = "";
        if (age < 25) {
            double surcharge = 0.3 * total;
            total = 1.3 * total;
            extra = String.format(". There is a 30%% surcharge of $%.2f for underage driving", surcharge);
        }

        System.out.println(String.format("Your total cost is $%.2f", total));
        System.out.println(extra);
    }
}
