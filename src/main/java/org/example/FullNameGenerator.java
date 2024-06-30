package org.example;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();
        if (!middleName.isEmpty()) {
            if (middleName.length() == 1)
                middleName = middleName + ".";
            middleName = middleName + " ";
        };
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();
        System.out.print("Full name :" + firstName + " " + middleName  + lastName);
        if  (!suffix.isEmpty()) {
            System.out.print(", " + suffix);
        }
    }
}
