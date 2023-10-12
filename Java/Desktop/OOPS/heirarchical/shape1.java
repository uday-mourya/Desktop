class Testmain
{
    public static void main(String [] args)
    {
    
      Shape ref;
    
    }
}
abstract class Shape
{
  int name;
  double side;
  abstract double area();
  public Shape(double side)
  {
    //this.name=name;
    this.side=side;
  }
  public double getside()
  {
  
    return side;
  
  }
  public void display()
  {
    System.out.println("SIDE = "+this.side);
  
  }
}
class Twod extends Shape
{
  double perimeter;
  public Twod(double side )
  {
      super(side);

  }
  abstract public double perimeter();
}
class Oneside extends Twod
{
   public Oneside(double side)
    { 
       super(side);
   
    }
}
class circle extends Oneside
{
  public circle(double side)
  {
  
    super(side);
  
  }
  public void perimeter()
  {
    System.out.println(3.14*this.getside()*this.getside());
  
  }
  public void area()
  {
    System.out.println(2*3.14*this.getside());
  
  }
}
class  Equilateral extends oneside
{


}
class Square extends Twod
{
   public Square(double side)
   {
     super(side);
   }
   public void perimeter()
   {
     System.out.println(4*this.getside());
   
   }
   public void area()
  {
    System.out.println(this.getside()*this.getside());
  
  }
}
class Hexagone extends Twod
{
  public Hexagone(double side)
  {
    super(side); 
  
  }
  public void perimeter()
   {
     System.out.println(6*this.getside());
   
   }
   public void area()
   {
   
   
   }
class Twoside extends Twod
{  
   public Twoside(double side2,double side)
   {
     super(side);
     this.side2=side2;
   }
   public double getSide2()
   {
     return this.side2;
   }
   /*public Twoside(double side)
   {
     super(side);
    
   }*/
}
class Rectangle extends Twoside
{  
   public Rectangle(double side,double side2)
   {
      super(side2);
   }
   public void perimeter()
   {
     system.out.println(2*(side2+side));
   
   } 
   public void area()
   {
     System.out.println(side2*side);
   } 
}
class Isoceles extends Twoside
{
  public Isoceles(double side,double side2)
  {
    super(side2);
  
  }
  public void area()
  {
    System.out.println(1/2*this.getside*this.getside2);
  
  }
}  
class Parallelogram extends Twoside
{
   public Parallelogram(double side,double side2)
   {
      super(side2);   
   
   }
   public double perimeter()
   {
     return 2*(this.getSide+getside2);
   }
   public double area()
   {
     return this.getside()*this.getside2();
   }  
} 
class Rhombus extends Twosides
{
   public Rhombus(double side2)
   {
     super(super2);
   }
}
class Threeside extends shape
{ 
   double side3;
   public Threeside(double side,double side2,double side3)
   {
     super(side,side2,side3);
   }
   

}
} 
