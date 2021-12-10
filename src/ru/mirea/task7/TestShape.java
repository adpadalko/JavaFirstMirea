package ru.mirea.task7;

public class TestShape {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColour());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());
        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColourCircle());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        Shape s2 = new Square(3, "BLUE", true);
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColour());
        System.out.println(((Rectangle) s3).getLength());
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColourRectangle());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6, "BLUE", true);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColour());
        //System.out.println(s4.getSide());
        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColour());
        //System.out.println(r2.getSide()); нет метода getSide();
        System.out.println(r2.getLength());
        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColourSquare());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
