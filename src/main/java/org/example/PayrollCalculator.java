package org.example;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter the employee's name:");
     String name = scanner.nextLine();
        System.out.println("Enter number of hours worked:");
     float hours = scanner.nextInt();
     System.out.println("Enter their hourly pay:");
     int pay = scanner.nextInt();
     float gross = hours*pay;
     System.out.println(String.format("%s has $%.2f gross pay",name, gross));


    }
}
