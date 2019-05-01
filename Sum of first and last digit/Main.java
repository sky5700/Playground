import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner scan=new Scanner(System.in);
      int f,l,c;
      int sum;
      c=scan.nextInt();
      f=c;
      while(f>=10)
      {
        f=f/10;
      }
      l=c%10;
       sum=f+l;
      System.out.println(sum);
	}
}