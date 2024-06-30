package org.example;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine();
        String[] words = fullName.split("\\s+");
        int lenWords = words.length;
            System.out.println("First Name: " + words[0]);
            if (lenWords == 2) {
                System.out.println("Middle Name: (none)");
                System.out.println("Last Name: " + words[1]);
            }
            else if (lenWords > 2) {
                System.out.println("Middle Name: " + words[1]);
                System.out.println("Last Name: " + words[2]);
                return;
            }
            else if (lenWords == 1) {
                System.out.println("Middle Name: (none)");
                System.out.println("Last Name: (none)");
            }

        }
    }

