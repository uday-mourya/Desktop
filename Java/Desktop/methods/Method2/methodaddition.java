class Test
{
  public static void add()
  { 
  
    int a=100,b=100;
    int c=a+b;
    System.out.println("Addition = "+c);
  }
  public static void show (Test b)
  {
    b.add(); 
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   //ob.add();
   ob.show(ob);
   
   System.out.println("Main Method End");
  }
}
   
