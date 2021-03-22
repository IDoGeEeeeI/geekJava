package oop2;

public class Dog extends Animal {


    @Override
    public void infoRun() {
//        super.infoRun();
        if(metr<500.0) {
            System.out.println(name + " пробежал " + metr);
        }
        else {
            System.out.println(name + " не сможет пробежать  " + metr);
        }
    }

    @Override
    public void infoSwim() {
//        super.infoSwim();
        if(metr<10.0) {
            System.out.println(name + " проплыл " + metr);
        }
        else {
            System.out.println(name + " не сможет проплыть " + metr);
        }
    }

    public Dog() {

    }
    public Dog(String name, float metr) {
        super(name,metr);
    }
}

