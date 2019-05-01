import java.util.Scanner;
class Main{
  public static void  prime(int n)
  {
    
    for(int i=2;i<=n;i++)
    {
        int count=0;
      for(int j=2;j<=i;j++)
      {
        if(i%j==0)
        {
          count++;
        }
    
      }
    
          if(count==1)
     {
      System.out.println(i);
     }
        
    }
  // return 0;
  }
	public static void main (String[] args){
	    // Type your code here
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
     prime(n);
      //System.out.println(r);
	}
}