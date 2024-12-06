package org.adapters;

import org.models.Rectangle;
import org.models.Square;

public class SquareToRectangleAdapter implements Rectangle {
    private Square square;

    public SquareToRectangleAdapter(Square square)
    {
        this.square = square;
    }

    @Override
    public int getWidth()
    {
        return square.side;
    }

    @Override
    public int getHeight()
    {
        return square.side;
    }
}
