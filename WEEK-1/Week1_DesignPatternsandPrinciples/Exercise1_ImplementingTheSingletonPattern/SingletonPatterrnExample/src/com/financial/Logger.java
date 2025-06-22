package com.financial;

public class Logger {
    // Step 1: Create a private static instance
    private static Logger instance;

    // Step 2: Private constructor
    private Logger() {
        System.out.println("Logger initialized");
    }

    // Step 3: Public static method to return the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create only if not already created
        }
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}