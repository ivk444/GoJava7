package JavaBasic;


import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        System.out.println("task 1");
        System.out.println("------");
        int q = 13, w = 5;
        System.out.println(q + " / " + w + " = " + q / w + " и " + q % w + " в остатке");
        System.out.println("---------------------------");

        System.out.println("task 2");
        System.out.println("------");
//        System.out.println("enter the number: ");
//        int k = new Scanner(System.in).nextInt();
        int k = 999999999; int x = k;
        int s = 0;
        while (x != 0 ){
            s += x % 10;
            x /= 10;
        }
        System.out.println("Сумма цифр в числе " + k + " = " + s);
        System.out.println("---------------------------");

        System.out.println("task 3");
        System.out.println("------");
        double d = 7.23;
        int i = (int)d;
        System.out.println("целая часть от " + d + " равна " + i);
        System.out.println("---------------------------");

        System.out.println("task 4");
        System.out.println("------");
        System.out.println("---------------------------");

        System.out.println("task 5");
        System.out.println("------");
        sleepIn(false, false);
        sleepIn(true, false);
        sleepIn(false, true);
        sleepIn(true, true);


        System.out.println("---------------------------");

        System.out.println("task 6");
        System.out.println("------");
        sum(1, 2);
        sum(3, 2);
        sum(2, 4);
        System.out.println("---------------------------");

        System.out.println("task 7");
        System.out.println("------");
        diff21(19);
        diff21(-2);
        diff21(10);
        diff21(50);
        diff21(21);
        System.out.println("---------------------------");

        System.out.println("task 8");
        System.out.println("------");
        parrotTrouble(true, 6);
        parrotTrouble(true, 7);
        parrotTrouble(false, 6);
        System.out.println("---------------------------");

        System.out.println("task 9");
        System.out.println("------");
        makes10(9, 10);
        makes10(9, 9);
        makes10(1, 9);
        makes10(1, 11);
        System.out.println("---------------------------");

    }


//task 5 ------------------------------------
    public static boolean sleepIn(boolean weekday, boolean vacation){
        boolean today;
        if (weekday || vacation)
            today = true;
        else
            today = false;
        System.out.println(today);

        return (today);
    }

//task 6 ------------------------------------
    public static int sum(int i11, int i12) {
        int sum;
        if (i11 == i12)
            sum = (i11 + i12) * 2;
        else
            sum = i11 + i12;
        System.out.println(sum);

        return sum;
    }

//task 7 ------------------------------------
    public static int diff21(int n) {
        int sub;
        if (n > 21)
            sub = (n - 21) * 2;
        else
            sub = (n - 21);
        System.out.println(Math.abs(sub));

        return sub;
    }

//task 8 ------------------------------------
    public static boolean parrotTrouble(boolean talking, int hour) {
        boolean confusion;
        if (talking && hour < 7 || hour > 20)
            confusion = true;
        else
            confusion = false;
        System.out.println(confusion);

        return confusion;
    }

//task 9 ------------------------------------
    public static boolean makes10(int a, int b) {
        boolean summ;
        if (a == 10 || b == 10 || a + b == 10)
            summ = true;
        else
            summ = false;
        System.out.println(summ);

        return summ;
    }



}
