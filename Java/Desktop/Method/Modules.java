class Test
{
  public static void mod()
  {
   java.util.Scanner sc=new java.util.Scanner(System.in);
  
    System.out.println("Enter First Number");
    int a =sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    
     int c=a%b;
     System.out.println("Modules= " +c);
   }
  public static void main(String [] args)
  { 
    System.out.println("Welcome to main Method ");
    Test.mod(); 
    System.out.println("Main Method End ");
  }  
}  
