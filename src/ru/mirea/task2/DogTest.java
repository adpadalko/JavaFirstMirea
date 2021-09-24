package ru.mirea.task2;

public class DogTest {
    public static void main(String[] args){
        Dog karl = new Dog(4, "Карл");
        System.out.println(karl.toString());
        Dog steve = new Dog(9, "Стив");
        System.out.println(steve.toString());
    }
}
