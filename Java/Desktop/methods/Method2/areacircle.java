class Test
{
  public static void area()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter RADIUS");
	  float a =sc.nextFloat();
	  float s=3.14f*a*a;
	  System.out.println("Area Of circle is : "+s);
  }
  public void check(Test k)
   {
     k.area();
   }
  public static void main(String [] args)
  {  
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.check(ob);
   
   System.out.println("Main Method End");
  }
}
   
