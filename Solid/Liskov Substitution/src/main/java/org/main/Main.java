package org.main;

import org.model.Rectangle;
import org.model.Square;

public class Main {
    static void useIt(Rectangle r)
    {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width*10) + ", got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        Rectangle sq = new Square();
        sq.setHeight(5);
        sq.setWidth(10);
        useIt(sq);
    }
//    LSP ihlali şu noktada meydana gelir:
//    Square sınıfı, Rectangle sınıfının bir alt sınıfıdır,
//    ancak setWidth ve setHeight metotlarını değiştirdiği için,
//    kare nesnesi dikdörtgen gibi davranmaz.
//    Bu durum, Liskov Substitution Principle'ı ihlal eder
//    çünkü Square nesnesi, Rectangle nesnesi ile tamamen aynı şekilde çalışmıyor.
//    Rectangle nesnesi için setWidth ve setHeight metotları birbirinden bağımsızken,
//    Square sınıfında her iki metot da birbirine bağlıdır.
}