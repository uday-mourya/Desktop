class Test
{
  public static void patt()
  { 
   int fact =1;
   for(int i=1;i<=5;i++)
   {
        fact=fact*i;
   
     for(int j=1;j<=fact;j++)
     {
       System.out.print("*");
     }
      System.out.println();
    }
     
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.patt();
 
   System.out.println("Main Method End");
  }
}
   
