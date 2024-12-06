package org.abstracts;

import org.interfaces.ExpressionVisitor;

public abstract class Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
