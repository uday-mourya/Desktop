class Test
{
  public static void main(String [] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Number");
    int a=sc.nextInt();
    for(int i=1;i<=a;i++)
     {
      for(int j=1;j<=i;j++)
      {
        System.out.print(" ");
      }
            
      for(int k=a;k>=i;k--)
      {
        System.out.print(i);
      }
      System.out.println();
    } 
 } 
} 
