class Test
{
  public static void main(String args[])
  {
    int i,j;
    
    for(i=1;i<=10;i++)
    {
      for(j=8;j<=10;j++)
      {
        System.out.println(i+"  "+j);
        if(i<=7)
        continue;
      }
    }
  }
}
