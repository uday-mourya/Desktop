import java.util.Scanner;
class Test
{
  int count=0;
  public int prime(int x,int m)
  {
    //int count=0;
    if(m==1)
      return count;
    else if(x%m==0)
    {
      count++;
      return count;
    } 
    else
      this.prime(x,m-1);
    return count;
  }
  public static void main(String args[])
  {
    Test ob=new Test();
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter any number");
    int n=sc.nextInt();
    int m=n-1;
    int res=ob.prime(n,m);
    if(res==0)
      System.out.println("Prime No..");
    else
      System.out.println("Not Prime");
  }
}
