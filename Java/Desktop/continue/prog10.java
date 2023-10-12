class Test
{
  public static void main(String args[])
  {
    int i,j,k;
    
    for(i=1;i<=4;i++)
    {
      for(j=1;j<=4;j++)
      {
        for(k=1;k<=4;k++)
        {
          System.out.println(i+"  "+j+"   "+k);
          if(k<=2)
          continue;
        }
        if(j<=3)
        continue;
      }
      if(i<=3)
      continue;
    }
  }
}
