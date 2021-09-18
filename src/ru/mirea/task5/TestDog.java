package ru.mirea.task5;

public class TestDog {

    public static void main(String[] args) {
        Breed dog = new Breed(6, 9, "Степашка", "борец");
        dog.displayInfo();
        Breed dog2 = new Breed(18, 77, "Варежка", "котик");
        dog2.displayInfo();
    }
}
