package org.models;

public class Account {
    public int balance;

    public void process(Command c)
    {
        switch (c.action)
        {
            case DEPOSIT:
                balance += c.amount;
                c.success = true;
                break;
            case WITHDRAW:
                if (balance >= c.amount) {
                    balance -= c.amount;
                    c.success = true;
                } else {
                    c.success = false;
                }
                break;
        }
    }
}
