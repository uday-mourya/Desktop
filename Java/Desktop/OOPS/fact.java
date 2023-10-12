class Addition
{  
    private int a,fact=1,i=1;
    public void setData(int a)
    {
       this.a=a; 
    }
    public void getData()
    {
       System.out.println("A="+this.a);
    }
    public int fact()
    {
      int n=this.a;
      while(i<=n)
      {
        fact=fact*i;
        i++;
      }
     return fact;    
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      System.out.println("Welcome in main Method");
      Addition ob=new Addition();
      ob.setData(5);
      int res=ob.fact();
      System.out.println("Factorial = "+res);
    }
}
   
