class Test
{
  public static void natural()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int a=sc.nextInt();
    System.out.println("Enter Power");
    int b=sc.nextInt();
    int i=1;
    int pow=1;
    while(i<=b)
    {
     pow=pow*a;
     i++;
    }
    System.out.println("Power = "+pow);
  }
   public static void main(String []args)
   {
    System.out.println("Welcome to main Method....");
    Test.natural();
    System.out.println("Main Method End....");
   }
}  
