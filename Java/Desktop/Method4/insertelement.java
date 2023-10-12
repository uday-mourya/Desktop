class Test
{
  public void insert()
  {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int a[]=new int [10];
     System.out.println("How Many Element You Wants to Elements ");
     int n=sc.nextInt();
     int i,j;
     System.out.println("Enter Array Elements");
     
     for (i=0;i<n;i++)
     {
         System.out.print("a["+i+"] =");
         a[i]=sc.nextInt();
     }
     System.out.println("Before Array Elements Are");
     for (i=0;i<n;i++)
     {       
        System.out.println("a["+i+"] ="+a[i]);
     }
      // int m,p;
       System.out.println("Enter Element You Wants To Entered");
       int m=sc.nextInt();
       System.out.println("Enter Index");
       int p=sc.nextInt();
       
       for(i=n;i>p;i--)
       {
        a[i]=a[i-1];
        
       }
       a[p]=m;
       System.out.println("Before Array Elements Are");
       for (i=0;i<=n;i++)
       {
         
           System.out.println("a["+i+"] ="+a[i]);
       }
  }

      public static void main(String [] args)
      {
        new Test().insert();
      }
}         
