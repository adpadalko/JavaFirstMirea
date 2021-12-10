package ru.mirea.task7;

public class Square extends Rectangle{
    public Square(){ }
    public Square(double side, String colour, boolean filled){
        //super.setLength(side);
        setSide(side);
        new Square();
        super.Shape(colour, filled);
    }
    public double getSide() { return super.getLength();}
    public void setSide(double side){ super.setLength(side);}
    public  void setWidth(double side){ super.setWidth(side);}
    public  void setLength(double side){ super.setLength(side);}
    public String toString(){ return super.toString();}
    public String getColourSquare(){ return super.getColour();}
    public void setColour(String colour){ super.setColour(colour);}
    public void setFilled(boolean filled){ super.setFilled(filled);}
    public double getArea(){ return (getLength()*getLength());}
    public double getPerimeter(){ return (getLength()*2+getLength()*2);}
}
