package oop2;

public class Animal {
    String name;
    float metr;

    static int check=0;


    public Animal() {
    }
    public Animal(String name, float metr) {
        this.name = name;
        this.metr = metr;
        this.check+=1;
    }

    public void infoRun() {
        System.out.println(name+" пробежал "+metr);
    }
    public void infoSwim() {
        System.out.println(name+" пробежал "+metr);
    }

}










