import java.util.Random;
import java.util.Scanner;

public class Less3 {
    public static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    public static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        foo1();
    }


    public static void foo1() {
        System.out.println("компьютер загадал слово по теме фрукт, ваша задача угадать его");


        Random f = new Random();
        int x = f.nextInt(25);
        String word_comp = words[x];//выбранное компом
        System.out.println("проверка=" + word_comp);
        System.out.println();



        String between[]= {"\u0023"};//# между угаданных букв
        char exit[] = new char[15];//массив для вывода
//        for (int i=0;i<exit.length;i++){
//            exit[i]='2';
//        }
        String exit2[] = new String[15];//массив c #
        for (int i = 0; i < exit2.length; i++) {
            exit2[i] = "\u0023";
        }




        for (;;) {
            String word_person = sc.nextLine();// выбронное человеком
            if (word_person.length() >= word_comp.length()) {
                for (int i = 0; i < word_comp.length(); i++) {
                    char b = word_person.charAt(i);
                    char a = word_comp.charAt(i);
                    if (a == b) {
                        exit[i] = a;
                    }
                    else {
                        exit[i]='1';
                    }
                }
            } else if (word_person.length() < word_comp.length()) {
                for (int i = 0; i < word_person.length(); i++) {
                    char b = word_person.charAt(i);
                    char a = word_comp.charAt(i);
                    if (a == b) {
                        exit[i] = a;
                    }
                    else {
                        exit[i]='1';
                    }
                }
            }



//вывод
            if (word_comp.equals(word_person)) {
                for (int i = 0; i < word_comp.length(); i++) {
                    System.out.print(exit[i]);
                }
                System.out.println("  вы угадали!!");
                break;
            } else {
                for (int i = 0; i < word_comp.length(); i++) {
                    if(exit[i]=='1'){
                        System.out.print(between[0]);//если внутри слова буква не правильная
                        continue;
                    }
                    System.out.print(exit[i]);
                }
                for (int i = 0; i < exit2.length; i++) {
                    System.out.print(exit2[i]);
                }
                System.out.println();
                System.out.println("часть слова ты угадал, но попробуй еще");
            }

            System.out.println();
        }



        sc.close();

        }
    }
