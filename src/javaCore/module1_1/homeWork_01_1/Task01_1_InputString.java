package javaCore.module1_1.homeWork_01_1;

import java.util.Scanner;

public class Task01_1_InputString {

    public static void main(String[] args) {

        System.out.print("Enter Your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println();
        System.out.println("Hello, " + name);

    }


}