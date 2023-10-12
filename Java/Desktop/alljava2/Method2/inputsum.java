class Test
{
  public static void natural()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    
    int i=1;
    int sum=0;
    while(n>0)
    {
     int r=n%10;
     sum=sum+r;
     n=n/10;
    
    }
    System.out.println("Sum= "+sum);
  }
   public static void main(String []args)
   {
    System.out.println("Welcome to main Method....");
    Test.natural();
    System.out.println("Main Method End....");
   }
}  
