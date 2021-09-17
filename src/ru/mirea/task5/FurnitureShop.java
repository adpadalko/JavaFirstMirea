package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args){
        IKEA table = new IKEA("OZWALD", "table", "Липовый парк", 1999.99);
        IKEA chair = new IKEA("RICHARD", "chair", "Теплый стан", 399.99);
        IKEA couch = new IKEA("PETERSON", "couch", "Нарния", 9999.99);
        table.displayInfo();
        chair.displayInfo();
        couch.displayInfo();
    }
}
