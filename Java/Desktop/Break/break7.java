class Test
{
  public static void main(String args[])
  {
    int i=1;
    for(i=1;;)
    {
      System.out.println(i++);
      if(i>=10)
      {
        break;
        continue;
        System.out.println(i++);
      }
    }
  }
}
