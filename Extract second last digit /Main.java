import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here   
      Scanner scan=new Scanner(System.in);
      int a,n;
      n=scan.nextInt();
      a=(n%100)/10;
      System.out.println(a);
	}
}