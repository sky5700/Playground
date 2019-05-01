import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic her
      Scanner scan =new Scanner(System.in);
      int base=scan.nextInt();
      int e=scan.nextInt();
      int x=1;
      while(e>0)
      {
        x=x*base;
        e--;
      }
      System.out.println(x);
    }
}