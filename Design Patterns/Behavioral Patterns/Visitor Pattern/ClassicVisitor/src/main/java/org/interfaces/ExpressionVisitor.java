package org.interfaces;

import org.models.AdditionExpression;
import org.models.DoubleExpression;

public interface ExpressionVisitor {
    void visit(DoubleExpression e);
    void visit(AdditionExpression e);
}
