package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! From Matteus!");

        // Infinite loop to keep the application running
        while(true) {
            try {
                // Sleep for 60 seconds
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
