package JavaCore.Module1_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task01_2 {

    public static void main(String[] args) {

//        System.out.println("введите желаемую длину массива целых чисел");
//        int i = new Scanner(System.in).nextInt();
        int mass[] = new int[5];

        for (int n = 0; n < 5; n++) {
            System.out.println("введите целое число - " + n + "-й элемент массива");
            mass[n] = new Scanner(System.in).nextInt();
        }
        System.out.println("введенный массив" + Arrays.toString(mass));

        Arrays.sort(mass);
        System.out.println("отсортированный массив" + Arrays.toString(mass));

    }

}