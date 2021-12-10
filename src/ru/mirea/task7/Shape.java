package ru.mirea.task7;

public abstract class Shape{
    private String colour;
    private boolean filled;

    public Shape(){};

    public void Shape(String colour, boolean filled){
        this.colour=colour;
        this.filled=filled;
    }
    public String getColour(){ return colour;}
    public void setColour(String colour){ this.colour=colour;}
    public boolean isFilled(){ return filled;}
    public void setFilled(boolean filled){ this.filled=filled;}


    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){ return ("Area: " + getArea() + "\tPerimeter: " + getPerimeter());}

    //public abstract String getColour();
}
