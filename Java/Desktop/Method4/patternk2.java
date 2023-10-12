class Test
{
  public static void main(String [] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Number");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<=i;j++)
      {
        System.out.print("*");
      }
       System.out.println();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-i;j++)
      {
        System.out.print(" ");
      }
      for(int k=0;k<=i;k++)
      {
        System.out.print("*");
      } 
        System.out.println();
    }
    
  }  
}
