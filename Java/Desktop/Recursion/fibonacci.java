class Test
{
  public int fibo(int n)
  {   
    int s;
    if(n<=1)
     s=n; 
    else 
     s=fibo(n-1)+fibo(n-2);
    return s;
  }
  public static void main(String [] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Number");
    int n=sc.nextInt();
    Test ob =new Test();
    for(int  i=0;i<n;i++)
    {
      System.out.print(ob.fibo(i)+ " " );
    }
  }
}   
