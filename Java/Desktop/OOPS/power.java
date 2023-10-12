class Power
{  
    private int a,b,pow=1,i=1;
    public void setData(int a,int b)
    {
       this.a=a; 
       this.b=b;
    }
    public void getData()
    {
       System.out.println("A="+this.a+ "B = "+this.b);
    }
    public int power()
    {
      int x=this.a;
      int y=this.b;
      while(i<=y)
      {
        pow=pow*this.a;
        i++;
      }
     return pow;    
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      System.out.println("Welcome in main Method");
      Power ob=new Power();
     /* System.out.println("Enter First Number");
      int a=sc.nextInt();
      Sytsem.out.println("Enter Second Number");
    */ int b=sc.nextInt();
      ob.setData(5,5);
      int res=ob.power();
      System.out.println("Power = "+res);
    }
}
   
