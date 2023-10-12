class Peri
{
  int a;
  public void setData(int a)
  {
     this.a=a;
     
  }
  public int a()
  {
      return 4*this.a; 
  }
}
class Area extends Area
{
  // private int h;
   public void setData()
   {
     this.setData(a);
 
   }
   public int v()
   {
     return this.a*this.a;
   }
}
class Test
{
  public static void main(String [] args)
  {
    Area ob= new Area();
    ob.setData(5);
    System.out.println("PERIMETER OF SQUARE = "+ob.a());
    System.out.println("TOTAL SURFACE AREA OF SQUARE= "+ob.v());
    
  }
}

