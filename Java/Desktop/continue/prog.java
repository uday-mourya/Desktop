class Test
{
  public static void main(String args[])
  {
    int i,j;
    
    for(i=0;i<=4;i++)
    {
      for(j=0;j<=4;j++)
      {
        if(i*j<5)
          continue;
          System.out.println(i+"  "+j);
      }
    }
  }
}
