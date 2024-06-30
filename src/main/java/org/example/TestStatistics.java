package org.example;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TestStatistics {
    public static void main(String[] args) {
        ArrayList<Float> scores = new ArrayList<Float>();
        scores.add(75.5f);
        scores.add(82.0f);
        scores.add(91.3f);
        scores.add(68.4f);
        scores.add(77.7f);
        scores.add(89.6f);
        scores.add(94.2f);
        scores.add(72.8f);
        scores.add(85.1f);
        scores.add(79.4f);
        scores.add(88.9f);

      float avg =  getAverage(scores);
      float highScore =  getHighScore(scores);
      float minScore = getMinScore(scores);
      System.out.println("average " + avg + "\n high "+ highScore +"\n low "+ minScore);


    }


    public static float getAverage(ArrayList<Float> scores) {
        float sum = 0;
        for (Float score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    // Method to find high score
    public static float getHighScore(ArrayList<Float> scores) {
        return Collections.max(scores);
    }

    // Method to find low score
    public static float getMinScore(ArrayList<Float> scores) {
        return Collections.min(scores);
    }
}
