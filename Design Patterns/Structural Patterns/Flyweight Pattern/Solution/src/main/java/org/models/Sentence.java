package org.models;

import java.util.HashMap;
import java.util.Map;

public class Sentence {
    private String[] words;
    private Map<Integer, WordToken> tokens = new HashMap<>();

    public Sentence(String plainText) {
        this.words = plainText.split(" ");
    }

    public WordToken getWord(int index) {
        WordToken token = tokens.getOrDefault(index, new WordToken());
        tokens.put(index, token);
        return token;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (tokens.containsKey(i) && tokens.get(i).capitalize) {
                word = word.toUpperCase();
            }
            sb.append(word);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public class WordToken {
        public boolean capitalize;
    }
}
