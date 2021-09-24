/*       Разработайте и реализуйте класс Dog (Собака): поля класса описывают кличку и возраст собаки.
*        Необходимо выполнить следующие действия: определить конструктор собаки, чтобы принять и инициализировать данные экземпляра,
*        включить стандартные методы (аксессоры) для получения и установки для имени и возраста,
*        включить метод для перевода возраста собаки в «человеческий» возраст (возраст человека равен возрасту собаки, умноженному на 7),
*        включить метод ToString, который возвращает описание экземпляра собаки в виде строки.
*/

package ru.mirea.task2;

public class Dog {
    private String name;
    private int age, human;

    Dog(int age, String name){
        setName(name);
        setAge(age);
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int humanAge(){
        this.human = getAge() * 7;
        return human;
    }

    public String toString(){
        return (getName() + " " + getAge() + " (" + humanAge() + ")");
    }
}
