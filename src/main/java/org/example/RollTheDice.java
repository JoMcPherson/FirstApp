package org.example;

import java.util.ArrayList;

public class RollTheDice {
    public static void main(String[] args){

        int twos = 0;
        int fours = 0;
        int sixes = 0;
        int sevens = 0;
        Dice dice = new Dice();
        for (int i = 0; i <10; i++) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();

            int sum = roll1 + roll2;
            if (sum == 2) twos++;
            else if (sum == 4) fours++;
            else if (sum == 6) sixes++;
            else if (sum == 7) sevens++;
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2+" Sum: " + sum);
        }
  System.out.println("Counter \ntwos:" + twos);
        System.out.println("fours:" + fours);
        System.out.println("sixes:" + sixes);
        System.out.println("sevens:" + sevens);




    }
    public static class Dice {
        public int roll() {
            return 1 + (int) (Math.random() * 6); // Generates random number between 1 and 6
        }
    }

    }




