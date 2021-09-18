package ru.mirea.task5;

class Breed extends Dog{
    private String breed;

    public Breed(int legs, int tail, String name, String breed) {
        super(legs, tail, name);
        this.breed=breed;
    }

    public void displayInfo(){
        System.out.println("\t> Количесво ног: " + super.getLegs() + "\n\t> Количество хвостов: " + super.getTail() + "\n\t> Имя: " + super.getName() + "\n\t> Порода: " + breed);
        System.out.println("---- ----- ------ ------- ------ ----- ----");
    }

}