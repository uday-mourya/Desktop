class Test
{ 
  public static void pattern()
  {
   for (int i=1;i<=4;i++)
   {
     for(int j=1;j<=i*2;j++)
     {
      System.out.print("*");
     }
     System.out.println();
   }
   for (int i=5;i>=1;i--)
   {
     for(int j=1;j<=i*2;j++)
     {
      System.out.print("*");
     }
     System.out.println();
   }
   
  }
   public static void main (String [] args )
   {
    Test ob =new Test();
    ob.pattern();
 
   }
}
