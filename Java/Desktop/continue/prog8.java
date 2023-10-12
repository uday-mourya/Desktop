class Test
{
  public static void main(String args[])
  {
    int i,j;
    
    for(i=1;i<2;i++)
    {
      for(j=1;  ;j++)
      {
        System.out.println(i+"  "+j);
        if(i>8)
        continue;
      }
    }
  }
}
