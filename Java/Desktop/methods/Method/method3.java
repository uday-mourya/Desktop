class Test
{ 
  static
  {
    System.out.println("Hello static Block....");
    
    Test.display();
    Test.show();
  }
  public static void display()
  {
    System.out.println("Hello Display 1");   
  }
  public static void show ()
  {
    System.out.println("Hello Show"); 
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method....");
   
   System.out.println("Main Method End...");
  }
}
   
