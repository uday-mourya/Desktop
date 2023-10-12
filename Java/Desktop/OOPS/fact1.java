class Factorial
{  
    private int n;
    public void setData(int n)
    {
       this.n=n;       
    }
    public void getData()
    {
       System.out.println("Number = "+this.n);
    }
    public int fact()
    {
      int i,f;
      for(i=1,f=1;i<=this.n;f=f*i,i++);
      return f;    
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      System.out.println("Welcome in main Method");
      Factorial ob=new Factorial();
      ob.setData(6);
      int res=ob.fact();
      System.out.println("Factorial = "+res);
    }
}
   
