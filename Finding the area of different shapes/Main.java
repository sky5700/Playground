import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      int c=scan.nextInt();
  switch(c)
  { case 1:
      int s=scan.nextInt();
      int a=s*s;
      System.out.println(a);
      break;
      case 2:
      int l=scan.nextInt();
       int b=scan.nextInt();
       a=l*b;
      System.out.println(a);
      break;
      case 3:
      l=scan.nextInt();
       b=scan.nextInt();
      a=l*b/2;
      System.out.println(a);
      break;
   case 4:
      int l1=scan.nextInt();
       double a1=3.14*l1*l1;
      System.out.println(a1);
      break;
      default:
       System.out.println("inv");
  }
        //Try your code here
    }
}