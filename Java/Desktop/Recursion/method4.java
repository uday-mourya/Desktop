class Test
{
    public void display()
    {
      System.out.println("Hello Display 1");
    }
    public void show ()
    {
      System.out.println("Hello Show"); 
    }
    public static void main(String [] args)
    {
      System.out.println("Hello Main Method.........");
    }
    static
    { 
      System.out.println("Hello static block.........");
      new Test().display();
      new Test().show();
    }
} 
   
