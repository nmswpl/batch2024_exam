package in.co.nmsworks.week5.exam;
/*
3. Write a program to multiply two arrays of same size element-by-element. Read the input from user
E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7
 */

public class Question3 {

    public void multiplyArr(Integer[] arr1, Integer[] arr2){
        System.out.println("The Output For Multiplying Two Arrays::");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(arr1[i]*arr2[j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Question3 q = new Question3();
        q.multiplyArr(new Integer[]{2, 4, 1},new Integer[]{3,5,7});
    }
}
