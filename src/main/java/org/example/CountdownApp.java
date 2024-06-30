package org.example;

import java.util.Scanner;

public class CountdownApp {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
