class First
{
    public void display()
    {
      System.out.println("Hello Display 1");
    }
    public void show ()
    {
      System.out.println("Hello Show"); 
    }
  
}
class Test
  { 
     public static void main(String [] args)
     {
       System.out.println("Hello Main Method.........");
       First ob =new First();
       ob.display();
       ob.show();
       
     }
    
  }
   
