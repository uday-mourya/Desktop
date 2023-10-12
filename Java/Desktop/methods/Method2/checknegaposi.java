class Test
{
  public static void multi()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Any Number");
    int z=sc.nextInt();
    if(z>0)
       System.out.println("No. is positive");
    else
      System.out.println("No. is Negative");   
  }
   public void check(Test k)
   {
     k.multi();
   }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.check(ob);
   
   System.out.println("Main Method End");
  }
}
   
