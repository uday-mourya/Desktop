class Test
{   
    public void show (Test k)
    {
      int x=100,y=200;
      System.out.println("Before Swap X = "+x+ " Y = "+y); 
      k.display(x,y);
      
    }  
   public  int  display(int x,int y)
   {
      int temp;
      temp=x;
      x=y;
      y=temp;
      System.out.println("After Swap X = "+x+ " Y = "+y);
      return temp;
    }
  
  public static void main(String [] args)
  {
     System.out.println("Welcome in main Method");
     Test ob =new Test();
     ob.show(ob);
     System.out.println("Main Method End");
  }
}
   
