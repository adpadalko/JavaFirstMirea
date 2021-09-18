package ru.mirea.task3;
import java.util.Scanner;

class Book {
    public String author;
    public String name;
    public int year;
    public String answer, answerToChange;

    public void displayStartInfo() {  //выводит стартовую инфо
        System.out.printf(setAuthor() + " -- автор\n" + setName() + "-- название\n" + setYear() + " -- год написания\n");
    }

    public void displayChangedInfo(){   //выводить измененную инфо
        System.out.printf(author + " -- автор\n" + name + "-- название\n" + year + " -- год написания\n");
    }

    public String setAuthor(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите автора: ");
        author = in.nextLine();
        return author;
    }

    public String setName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название: ");
        name = in.nextLine();
        return name;
    }

    public int setYear(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год написания: ");
        year = in.nextInt();
        return year;
    }

    public String getAnswer(){  //ответ на изменить ли
        Scanner in = new Scanner(System.in);
        System.out.print("Хотите что-то изменить? ");
        answer = in.nextLine();
        return answer;
    }

    public String changeWhat(){ //ответ на что изменить
        Scanner in = new Scanner(System.in);
        System.out.print("Что вы хотите изменить? ");
        answerToChange = in.nextLine();
        return answerToChange;
    }

    public void switchForChange(String answerToChange){ //изменить что-то непосредственно
        switch (answerToChange){
            case ("автор"):
                setAuthor();
                break;
            case ("название"):
                setName();
                break;
            case ("год"):
                setYear();
                break;
            default:
                Scanner in = new Scanner(System.in);
                System.out.print("Введите автор/название/год.");
                changeWhat();
                switchForChange(answerToChange);
                break;
        }
    }

    public void change(String answer){  //изменить что-то конечный метод
        switch (getAnswer()){
            case ("да"):
                changeWhat();
                switchForChange(answerToChange);
                displayChangedInfo();
                break;
            case ("нет"):
                break;
            default:
                Scanner in = new Scanner(System.in);
                System.out.print("Введите да/нет.");
                getAnswer();
                change(answer);
                displayChangedInfo();
                break;
        }
    }
}
