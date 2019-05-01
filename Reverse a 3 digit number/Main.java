import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int a,b,s,c,d;
    a=n%10;
    s=n/10;
    b=s%10;
    c=n/100;
    d=(a*100)+(b*10)+c;
    System.out.println(d);
    //Type your code here
  }
}