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
          System.out.println("\tActual metix");
        for(int i=0;i<m;i++)
        {
         for(int j=0;j<n;j++)
          { 
            System.out.print("\t"+a[i][j]); 
          }
           System.out.println(" "); 
        }
        System.out.println("pattern");
        for(int i=0;i<m;i++)
        {
         for(int j=0;j<n;j++)
          { 
            if(i==j||j==n/2||i+j==n-1)
            {
             System.out.print("\t"+a[i][j]); 
            }
            else
               System.out.print("\t");
          } 
            System.out.println( ); 
        }
        
       
}
}        
