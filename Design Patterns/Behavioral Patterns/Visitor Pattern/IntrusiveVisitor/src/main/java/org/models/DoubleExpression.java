package org.models;

import org.abstracts.Expression;

public class DoubleExpression extends Expression {
    private double value;

    public DoubleExpression(double value)
    {
        this.value = value;
    }

    @Override
    public void print(StringBuilder sb)
    {
        sb.append(value);
    }
}
