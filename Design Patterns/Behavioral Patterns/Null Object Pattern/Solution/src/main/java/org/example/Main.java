package org.example;

import org.logs.Log;
import org.logs.NullLog;
import org.models.Account;

public class Main {
    public static void main(String[] args) {
        Log nullLog = new NullLog();

        Account account = new Account(nullLog);

        try {
            account.someOperation();
            System.out.println("Operation completed successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}