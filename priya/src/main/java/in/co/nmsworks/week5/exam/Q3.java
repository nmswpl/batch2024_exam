package in.co.nmsworks.week5.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public void multiplyArray(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {
        Q3 q = new Q3();
        int[] ar = {2,4,1};
        int[] ar1 = {3,5,7};

        q.multiplyArray(ar,ar1);
    }
}
