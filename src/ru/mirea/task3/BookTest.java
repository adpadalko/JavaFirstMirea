package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args){
        Book newBook = new Book();
        int year = newBook.year;
        String author = newBook.author;
        String name = newBook.name;
        String answer = newBook.answer;
        newBook.displayStartInfo();
        newBook.change(answer);

    }
}
