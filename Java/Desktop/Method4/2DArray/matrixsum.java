class Test
{

  public int[] [] input(Test k)
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
          System.out.println("Actual metix");
         for(int i=0;i<m;i++)
         {
           for(int j=0;j<n;j++)
           {  
             System.out.print("\t"+a[i][j]); 
           }
           System.out.println(" "); 
         }
          k.sum(a,m,n);  
          return a; 
    }
     public int[][] sum(int a[] [],int m,int n)
     {    
         System.out.println("Sum of Matrix Element"); 
         int sum=0;
         for(int i=0;i<m;i++)
         {
           for(int j=0;j<n;j++)
           { 
             sum=sum+a[i] [j]; 
           } 
         }
        
       System.out.println("\t Matrix Sum = " +sum);
       return a;
      } 
  public static void main(String[]args)
   {
     Test ob=new Test();
     ob.input(ob);	
   }
}         
