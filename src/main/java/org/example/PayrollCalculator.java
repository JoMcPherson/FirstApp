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
     System.out.println("Enter their filing status (1=Single, 2=Married, 3=Head of Household):");
     int filing = scanner.nextInt();
     float overtime = 0;
     String note = "";
     if (hours > 40) {
         overtime = hours - 40;
         hours = 40;
     note = "("  +name + " earned overtime)";}
     double gross = hours*pay + overtime*pay*1.5;
    double fed = 0;
     if (gross <= 800) {
         switch (filing) {
             case (1):
                 fed = 0.07;
                 break;
             case (2):
                 fed = 0.06;
                 break;
             case (3):
                 fed = 0.04;
                 break;
         }
     }
         else if(gross >= 800.01 && gross <=1600) {
             switch(filing) {
                 case 1:
                 case 2:
                     fed = 0.1;
                     break;
                 case 3:
                     fed = 0.08;
                     break;
             }
         }
     else  {
         switch(filing) {
             case (1):
                 fed = 0.15;break;
             case (2):
                 fed = 0.13;break;
             case (3):
                 fed = 0.11;break;
         }
     }

   double social = 0.062*gross;
     double medicare = 0.0145*gross;
     double federal = fed*gross;
     double net = gross - social - medicare - federal;
     System.out.println(String.format("%s has $%.2f gross pay %s",name, gross, note));
        System.out.println(String.format("social security tax: $%.2f", social));
        System.out.println(String.format("medicare security tax: $%.2f", medicare));
        System.out.println(String.format("federal security tax: $%.2f", federal));
        System.out.println(String.format("net pay: $%.2f", net));

    }
}
