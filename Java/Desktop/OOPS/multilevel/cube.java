class perimeter
{
  double a;
  public void setData(double a)
  {
     this.a=a;
     
  }
  public double p()
  {
      return 4*this.a; 
  }
}
class Tsa extends perimeter
{
   public void setData(double a)
   {
     this.setData(a);
    
   }
   public double tsa()
   {
     //return this.l*this.b*this.h;
     return 6*this.a;
   }
}
class Volume extends  Tsa
{
   
   public void setData(double a)
   {
     this.setData(a);
     
   }
   public double v()
   {
     //return this.l*this.b*this.h;
     return this.a*this.a*this.a;
   }
}
class Test
{
  public static void main(String [] args)
  {
    
    Volume ob= new Volume();
    ob.setData(10.0);
    System.out.println(".....CUBE.....");
    System.out.println("PERIMETER = "+ob.p());
    System.out.println("TSA       = "+ob.tsa());
    System.out.println("VOLUME    = "+ob.v());
    
  }
}

