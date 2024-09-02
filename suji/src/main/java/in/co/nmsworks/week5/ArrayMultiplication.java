package in.co.nmsworks.week5;

import java.util.Scanner;

public class ArrayMultiplication
{
 int arr1[]=new int [3];
 int arr2[]=new int [3];
 int arr[]=new int[3];

 public void getArrayandPrint(int arr1[],int arr2[])
 {
     for (int i = 0; i <3 ; i++)
     {
         arr[i]=arr1[i]*arr2[i];
     }

     for (int i = 0; i < 3; i++) {
         System.out.println(arr[i]);
     }
 }

    public static void main(String[] args) {
        ArrayMultiplication obj=new ArrayMultiplication();
        Scanner sc=new Scanner(System.in);
        int a[]=new int [3];
        System.out.println("Enter 1st array");
        for (int i=0;i<3;i++)
        {
            a[i]= sc.nextInt();
        }
        int b[]=new int [3];
        System.out.println("Enter 2nd array");
        for (int i=0;i<3;i++)
        {
            b[i]= sc.nextInt();
        }
        obj.getArrayandPrint(a,b);

    }



}
