package ru.mirea.task5;

public abstract class Furniture {
    private String name;
    private String kind;
    private double price;

    public String getName(){ return name; }
    public String getKind(){ return kind; }
    public double getPrice(){ return price; }

    public Furniture(String name, String kind, double price){
        this.kind=kind;
        this.name=name;
        this.price=price;
    }

    public abstract void displayInfo();
}

class IKEA extends Furniture{
    private String shopAddress;


    public IKEA(String name, String kind, String shopAddress, double price){
        super(name, kind, price);
        this.shopAddress=shopAddress;
    }

    public void displayInfo(){
        System.out.println("ИМЯ: " + super.getName() + " ТИП: " + super.getKind() + " АДРЕС МАГАЗИНА: " +shopAddress + " ЦЕНА: " + super.getPrice());
    }
}