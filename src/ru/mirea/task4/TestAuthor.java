package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Пушкин", "push@mail.ru", 'm');
        Author a2 = new Author("Есенин","", 'm');
        a2.setEmail("esen@bk.ru");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
