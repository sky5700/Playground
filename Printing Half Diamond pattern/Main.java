import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
      {
        for(j=n;j>i;j--)
        {
          System.out.print(" ");
        }
        for(k=2*i-1;k>=1;k--)
        {
           System.out.print("*"); 
        }
          System.out.print("\n");
      }
	}
}