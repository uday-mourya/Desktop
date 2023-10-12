class Test
{
  public static void main(String args[])
  {
    int i,j,k;
    
    for(i=1;i<=5;i++)
    {
      for(j=1;j<=3;j++)
      {
        for(k=1;k<=2;k++)
        {
          if(i<=3)
          continue;
          System.out.println(i+"   "+j+"   "+k);
        }
      }
    }
  
  }
}
