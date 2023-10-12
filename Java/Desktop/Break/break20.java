class Test
{
  public static void main(String args[])
  {
    int i,j;
    for(i=1;i<=4;i++)
    {
      for(j=1;j<=8;j++)
      {
          if((j>=2&&i==3)||(i==1&&j==2))
          break;
          System.out.println(i+"  "+j);
      }
    }
  }
}
