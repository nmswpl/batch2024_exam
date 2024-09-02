package in.co.nmsworks.week5.exam;

public class MultiplyOfArrays {
    public void multiply(int[] array1, int[] array2 ){
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] * array2[i]);
        }
    }

    public static void main(String[] args) {

        MultiplyOfArrays mul = new MultiplyOfArrays();
        mul.multiply(new int[]{2, 6, 8}, new int[]{7, 9, 3});
    }
}
