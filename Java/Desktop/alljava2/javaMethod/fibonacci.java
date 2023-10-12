class Test
{
  public static void fibo()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    
    int n1=-1,n2=1,n3=0;
    int i=1;
    while(i<=n)
    {
     n3=n1+n2;
     System.out.print(n3+ " ");
     n1=n2;
     n2=n3;
     i++;
    }
   
  }
   public static void main(String []args)
   {
    System.out.println("Welcome to main Method....");
    Test.fibo();
    System.out.println("Main Method End....");
   }
}  
