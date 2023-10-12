class Area
{
  int a;
  public void setData(int a)
  {
     this.a=a;
     
  }
  public int a()
  {
      return 6*this.a*this.a; 
  }
}
class Volume extends Area
{
  // private int h;
   public void setData()
   {
     this.setData(a);
 
   }
   public int v()
   {
     return this.a*this.a*this.a;
   }
}
class Test
{
  public static void main(String [] args)
  {
    Volume ob= new Volume();
    ob.setData(5);
    System.out.println("PERIMETER OF CUBE = "+ob.a());
    System.out.println("VOLUME OF CUBE= "+ob.v());
    
  }
}

