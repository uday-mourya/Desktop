class Greatest
{  
    private int a,b,c,d;
    public void setData(int a,int b,int c,int d)
    {
       this.a=a; 
       this.b=b;
       this.c=c; 
       this.d=d;
    }
    public void getData()
    {
       System.out.println("A="+this.a+"B="+this.b);
    }
    public void gr()
    {
       if(a>b&&a>c&&a>d) 
          System.out.println("A is greatest");
       else if (b>c&&b>d)
          System.out.println("B is Greatest");
       else if (c>d)
          System.out.println("C is Greatest");
       else 
          System.out.println("D is Greatest");      
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      System.out.println("Welcome in main Method");
      Greatest ob=new Greatest();
      ob.setData(6,7,12,7);
      ob.gr();
      
    }
}
   
