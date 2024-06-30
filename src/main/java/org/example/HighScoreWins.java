package org.example;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a game score: ");
        String gameScore = scanner.nextLine();
        String[] scores = gameScore.split("\\|");
        String team1 = scores[0].split(":")[0];
       String team2 = scores[0].split(":")[1];
       int score1 = Integer.parseInt(scores[1].split(":")[0]);
        int score2 = Integer.parseInt(scores[1].split(":")[1]);
       if (score1 > score2) {
           System.out.println("Winner: " + team1);
       }
       else {
           System.out.println("Winner: " + team2);
       }

    }
}
