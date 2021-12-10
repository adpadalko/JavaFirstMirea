package ru.mirea.task7;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){}
    public Rectangle(double width, double length, String colour, boolean filled){
        this.length=length;
        this.width=width;
        new Rectangle();
        super.Shape(colour, filled);
    }
    public double getWidth(){ return width;}
    public void setWidth(double width){ this.width=width;};
    public double getLength() { return length;}
    public void setLength(double length) { this.length = length;}
    public double getArea(){ return (getLength()*getWidth());}
    public double getPerimeter(){ return (getLength()*2+getWidth()*2);}
    public String toString(){ return super.toString();}
    public String getColourRectangle(){ return super.getColour();}
    public void setColour(String colour){ super.setColour(colour);}
    public void setFilled(boolean filled){ super.setFilled(filled);}

    //public double getSide(){return (getLength());}

}
