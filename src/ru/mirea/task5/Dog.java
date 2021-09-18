package ru.mirea.task5;

public abstract class Dog {
    private int legs;
    private int tail;
    private String name;

    public String getName(){
        return name;
    }
    public int getLegs(){
        return legs;
    }
    public int getTail(){
        return tail;
    }

    public Dog(int legs, int tail, String name){
        this.legs=legs;
        this.tail=tail;
        this.name=name;
    }

    public abstract void displayInfo();

}
