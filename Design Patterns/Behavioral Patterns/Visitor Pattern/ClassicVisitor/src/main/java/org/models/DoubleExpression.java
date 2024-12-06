package org.models;

import org.abstracts.Expression;
import org.interfaces.ExpressionVisitor;

public class DoubleExpression extends Expression {
    public double value;

    public DoubleExpression(double value)
    {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor)
    {
        visitor.visit(this);
    }
}

