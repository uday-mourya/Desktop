class Test
{
  public static void subs()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter first Number");
    int a=sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    int c=a-b;
    System.out.println("Substraction = "+c);
  }
  public static void show (Test k)
  {
    k.subs();
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.show(ob);  
   System.out.println("Main Method End");
  }
}
   
