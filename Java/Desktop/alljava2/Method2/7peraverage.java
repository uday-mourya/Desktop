class Test
{
  public static void multi(Test k)
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter first person age");
    int a=sc.nextInt();
    System.out.println("Enter Second person age");
    int b=sc.nextInt();
    System.out.println("Enter Third person age");
    int c=sc.nextInt();
    System.out.println("Enter Fourth person age");
    int d=sc.nextInt();
    System.out.println("Enter fifth person  age");
    int e=sc.nextInt();
    System.out.println("Enter Six person age");
    int f=sc.nextInt();
    System.out.println("Enter seven person age");
    int g=sc.nextInt();
    
    int av=(a+b+c+d+e+f+g)/7;
    System.out.println("Average = "+av); 
    k.show();
  }
   public void show()
   {
     System.out.println("Hello Show ");
   }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.multi(ob);
   
   System.out.println("Main Method End");
  }
}
   
