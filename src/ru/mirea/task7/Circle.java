package ru.mirea.task7;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){}

    public Circle(){}
    public Circle(double radius, String colour, boolean filled){
        this.radius=radius;
        new Circle(radius);
        super.Shape(colour, filled);

    }

    public double getRadius(){ return radius;}
    public void setRadius(double radius){ new Circle(radius);}
    public double getArea(){ return (3.14*getRadius()*getRadius());}
    public double getPerimeter(){ return (getRadius()*2*3.14);}
    public String toString(){ return super.toString();}
    public String getColourCircle(){ return super.getColour();}
    public void setColour(String colour){ super.setColour(colour);}
    public void setFilled(boolean filled){ super.setFilled(filled);}
}
