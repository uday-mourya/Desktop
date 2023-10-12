class Test
{
  public void div()
  {
   java.util.Scanner sc=new java.util.Scanner(System.in);
  
    System.out.println("Enter First Number");
    int a =sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    
     int c=a/b;
     System.out.println("Division = " +c);
   }
   public void check(Test k)
   {
     k.div();
   }
  public static void main(String [] args)
  { 
    System.out.println("Welcome to main Method ");
    Test ob =new Test();
    ob.check(ob); 
    System.out.println("Main Method End ");
  }  
}  
