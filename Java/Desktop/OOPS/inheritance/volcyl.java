class Volume 
{
     float a,b;
     public void setData(float a,float b)
     {
          this.a=a;
          this.b=b;
          //System.out.println("this also calls");
     }
     public float a()
     {
          return this.a*this.a*this.b;
     }
}
class Cylinder extends Volume
{
     private float c=3.14f;
     public void setData(float a,float b,float c)
     {    
          this.setData(a,b);
          this.c=c;
          //System.out.println("this calls");
     }
     public float v()
     {
          return this.a()*this.c;
     }
}
class TestMain
{
     public static void main(String args[])
     {
        /* Square ob=new Square();
         ob.setData(2);
         System.out.print(" Square "+ob.sq());*/
         Cylinder ob2=new Cylinder();
         ob2.setData(4,5);
         System.out.println("Volume of Cylinder "+ob2.v());
     }
}
