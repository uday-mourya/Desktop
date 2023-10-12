class Test
{
  public int add()
  {
    int x=76,y=8;
    return x+y;
  }
  
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in Main Method");
   Test ob=new Test();
   Test ob2=new Test();
   Test ob3=new Test();
   Test ob4=new Test();
   System.out.println(new Test());
   System.out.println(ob); 
   System.out.println(ob2);
   System.out.println(ob3);
   System.out.println(ob4);
  // System.out.println(ob.hashCode());
   System.out.println(new Test().add().hashCode());
   System.out.println("Main Method End");
  }
}           
