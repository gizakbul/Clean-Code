package org.example;

import org.models.Sentence;

public class Main {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("hello world");
        sentence.getWord(1).capitalize = true;
        System.out.println(sentence); // "hello WORLD"
    }
}