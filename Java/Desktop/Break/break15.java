class Test
{
  public static void main(String args[])
  {
    int i,j,k;
    
    for(i=1;i<=6;i++)
    {
      for(j=1;j<=6;j++)
      {
        for(k=1;k<=6;k++)
        {
          System.out.println(i+"  "+j+"  "+k);
          if(k<=2)
          break;
        }  
            if(j<=1)
            break;
      }      
    }        
          
        
      
    
  }
}
