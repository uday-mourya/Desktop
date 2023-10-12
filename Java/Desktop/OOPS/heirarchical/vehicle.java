class Automobile
{
  String name;
  int gear;
  int price;
  public void setdata(String name,int gear,int price)
  {
     this.name=name;
     this.gear=gear;
     this.price=price;
  }
}
class Innova extends Automobile
{
   String engine;
   public void setdata(String engine,String name,int gear,int price)
   {
     this.setData(String name,int gear,int price)
     this.engine=engine;
   }  
}
class Stroke extends Innova
{
   String stroke;
   public void setdata(String engine,String name,int gear,int price)
   {
     this.setData(String engine,String name,int gear,int price)
     this.stroke=stroke;
   }  
}
class U extends innova
{ 
   public static void main (String[] args)
   {
     Stroke ob=new Stroke();
     System.out.println("NAME = ");
     System.out.println
   }
}
