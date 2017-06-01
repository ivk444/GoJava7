package javaCore.module1_1.lection_1_1.arrays;

import java.util.Arrays;

/**
 * Created by john on 01.06.2017.
 */
public class ArrayHolder {
    private int[] imas;

    public ArrayHolder() {imas = new int[10];}

    public ArrayHolder(int[] imas) {this.imas = imas;}

    public int[] getImas() {return imas;}

    public void setImas(int[] imas) {this.imas = imas;}

    public int getArraySum() {
        int sum = 0;

        for (int i = 0; i < this.imas.length; i++) {
            sum += imas[i];
        }

        return sum;
    }

    @Override
    public String toString() {
        return "ArrayHolder{" +
                "imas=" + Arrays.toString(imas) +
                '}';
    }
}
