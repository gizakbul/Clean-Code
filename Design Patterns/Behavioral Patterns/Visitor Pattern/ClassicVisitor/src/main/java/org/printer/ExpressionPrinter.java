package org.printer;

import org.interfaces.ExpressionVisitor;
import org.models.AdditionExpression;
import org.models.DoubleExpression;

public class ExpressionPrinter implements ExpressionVisitor {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(DoubleExpression e)
    {
        sb.append(e.value);
    }

    @Override
    public void visit(AdditionExpression e)
    {
        sb.append("(");
        e.left.accept(this);
        sb.append("+");
        e.right.accept(this);
        sb.append(")");
    }

    @Override
    public String toString()
    {
        return sb.toString();
    }
}