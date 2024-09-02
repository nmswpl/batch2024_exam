package in.co.nmsworks.week5;

import java.util.Random;

public class RandomNumberGenerator
{
    int number;


    private int getRandomNumber()
    {
        Random rand = new Random();
       int a= rand.nextInt(10) + 1;
        System.out.println(" The number from random genaration function "+rand.nextInt(10) + 1);
       return a;
    }
    int c=0;
    public void checkNoOnTimes(int number,int a)
    {

        if(number== a)
        {
            System.out.println("The last number genarated from the function "+a);
            System.out.println(" It took "+(c+2)+" times to get the input number "+number);
        }
        else
        {
            c=c+1;
            checkNoOnTimes(number,getRandomNumber());
        }
    }

    public static void main(String[] args)
    {
        RandomNumberGenerator obj=new RandomNumberGenerator();
       int a= obj.getRandomNumber();
        obj.checkNoOnTimes(5,a);
    }
}
