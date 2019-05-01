import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
	
		int number=in.nextInt();
	int c=number;	
    while(c>100)
    {
      c=c/10;
      
    }
    int d=c%10;
    System.out.println(d);
  }
}