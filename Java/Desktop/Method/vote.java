class Test
{
  public static void vote()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Your Age");
    int a=sc.nextInt(); 
    if(a<0)
      System.out.println("Invalid Age");
    else if(a>=18)
      System.out.println("You Are Eligible For Vote");
    else
      System.out.println("You Are Not eligible For Vote");  
  }
 
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.vote();
   
   System.out.println("Main Method End");
  }
}
   
