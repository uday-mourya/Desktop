class Test
{
  public static void natural()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    int i=1;
    int fact=1;
    while(i<=n)
    {
     fact=fact*i;
     System.out.print(i);
     if(i<n)
       System.out.print("*");
     i++;
    }
    System.out.println("="+fact);
  }
   public static void main(String []args)
   {
    System.out.println("Welcome to main Method....");
    Test.natural();
    System.out.println("Main Method End....");
   }
}  
