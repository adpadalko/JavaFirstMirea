package com.company;
import java.lang.String;
import java.util.Scanner;

class Book {
    private String Author;
    private String Name, Answer;
    private int Year;
    void displayInfo(){  //выводит инфо
        System.out.println(Author + "\n"+ Name + "\n" + Year + "\n");
    }

    public Book() {
    }

    public String GetAuthor(){
        return Author;
    }

    public String GetName(){
        return Name;
    }

    public int GetYear(){
        return Year;
    }

    public void SetAuthor(String author){
        Author=author;
    }

    public void SetName(String name){
        Name=name;
    }

    public void SetYear(int year){
        Year=year;
    }

    public String GetAnswer(String answer){
        return answer;
    }

    public void SetAnswer(String answer){
        Answer=answer;
    }

    public void Change(int year, String name, String author){
        System.out.println("Что вы хотите изменить? -- ");
        Scanner a = new Scanner(System.in);
        String answer = a.nextLine();
        if ("год".equals(answer)) {
            year = a.nextInt();
            GetYear();
            SetYear(year);
        } else if ("имя".equals(answer)) {
            name = a.nextLine();
            GetName();
            SetName(name);
        } else if ("автор".equals(answer)) {
            author = a.nextLine();
            GetAuthor();
            SetAuthor(author);
        } else {
            System.out.println("Видимо ничего.");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Book newBook = new Book(); // создание объекта
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        newBook.GetName();
        newBook.SetName(name);
        String author = in.nextLine();
        newBook.GetAuthor();
        newBook.SetAuthor(author);
        int year;
        year = in.nextInt();
        newBook.GetYear();
        newBook.SetYear(year);
        newBook.displayInfo();

        newBook.Change(year, name, author);
        newBook.displayInfo();

    }
}