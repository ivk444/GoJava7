package JavaCore.Module1_1.HomeWork_01_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task01_2 {

    public static void main(String[] args) {

        System.out.print("введите необходимую длину массива целых чисел: ");
        int arraySize = new Scanner(System.in).nextInt();

        int[] intArray = new int[arraySize];

        for (int n = 0; n < arraySize; n++) {
            System.out.print("введите целое число - " + n + "-й элемент массива: ");
            intArray[n] = new Scanner(System.in).nextInt();
        }
        System.out.println("введенный массив:       " + Arrays.toString(intArray));

        Arrays.sort(intArray);
        System.out.println("отсортированный массив: " + Arrays.toString(intArray));

    }

}