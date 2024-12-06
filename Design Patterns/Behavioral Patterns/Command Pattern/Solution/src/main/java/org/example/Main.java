package org.example;

import org.models.Account;
import org.models.Command;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        Command deposit = new Command(Command.Action.DEPOSIT, 100);
        account.process(deposit);
        System.out.println("Balance after deposit: " + account.balance); // 100
        System.out.println("Deposit success: " + deposit.success); // true

        Command withdraw = new Command(Command.Action.WITHDRAW, 50);
        account.process(withdraw);
        System.out.println("Balance after withdraw: " + account.balance); // 50
        System.out.println("Withdraw success: " + withdraw.success); // true

        Command withdrawTooMuch = new Command(Command.Action.WITHDRAW, 100);
        account.process(withdrawTooMuch);
        System.out.println("Balance after failed withdraw: " + account.balance); // 50
        System.out.println("Withdraw success: " + withdrawTooMuch.success); // false
    }
}