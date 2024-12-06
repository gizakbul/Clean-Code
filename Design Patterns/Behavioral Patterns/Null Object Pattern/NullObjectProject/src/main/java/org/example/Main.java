package org.example;

import org.logs.ConsoleLog;
import org.logs.Log;
import org.logs.NullLog;
import org.models.BankAccount;

public class Main {
    public static void main(String[] args) {
        //ConsoleLog log = new ConsoleLog();
        //Log log = null;
        NullLog log = new NullLog();

        BankAccount ba = new BankAccount(log);
        ba.deposit(100);
        ba.withdraw(200);
    }
}