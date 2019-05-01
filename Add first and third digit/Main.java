import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner scan=new Scanner(System.in);
      int n;
      int c;
      n=scan.nextInt();
      int a=n/100;
      int b=n%10;
      c=a+b;
      System.out.println(c);
	}
}