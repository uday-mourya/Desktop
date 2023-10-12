class Test
{
  public void patt()
  { 
   
   for(int i=1;i<=5;i++)
   {
     for(int j=1;j<=5;j++)
     {
       if(i==1||j==1||i==5||j==5)
         System.out.print("*");
       else
        System.out.print(" ");
     }
      System.out.println();
   }
    //i==1&&j<=5||i==5&&j<=5||j==5&&i!=5 
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.patt();
 
   System.out.println("Main Method End");
  }
}
   
