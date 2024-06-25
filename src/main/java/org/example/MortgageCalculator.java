package org.example;

public class MortgageCalculator {
    public static void main(String[] args) {
     float loanAmount = 53000.00f;
     float interestRate = 7.625f;
     int loanLength = 15;
     float MIR = interestRate/1200;
     double monthlyPay = (loanAmount*(MIR))/(1-Math.pow((1+MIR),-(loanLength*12)));
     double totalInt = monthlyPay*loanLength*12 - loanAmount;
        System.out.println(String.format("$%.2f monthly pay", monthlyPay));
        System.out.println(String.format("$%.2f total int", totalInt));

    }
}
