class Test
{
  public static void speri()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Square Side");
	  int a =sc.nextInt();
	  int s=4*a;
	  System.out.println(" Perimeter of Square"+s);
  }
 
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.speri();
   
   System.out.println("Main Method End");
  }
}
   
