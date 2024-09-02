package in.co.nmsworks.week5.exam;

import java.util.Scanner;

public class MultiplicationArray {
    public static void main(String[] args){
        MultiplicationArray ma = new MultiplicationArray();
        ma.arrayMul(new int[]{1,2,3},new  int[]{3,2,1});
    }
    public void arrayMul(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i] * b[i]);
            }
        }
    }
}
