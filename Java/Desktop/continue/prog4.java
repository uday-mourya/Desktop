class Test
{
  public static void main(String args[])
  {
    int i,j;
    
    for(i=1;i<=2;i++)
    {
      for(j=1;j<=3;j++)
      {
        if(j==2)
          continue;
          System.out.println(i);
      }
    }
  }
}
