package org.main;

import org.models.Circle;
import org.models.GraphicObject;
import org.models.Square;

public class Main {
    public static void main(String[] args) {
        GraphicObject drawing = new GraphicObject();
        drawing.setName("My Drawing");
        drawing.getChildren().add(new Square("Red"));
        drawing.getChildren().add(new Circle("Yellow"));

        GraphicObject group = new GraphicObject();
        group.getChildren().add(new Circle("Blue"));
        group.getChildren().add(new Square("Blue"));
        drawing.getChildren().add(group);

        System.out.println(drawing);
    }
}