import java.util.*;
class Main
{
  public static int result(int b, int e)
  {
    int s=1;
    for(int x=1;x<=e;x++)
    {
      s=s*b;
    }
    return s;
  }
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int b=scan.nextInt();
    int e=scan.nextInt();
    int r=result(b,e);
    System.out.println(r);
    
    
  }
}