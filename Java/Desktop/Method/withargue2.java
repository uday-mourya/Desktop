class Test
{
  public void display(Test k)
  { 
   int a=8;
    System.out.println("Hello Display 1");
    System.out.println("++++++++++++++++++++++");
    System.out.println("A="+a);
    k.show();
  }
  public static void show ()
  {
    System.out.println("Hello Show"); 
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.display(new Test());
   ob.show();
   
   System.out.println("Main Method End");
  }
}
   
