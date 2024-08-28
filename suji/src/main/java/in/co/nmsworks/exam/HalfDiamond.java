package in.co.nmsworks.exam;

public class HalfDiamond
{
    int height;

    public void printPattern(int height)
    {
        if (height % 2 != 0)                             // pattern for odd numbers
        {
            for (int i = 1; i <= (height / 2) + 1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = (height / 2); i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println(" ");

            }
        } else {                                                        //pattern for even numbers with given height
            for (int i = 1; i <= (height / 2); i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = (height / 2); i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println(" ");

            }
        }
    }

    public static void main(String[] args)
    {
        HalfDiamond ob=new HalfDiamond();
        ob.printPattern(7);
    }
}
