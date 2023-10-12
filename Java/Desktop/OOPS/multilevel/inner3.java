class Test
{ 
 
  String brand;
  String model;
  Info add;
  public Test(String brand,String model,String ram,String ssd,String processor)
  { 
     
     this.brand=brand;
       this.model=model;
         this.add=new Info(ram,ssd,processor);

  }
  void displayTes()
  {    
      System.out.println("BRAND   = " +this.brand);
      System.out.println("MODEL   = " +this.model); 
          this.add.displayInformation();
  }
}
class Info
{
   String  ram;
   String ssd;
   String processor;
   public Info(String ram,String ssd,String processor)
   {
     this.ram=ram;
       this.ssd=ssd;
         this.processor=processor;
   }
    public void displayInformation()
    {
      System.out.println("RAM       = "+this.ram);
      System.out.println("SSD       = "+this.ssd);
      System.out.println("PROCESSOR = "+this.processor);
    }
}
class Test1
{
  public static void main(String [] args)
  {
    
     Test ob= new Test("DELL","LATTITUDE 7400","16GB","1TB","I5 8th GENERATION");
     ob.displayTes();
    
  }
}
      
