class Test
{
  public static void main(String [] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Number");
    int a=sc.nextInt();
    for(int i=a;i>1;i--)
     {
      for(int j=a;j>i;j--)
      {
        System.out.print(" ");
      }
            
      for(int k=1;k<=i;k++)
      {
        System.out.print(i);
      }
      System.out.println();
    } 
  } 
} 
