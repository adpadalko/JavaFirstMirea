package ru.mirea.task4;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName(String name) {
        return name;
    }

    public String getEmail(String email) {
        return email;
    }

    public char getGender(char gender){
        return gender;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public String toString(){
        String str = this.name + "(" + this.gender + ") " + this.email;
        return str;
    }
}
