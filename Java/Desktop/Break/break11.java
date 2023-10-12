class Test
{
  public static void main(String args[])
  {
    int i,j;
    for(i=1;i<=4;i++)
    {
      for(j=1;j<=4;j++)
        {
          if(i*j>5)
          break;
        }
          System.out.println(i+"    "+j);
        
    }
  }
}
