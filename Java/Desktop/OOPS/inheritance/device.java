class Test 
{
   public static void main(String[] args) 
   {
      Mobile ob=new Mobile();
      ob. setData("retail","uday infcom","56/3 vijay nagar Indore "," uday mourya","600 sqft."," samsung ","1/2 kg","white","15000");
ob.file();
   }
}
class Shop
{
   String type , name , address , owner , area ;
   public void setData(String type ,String name ,String address ,String owner ,String area)
 {
    this.type=type;
    this.name=name;
    this.address=address;
    this.owner=owner;
    this.area=area;
}
   public void data()
{
  System.out.println("\nstore :"+type+"\nname: "+name+"\naddress : "+address+"\nowner :"+owner+"\narea :"+area);       
}
}
class Mobile extends Shop
{
   private String brand;
   private String weight;
   private String color;
   private String price;
   
   public void setData(String type,String name,String address,String owner ,String area,String brand, String weight,String color,String price)
{
   this.setData(type,name,address,owner,area);
   this.brand=brand;
   this.weight=weight;
   this.color=color;
   this.price=price;
}
  public void file()
  {
     System.out.println(" Mobile " );
     System.out.println(" brand :"+brand+"\nweight :"+weight+"\ncolor :"+color+"\nprice :"+price);
     this.data();
  }
}
