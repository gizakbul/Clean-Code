package org.example;

import org.models.AdditionExpression;
import org.models.DoubleExpression;

public class Main {
    public static void main(String[] args) {
        // 1+(2+3)
        AdditionExpression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                ));
        StringBuilder sb = new StringBuilder();
        e.print(sb);
        System.out.println(sb);
    }
}