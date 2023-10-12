class First
{
    public static void display()
    {
      System.out.println("Hello Display 1");
    }
    public static void show ()
    {
      System.out.println("Hello Show"); 
    }
    static
    { 
      System.out.println("Hello static block.........");
      First.display();
      First.show();
    }
}
  class Test
  { 
       public static void main(String [] args)
       {
          System.out.println("Hello Main Method.........");
       }
  
  }
   
