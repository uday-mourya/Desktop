class Test
{
  public static void main(String args[])
  {
    int i,j;
    for(i=1;i<=4;i++)
    {
      for(j=1;j<=8;j++)
      {
        System.out.println(i+"  "+j);
          if(j>=4)
          break;
      }
    }
  }
}
