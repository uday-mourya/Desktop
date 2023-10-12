class Test
{
  public static void area()
  { 
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("Enter Square Side");
     int a =sc.nextInt();
     int s=a*a;
     System.out.println(" Area of Square is "+s);
  }
   public void show(Test k)
   {
     k.area(); 
   }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.show(ob);
    
   System.out.println("Main Method End");
  }
}
   
