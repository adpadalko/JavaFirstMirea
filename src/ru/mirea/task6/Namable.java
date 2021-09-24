package ru.mirea.task6;

public class Namable {
    private String name;
    private int numb;
    Namable(int numb){
        setNumb(numb);
        setName();
    }

    public int getNumb(){ return numb; }
    public void setNumb(int numb){ this.numb=numb; }
    public void setName(){
        switch (getNumb()){
            case(1):
                this.name="Mercury";
                break;
            case(2):
                this.name="Venus";
                break;
            case(3):
                this.name="Earth";
                break;
            case(4):
                this.name="Mars";
                break;
            case(5):
                this.name="Jupiter";
                break;
            case(6):
                this.name="Saturn";
                break;
            case(7):
                this.name="Uranus";
                break;
            case(8):
                this.name="Neptune";
                break;
        }
    }
    public String getName(){ return name; }
}
