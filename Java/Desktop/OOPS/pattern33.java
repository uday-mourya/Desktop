class Test
{
  public static void main(String [] args)
  {
    int n=5;
    for(int i=n;i>=1;i--)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }     
     /*  for(int k=5;k>=i;k--)
       {
         System.out.print("*");  
       }*/
        System.out.println();
    }        
  }
}
