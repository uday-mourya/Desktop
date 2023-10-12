import java.util.Scanner;
class Test
{
  int count=0;
  public int test(int x)
  {
    //int count=0;
    int m;
    if(m==1)
      return count;
    else if(x%m==0)
    {
      count++;
      return count;
    } 
    else
      this.test(x,m/10);
    return count;
  }
  public static void main(String args[])
  {
  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
    //int m=n;
    Test ob=new Test();
    int res=ob.test(n);
    System.out.println(res);
    
  }
}
