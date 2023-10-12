class Test
{
  public static void add()
  { 
  
    int a=100,b=50;
    int c=a-b;
    System.out.println("Substraction= "+c);
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.add();
 
   System.out.println("Main Method End");
  }
}
   
