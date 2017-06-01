package JavaCore.Module1_1.Lection_1_1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by john on 29.05.2017.
 */
public class ArrayHolderDemo {
    public static void main(String[] args) {
        int[] imas = new int[5];


        imas[0] = 0;
        imas[1] = 1;
        imas[2] = 2;
        imas[3] = 3;
        imas[4] = 4;

        System.out.println(imas);

        System.out.println("Array: " + arrayHolder);
        System.out.println("sum of all elements is: " + arrayHolder.getArraySum);



    }
}
