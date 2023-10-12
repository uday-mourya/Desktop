class Addition
{
    public void setData(int a,int b)
    {
       this.a=a; 
       this.b=b;
    }
    public void getData(int a,int b)
    {
       System.out.println("A="+this.a+"B="+this.b);
    }
    public int add()
    {
     int c=this.a+this.b;    
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      System.out.println("Welcome in main Method");
      Addition ob=new Addition();
      ob.setData(6,7);
      int res=ob.add();
      System.out.println("Addition = "+res);
    }
}
   
