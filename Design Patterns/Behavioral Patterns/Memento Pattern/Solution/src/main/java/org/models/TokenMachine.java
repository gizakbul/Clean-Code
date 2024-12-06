package org.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TokenMachine {
    public List<Token> tokens = new ArrayList<>();

    public Memento addToken(int value)
    {
        Token newToken = new Token(value);
        tokens.add(newToken);
        return saveState();
    }

    public Memento addToken(Token token)
    {
        tokens.add(token);
        return saveState();
    }
    private Memento saveState()
    {
        Memento memento = new Memento();
        for (Token token : tokens)
        {
            memento.tokens.add(new Token(token.value));
        }
        return memento;
    }

    public void revert(Memento m)
    {
        this.tokens = m.tokens.stream()
                .map(t -> new Token(t.value))
                .collect(Collectors.toList());
    }
}
