import java.util.Random;
import java.util.Scanner;
public class Less4_2  {
    public static int SIZE = 5;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
//            aiTurn();
//            printMap();
//            if (checkWin(DOT_O)) {
//                System.out.println("Победил Искуственный Интеллект");
//                break;
//            }
//            if (isMapFull()) {
//                System.out.println("Ничья");
//                break;
//            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {//тут нужно както сделать так, чтоб xxx0x не являлся выйгрышным
        int ff=0;//строки
        int dd=0;//столбы
        int df1=0;//диагональ 1
        int df2=0;//диагональ 2
        int a1=0,a2=0;//для запоминания для горизонтали
        int d1=0,d2=0; // для запоминания диагоналей



        for (int i = 0; i < map.length; i++) {// когда победа по горизонтали

            if (ff >= 4 ) {
                break;
            }
            ff=0;
            for (int j = 0; j < map.length; j++) {
                if(j==a1+2){//сохранение предыдщего значения j, чтобы не работал вариант с xxx0x
                    break;
                }

                if (map[i][j] == symb) {
                    ff++;
                    a1=j;

                    if(ff==5){
                        break;
                    }
                }
            }

        }

        for (int j = 0; j < map.length; j++) {// когда победа по вертикали
            if (dd >= 4 ) {
                break;
            }
            dd=0;
            for (int i = 0; i < map.length; i++) {
                if (i==a2+2){//сохранение предыдщего значения i, чтобы не работал вариант с xxx0x
                    break;
                }
                if (map[i][j] == symb) {
                    dd++;
                    a2=i;
                    if(dd==5){
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < map.length; i++) {// когда победа по диагонали слева напрово
            if (df1 >= 4) {
                break;
            }
            for (int j = 0; j < map.length; j++) {
                if (j==d1+2){//сохранение предыдщего значения j, чтобы не работал вариант с xxx0x
                    break;
                }
                if (map[i][j] == symb && i==j) {
                    df1++;
                    d1=j;
                    if(df1==5){
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < map.length; i++) {// когда победа по диагонали справа налево
            if (df2>=4 ) {
                break;
            }
            for (int j = 0; j < map.length; j++) {
                if (i==d2+2){//сохранение предыдщего значения j, чтобы не работал вариант с xxx0x
                    break;
                }
                if (map[i][j] == symb &&  i+j==map.length-1) {
                    df2++;
                    d2=i;
                    if(df1==5){
                        break;
                    }
                }
            }
        }
//вывод
        if (ff>=4 || dd>=4 || df1>=4 || df2>=4)
            return true;
        else
            return false;
    }



    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}