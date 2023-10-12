class Peri
{
  int r;
  public void setData(int r)
  {
     this.r=r;
     
  }
  public double a()
  {
      return 2.0*3.14*this.r; 
  }
}
class Area extends Peri
{
  // private int h;
   public void setData()
   {
     this.setData(r);
 
   }
   public double v()
   {
     return 3.14*this.r*this.r;
   }
}
class Test
{
  public static void main(String [] args)
  {
    Area ob= new Area();
    ob.setData(5);
    System.out.println("PERIMETER OF CIRCLE = "+ob.a());
    System.out.println("TOTAL SURFACE T.S.AREA OF CIRCLE= "+ob.v());
    
  }
}

