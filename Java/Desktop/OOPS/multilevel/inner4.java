class Student
{ 
  int rollno;
  String name;
  Address add;
  public Student(int rollno,String name,String center,int roomno,int desk)
  {
     this.rollno=rollno;
     this.name=name;
     add=new Address(center,roomno,desk);

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
   String center;
   int roomno;
   int desk;
   public Address(String center,int roomno,int desk)
   {
     this.roomno=roomno;
     this.center=center;
     this.desk=desk;
   }
    public void displayAdd()
   {
     System.out.println("ROOMNO   = "+this.roomno);
     System.out.println("CENTER   = "+this.center);
     System.out.println("DESK     = "+this.desk);
   }
}
class Test
{
  public static void main(String [] args)
  {
    
    Student ob= new Student(2103,"UDAY","RENNAISSANCE COLLEGE",10,4);
    ob.displayStud();
    
  }
}

