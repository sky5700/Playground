import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      int r=scan.nextInt();
      int c=scan.nextInt();
        for(int a=r;a>=1;a--)
        {
            for(int b=c;b>=1;b--)
            {
                if(a>=b)
                {
                    System.out.print(a);
                }
                else
                {
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }
}