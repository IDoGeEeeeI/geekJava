package oop2;

public class Cat extends  Animal{


    public  Cat(){

    }
    public Cat(String name, float metr) {
       super(name,metr);
    }

    @Override
    public void infoRun() {
        //   super.infoRun();
        if(metr<200.0) {
            System.out.println(name + " пробежал " + metr);
        }
        else {
            System.out.println(name + " не сможет пробежать  " + metr);
        }
    }


    @Override
    public void infoSwim() {
        //    super.infoSwim();
        System.out.println(name+" не умеет плавать");
    }
}
