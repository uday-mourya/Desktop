class Test
{
  public static void main(String[]args)
   {
	java.util.Scanner sc=new java.util.Scanner(System.in);
        int a[] []=new int[5] [5];
        System.out.println("Enter Row");
        int m =sc.nextInt();
        System.out.println("Enter Column");
        int n =sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
          { 
            a[i][j]=sc.nextInt(); 
          }
        }
          System.out.println("Lower Triangular metrix");
         for(int i=0;i<m;i++)
        {
         for(int j=0;j<=i;j++)
          { 
            System.out.print("\t"+a[i][j]); 
          }
           System.out.println(" "); 
        }
         System.out.println("Lower Triangular sum");
         int sum=0;
         for(int i=0;i<m;i++)
        {
         for(int j=0;j<=i;j++)
          { 
            sum=sum+a[i] [j]; 
          } 
        }
        System.out.println("\t Matrix Sum = " +sum);
}
}         
