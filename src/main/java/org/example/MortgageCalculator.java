package org.example;
import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter the loan amount:");
     float loanAmount = scanner.nextFloat();
        System.out.println("Please enter the interest rate:");
     float interestRate = scanner.nextFloat();
     System.out.println("Please enter the loan length in years:");
     int loanLength = scanner.nextInt();
     float MIR = interestRate/1200;
     double monthlyPay = (loanAmount*(MIR))/(1-Math.pow((1+MIR),-(loanLength*12)));
     double totalInt = monthlyPay*loanLength*12 - loanAmount;
        System.out.println(String.format("$%.2f monthly pay", monthlyPay));
        System.out.println(String.format("$%.2f total int", totalInt));

    }
}
