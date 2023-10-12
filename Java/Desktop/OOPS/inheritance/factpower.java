class Fact
{
  int x;
  public void setData(int x)
  {
     this.x=x;  
  }
  public int a()
  {   
      int fact=1;
      for(int i=1;i<=this.x;i++)
      {
        fact=fact*i;
      }
      return fact; 
  }
}
class Power extends Fact
{
   private int y;
   public void setData(int x,int y)
   {
      this.setData(x);
      this.y=y;
   }
   public int v()
   { 
      int pow=1;
      for(int i=1;i<=this.y;i++)
      {
         pow=pow*this.x;
      }
      return pow; 
      //return Math.pow(this.x,this.y);
   }
}
class Test
{
  public static void main(String [] args)
  {
     Power ob= new Power();
     ob.setData(5,5);
     System.out.println("FACT= "+ob.a());
     System.out.println("POWER= "+ob.v());
    
  }
}

