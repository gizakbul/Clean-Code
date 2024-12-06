package org.example;

import org.models.Memento;
import org.models.Token;
import org.models.TokenMachine;

public class Main {
    public static void main(String[] args) {
        TokenMachine tokenMachine = new TokenMachine();

        Memento m1 = tokenMachine.addToken(5);
        Memento m2 = tokenMachine.addToken(10);

        System.out.println("Tokens after additions: ");
        for (Token token : tokenMachine.tokens) {
            System.out.println(token.value);
        }

        // change values
        tokenMachine.tokens.get(0).value = 20;

        System.out.println("\nTokens after modification: ");
        for (Token token : tokenMachine.tokens) {
            System.out.println(token.value);
        }

        // revert
        tokenMachine.revert(m1);

        System.out.println("\nTokens after revert: ");
        for (Token token : tokenMachine.tokens) {
            System.out.println(token.value);
        }
    }
}