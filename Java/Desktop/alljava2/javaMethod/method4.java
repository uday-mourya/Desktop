class Test
{
  public  void display()
  {
    System.out.println("Hello Display 1");
  }
  public static void show ()
  {
    System.out.println("Hello Show"); 
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.display();
   ob.show();
   
   System.out.println("Main Method End");
  }
}
   
