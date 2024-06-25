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
     float overtime = 0;
     String note = "";
     if (hours > 40) {
         overtime = hours - 40;
         hours = 40;
     note = "("  +name + " earned overtime)";}
     double gross = hours*pay + overtime*pay*1.5;
     System.out.println(String.format("%s has $%.2f gross pay %s",name, gross, note));


    }
}
