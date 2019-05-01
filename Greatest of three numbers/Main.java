import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan=new Scanner(System.in);
      int a,b,c;
      a=scan.nextInt();
       b=scan.nextInt();
       c=scan.nextInt();
       if(a>b&&a>c) 
       {
         System.out.println(a);
       }
        else if(b>a&&b>c) 
       {
         System.out.println(b);
       }
       else if(c>a&&c>b) 
       {
         System.out.println(c);
       }
    }
}