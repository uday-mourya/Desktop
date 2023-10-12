class Test
{
  public int factorial(Test x)
  {
    int s;
    if(x=1)
     s=1; 
    else
     s=x*factorial(x-1);
     return s;
  }
  public static void main(String [] args)
  {
     Test ob =new Test();
     System.out.println(ob.factorial(6));
  }
  
}   
