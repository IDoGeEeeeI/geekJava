import java.util.Arrays;
import java.util.Scanner;

public class Less2 {
    public static void main(String[] args) {
// номера foo совпадают с номерами заданий
        foo1();
        foo2();
        foo3();
        foo4();
        foo5();
        foo6();
        foo7();
    }
    public static  void  foo1(){
        int arr1[]=new int[10];
        for (int i =0;i<arr1.length;i++){
            int f=(int)(Math.random()*10);
//            System.out.print(" "+f);
            if(f>5)
                arr1[i]=1;
            else
                arr1[i]=0;
        }
//        System.out.println(Arrays.toString(arr));//исходный массив(чтоб проверить)
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]==0)
                arr1[i]=1;
            else
                arr1[i]=0;
        }
        System.out.print("ответ на 1 номер = "+" ");
        System.out.println(Arrays.toString(arr1));

    }
    public static void foo2(){
        int arr2[]=new int[8];

        for (int i =0;i<arr2.length;i++){
            arr2[i]=i*3;
        }
        System.out.print("ответ на 2 номер = "+" ");
        System.out.println(Arrays.toString(arr2));

    }
    public static void foo3(){
        int arr3[]={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i =0;i<arr3.length;i++){
            if (arr3[i]<6)
                arr3[i]*=2;
        }
        System.out.print("ответ на 3 номер = "+" ");
        System.out.println(Arrays.toString(arr3));
    }
    public  static void foo4(){
        System.out.println("ответ на 4 номер = "+" ");
        int u= (int)(Math.random()*10);
        if (u < 3) //ограничивает размер массива (min = 3x3)
            u = 3;
//        System.out.println(u); //проверочный вывод количество столбов и строчек
        int arr4[][]=new int[u][u];
        for (int i=0;i<arr4.length;i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j||i+j==arr4.length-1)//arr4.length-1 потому что j < arr4.length (знак <, а не <=)
                    arr4[i][j] = 1;
                else arr4[i][j] = 0;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void foo5(){
        System.out.println("ответ на 5 номер = "+" ");
        int d= (int)(Math.random()*10);
        if(d<4) //ограничил мин массива до 4,  с массивом 2 и 3 скучно
            d=4;
        int arr5[]= new int[d];
        for (int i =0;i<arr5.length;i++) {
            arr5[i] =(int)(Math.random()*10);//от 0 дo 10
        }
        System.out.println("данный массив = "+ Arrays.toString(arr5));//проверка массива
        int t=-1;//min
        int y=11;//max
        for (int i =0;i<arr5.length;i++) {
            if(arr5[i]>t)
                t=arr5[i];
            if(arr5[i]<y)
                y=arr5[i];
        }
        System.out.println("max = "+t);
        System.out.println("min = "+y);
    }

    public static void foo6() {
        System.out.println();
        System.out.println("ответ на 6 номер = "+" ");
//-------------------------------------------------------------------------------------------------------------------
//        int arr6[]= {2, 2, 2, 1, 2, 2, 10, 1};// значение из метадички
//-------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------------------------------
        int k= (int)(Math.random()*10);
        if(k<5)
            k=5;
        int arr6[]=new int[k];
        for (int i =0;i<arr6.length;i++) {
            arr6[i] =(int)(Math.random()*10);//от 0 дo 10
        }
// я содал массив который заполняется рандомно, но выше есть пример массива, который можно использовать для проверки задания, он подписан как из методички
//p.s. зачем это все? просто у массива, которого рандомные значения, может долго не подбираться значение в ответе  True
//----------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("данный массив = "+ Arrays.toString(arr6)); // массив


        int g=0;
        int lef=0;
        for (int i =0;i<arr6.length;i++) {
            g += arr6[i];
        }
//        System.out.println(g);     // сумма чимсел массива


        String b="";
        int j=0;
        int z;
        for (int i =1;i<arr6.length;i++) {
            lef=0;
//            j = arr6.length+i - arr6.length ;//колличество цифр в левой части
            j = i ;//колличество цифр в левой части
            for (z=0;z<j;z++) {  // сумма левой части массива
                lef += arr6[z];
            }
            if(lef==(g-lef)){  //проверка сумм левой и правой части
                b="true";
                break;
            }
            else
                b="false";
//            System.out.print(z + "="+ lef+ " "); // просмотр сумм левых частей
        }
        System.out.println(b);
        System.out.println();
    }

    public static void foo7(){ // 4 дня сидел над этим заданием
        System.out.println("ответ на 7 номер = "+" ");
        System.out.print("исходный массив (рандомный) = ");



        int arr7[] = {0, 1, 2, 3, 4, 5, 6};//заданный массив, с ним проще определить: правильно или нет, но можно использовать который ниже(рандомный)

//        int o= (int)(Math.random()*10);
//        if(o<5)
//            o=5;
//        int arr7[]=new int[o];
//        for (int i =0;i<arr7.length;i++) {
//            arr7[i] =(int)(Math.random()*10);//от 0 дo 10
//        }

        System.out.println(Arrays.toString(arr7));
        System.out.println("введите число для сдвига");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int e=0;
    if(n<0) {
        n = Math.abs(n);
        if (n> arr7.length){
            int ee = n/arr7.length;//для чисел  n>2*length
            n=n-arr7.length*ee;
        }
        for (int i = 0; i < n / 2; i++) {// меняет n переменных в начале массива
            e = arr7[i];
            arr7[i] = arr7[n - i - 1];
            arr7[n - i - 1] = e;
        }
        for (int i = n; i <= (arr7.length+n-1) / 2; i++) {// меняет n-length переменных в начале массива
            e = arr7[i];
            arr7[i] = arr7[arr7.length - i + n - 1];
            arr7[arr7.length - i + n - 1] = e;
        }
        for (int i = 0; i < arr7.length / 2; i++) {  //разворачивает массив
            e = arr7[i];
            arr7[i] = arr7[arr7.length - i - 1];
            arr7[arr7.length - i - 1] = e;
        }
    }
    else if(n>0){
        if (n> arr7.length){
            int ee = n/arr7.length;//для чисел  n>2*length
            n=n-arr7.length*ee;
        }
        for (int i = 0; i < arr7.length / 2; i++) {
            e = arr7[i];
            arr7[i] = arr7[arr7.length - i - 1];
            arr7[arr7.length - i - 1] = e;
        }
        for (int i = 0; i < n / 2; i++) {
            e = arr7[i];
            arr7[i] = arr7[n - i - 1];
            arr7[n - i - 1] = e;
        }
        for (int i = n; i <= (arr7.length+n-1) / 2; i++) {
            e = arr7[i];
            arr7[i] = arr7[arr7.length - i + n - 1];
            arr7[arr7.length - i + n - 1] = e;
        }
    }
        num.close();
        System.out.println(Arrays.toString(arr7));
    }
}
