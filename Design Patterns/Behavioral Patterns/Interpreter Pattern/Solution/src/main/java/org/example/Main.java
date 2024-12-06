package org.example;

import org.processors.ExpressionProcessor;

public class Main {
    public static void main(String[] args) {
        ExpressionProcessor processor = new ExpressionProcessor();
        processor.variables.put('x', 3);

        System.out.println(processor.calculate("1+2+3")); // 6
        System.out.println(processor.calculate("1+2+xy")); // 0
        System.out.println(processor.calculate("10-2-x")); // 5
    }
}