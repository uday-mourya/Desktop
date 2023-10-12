abstract class Shape
{
	public abstract void area(); 
}
abstract class OneD extends Shape
{
	public abstract void area();
}
abstract class TwoD extends Shape
{
	double r;
	public TwoD()
	{
		
	}
	public TwoD(double r)
	{
	    this.r=r;
	}
	public abstract void area();
}
class Circle extends TwoD
{
	public Circle(double r)
	{
		super(r);
	}
	 public void area()
	{
		System.out.println("Area of Circle: "+3.14*r*r);
	}
}
class Square extends TwoD
{
	public Square(double r)
	{ 
	    super(r);
	}
	 public void area()
	{
		System.out.println("Area of Square: "+r*r);
	}
}
class Rectangle extends TwoD
{
	double l;
	public Rectangle(double r,double l)
	{
		super(r);
		this.l = l;
	}
	 public void area()
	{
		System.out.println("Area of Rectangle: "+l*r);
	}
}
class Triangle extends TwoD
{
    double b;
	public Triangle(double r,double b)
	{
		super(r);
		this.b = b;
	}
	 public void area()
	{
		System.out.println("Area of Trangle: "+(r*b)/2);
	}
}
abstract class ThreeD extends Shape
{
	double a;
	public ThreeD()
	{
		
	}
	public ThreeD(double a)
	{
		this.a=a;
	}
	public abstract void area();
}
class Cube extends ThreeD
{
	public Cube(double a)
	{
		super(a);
	}
	public void area()
	{
		System.out.println("------------------------------------");
		System.out.println("Area of cube: "+6*a*a);
	}
}
class Cuboid extends ThreeD
{
	double l,w;
	public Cuboid(double a,double l,double w)
	{
		super(a);
		this.l=l;
		this.w=w;
	}
	public void area()
	{
		System.out.println("Area of Cuboid: "+2*(l*w+l*a+a*w));
	}
}
class Cone extends ThreeD
{
	double l;
	public Cone(double a,double l)
	{
		super(a);
		this.l=l;
	}
	public void area()
	{
		System.out.println("Area of Cone: "+3.14*a*(a+l));
	}
}
class Main
{
	public static void main(String args[])
	{
		Shape ref;
		Circle ob = new Circle(5);
		ref=ob;
		ob.area();
		Square ob1 = new Square(7);
		ref=ob1;
		ob1.area();
		Rectangle ob2 = new Rectangle(5,3);
		ref=ob2;
		ob2.area();
		Triangle ob3 = new Triangle(8,2);
		ref=ob3;
		ob3.area();
		Cube ob4 = new Cube(6);
		ref=ob4;
		ob4.area();
		Cuboid ob5 = new Cuboid(2,3,4);
		ref=ob5;
		ob5.area();
		Cone ob6 = new Cone(9,7);
		ref=ob6;
		ob6.area();
	}
}
