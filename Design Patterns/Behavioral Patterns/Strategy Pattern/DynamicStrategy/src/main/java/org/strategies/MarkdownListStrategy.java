package org.strategies;

import org.interfaces.ListStrategy;

public class MarkdownListStrategy implements ListStrategy {
    @Override
    public void addListItem(StringBuilder stringBuilder, String item)
    {
        stringBuilder.append(" * ").append(item)
                .append(System.lineSeparator());
    }
}
