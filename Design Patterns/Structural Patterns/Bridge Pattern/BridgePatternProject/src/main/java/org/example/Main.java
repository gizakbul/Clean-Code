package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.models.Circle;
import org.modules.ShapeModule;

public class Main {
    public static void main(String[] args) {
        //    RasterRenderer rasterRenderer = new RasterRenderer();
//    VectorRenderer vectorRenderer = new VectorRenderer();
//    Circle circle = new Circle(vectorRenderer, 5);
//    circle.draw();
//    circle.resize(2);
//    circle.draw();

        // todo: Google Guice
        Injector injector = Guice.createInjector(new ShapeModule());
        Circle instance = injector.getInstance(Circle.class);
        instance.radius = 3;
        instance.draw();
        instance.resize(2);
        instance.draw();
    }
}