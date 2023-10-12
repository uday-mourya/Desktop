class Test
{
  public int display(Test x)
  { 
     if(x>=1)
     {
       this.display(x-1);
       System.out.println(x);
     } 
     return x;
  }
  public static void main(String [] args)
  { 
    Test ob =new Test();
    ob.display(100);
  }
  
}   
