class Area
{
  int l,b;
  public void setData(int l,int b)
  {
     this.l=l;
     this.b=b;
  }
  public int a()
  {
      return this.l*this.b; 
  }
}
class Volume extends Area
{
   int h;
   public void setData(int l,int b,int h)
   {
     this.setData(l,b);
     this.h=h;
   }
   public int v()
   {
     //return this.l*this.b*this.h;
     return this.a()*this.h;
   }
}
class Density extends Volume
{
   double m;
   public void setData(int l,int b,int h,double m)
   {
     this.setData(l,b,h);
     this.m=m;
   }
   public double d()
   {
     //return this.l*this.b*this.h;
     return this.m/this.v();
   }
}
class Test
{
  public static void main(String [] args)
  {
    
    Density ob= new Density();
    ob.setData(7,4,6,497.5);
    System.out.println("AREA    = "+ob.a());
    System.out.println("VOLUME  = "+ob.v());
    System.out.println("DENSITY = "+ob.d());
    
  }
}

