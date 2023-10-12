class Book
{ 
  int price;
  String name;
  Address add;
  public Book(int price,String name,int no,String line,String city)
  { 
     
     this.price=price;
       this.name=name;
         this.add=new Address(no,line,city);

  }
  void displayLibrary()
  {    
      System.out.println("PRICE   = " +this.price);
        System.out.println("NAME    = " +this.name); 
          this.add.displayAdd();
  }
}
class Address
{
   int no;
   String line,city;
   public Address(int no,String line,String city)
   {
     this.no=no;
       this.line=line;
         this.city=city;
   }
    public void displayAdd()
   {
     System.out.println("NO      = "+this.no);
       System.out.println("LINE    = "+this.line);
         System.out.println("CITY    = "+this.city);
   }
}
class Test
{
  public static void main(String [] args)
  {
    
     Book ob= new Book(600,"REACH DAD POOR DAD",90,"20","INDORE MP");
        ob.displayLibrary();
    
  }
}
      
