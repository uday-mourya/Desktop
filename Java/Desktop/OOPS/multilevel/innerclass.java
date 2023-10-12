class Student
{ 
  int rollno;
  String name;
  Address add;
  public Student(int rollno,String name,int hno,String city,String state)
  {
     this.rollno=rollno;
     this.name=name;
     add=new Address(hno,city,state);

  }
  void displayStud()
  {    
      System.out.println("ROLL NO. = " +this.rollno);
      System.out.println("NAME     = " +this.name); 
      this.add.displayAdd();
  }
}
class Address
{
   int hno;
   String city,state;
   public Address(int hno,String city,String state)
   {
     this.hno=hno;
     this.city=city;
     this.state=state;
   }
    public void displayAdd()
   {
     System.out.println("HNO      = "+this.hno);
     System.out.println("CITY     = "+this.city);
     System.out.println("STATE    = "+this.state);
   }
}
class Test
{
  public static void main(String [] args)
  {
    
    Student ob= new Student(101,"UDAY",104,"INDORE","MP");
    ob.displayStud();
    
  }
}

