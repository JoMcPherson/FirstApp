package org.example;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What size sandwich you want (1-Regular, 2-Large):");
            int size = scanner.nextInt();
            scanner.nextLine();
        System.out.println("Do you want the sandwich loaded (double everything) (yes or no):");
        String loaded = scanner.nextLine();
        double additional = 0;
        if (loaded.equals("yes") && size == 1)
            additional = 1.00;
        else if (loaded.equals("yes") && size ==2)
            additional = 1.75;


        System.out.println("Enter your age to determine if you are eligible for a discount. Enter 0 if you\n" +
                    "do not want an age-based discount:");
            int age = scanner.nextInt();

           double discount;
           double price = 0.0;
            if (age <= 17)
                discount = 0.9;
            else if (age >= 65 )
                discount = 0.8;
            else
                discount = 1;
            switch(size) {
                case 1:
                    price = 5.45;
                    break;
                case 2:
                    price = 8.95;
                    break;
                default:
                    System.out.println("not a size");
            }

            price = (price+additional)*discount;
            double sales = price*.0825;
        System.out.printf("Sandwich Price: $%.2f%n", price);
        System.out.printf("Sales tax: $%.2f%n", sales);
        System.out.printf("Total: $%.2f%n",price+sales);


    }
}
