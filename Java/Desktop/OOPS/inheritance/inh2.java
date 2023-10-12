class Area
{
  protected int l,b;
  private int g;
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
   private int h;
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
class Test
{
  public static void main(String [] args)
  {
    
    Volume ob= new Volume();
    ob.setData(5,7,3);
    System.out.println("AREA = "+ob.a());
    System.out.println("VOLUME = "+ob.v());
    
  }
}

