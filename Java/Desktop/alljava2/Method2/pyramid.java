class Test
{
  public static void peri()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Number");
    int  a =sc.nextInt();
	int  i,j,k;
        for(i=1;i<=a;i++)
        {
          for(j=5;j>i;j--)
          {
             System.out.print(" ");
          }
            for(k=1;k<=i*2-1;k++)
             {
               System.out.print("*");
          
             } 
          System.out.println(" ");
        }  
        for(i=a;i>=1;i--)
        {
          for(j=5;j>i;j--)
          {
             System.out.print(" ");
          }
            for(k=1;k<=i*2-1;k++)
             {
               System.out.print("*");
          
             } 
          System.out.println(" ");
        }        
  }
 
  public static void main(String [] args)
  {  
    System.out.println("Welcome in main Method");
    Test ob =new Test();
    ob.peri();
   
   System.out.println("Main Method End");
  }
}
   
