class Test
{   
    public void show ()
    {
      int x=100;
      {
        
        int x=150;
        System.out.println("x = "+x );
      }
      System.out.println("x = "+x); 
      this.display(x);
      
    }  
   public  void display(int x)
   {
     {
       int x=34;
       System.out.println("X = "+x);
     }
     System.out.println("X = "+x);
    }
  
  public static void main(String [] args)
  {
     System.out.println("Welcome in main Method");
     Test ob =new Test();
     ob.show();
     System.out.println("Main Method End");
  }
}
   
