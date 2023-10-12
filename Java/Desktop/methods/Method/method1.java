class Test
{
  public static void display()
  {
    System.out.println("Hello Display 1");
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test.display();
   display();
   System.out.println("Main Method End");
  }
}
   
