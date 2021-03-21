import java.util.Scanner;

public class Less1 {
    public static void main(String[] args) {
        byte aa = 127;
        char bb = 'k';
        int cc = 17457;
        long dd = 3131341;
        float ee = 3.1415f;
        double ff = 2.7312;
        String gg = "лол";
        short hh = 13;
        boolean ii = true;
        float a, b, c, d;
        a = (float) Math.random(); // (float) - превращает Math.random() из double в float
        b = (float) Math.random();
        c = (float) Math.random();
        d = (float) Math.random();
        int p = 7;
        int s = 9;
        int fff = 666;


        foo3(a,b,c,d);
        foo4(p,s);
        foo5(fff);
        foo6(fff);
        foo7();
        foo8();

    }

    public static void foo3(float a, float b, float c, float d) {
        float x;
        x = (a * (b + (c / d)));
        System.out.println("Значение задания 3 = " + " " + x);
    }

    public static void foo4(int p, int s) {
        boolean z;
        if (p + s >= 10 && p + s <= 20)
            z = true;
        else
            z = false;
        System.out.println("Значение задания 4 =" + " " + z);
    }

    public static void foo5(int fff) {
        System.out.print("Значение задания 5 =" + " ");
        if (0 <= fff)
            System.out.println("число положительное");
        else
            System.out.println("число отрицательное");
    }

    public static boolean foo6(int fff) {
        if (fff >= 0) {
            return false;
        }
        return true;
    }

    public static void foo7() {
        System.out.println("Введите имя");
        Scanner name = new Scanner(System.in);
        String nam1 = name.nextLine();
        System.out.println("Значение задания 7 =" + " " + "Привет, " + nam1);
    }

    public static void foo8() {
        System.out.println("введите год");
        Scanner years = new Scanner(System.in);
        int u = years.nextInt();
        if (u % 4 == 0 && u % 100 != 0)
            System.out.println(u + " " + "Високосный год ");
        else if (u % 100 == 0 && u % 400 == 0)
            System.out.println(u + " " + "Високосный год ");
        else
            System.out.println(u + " " + "Не Високосный год ");
    }

}