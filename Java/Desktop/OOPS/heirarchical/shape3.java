import java.util.Scanner;
abstract class Shape 
{
    private double a;
	//Private String name;
    public Shape(double a) 
    {
        this.a=a;       
    }
    public abstract double area();
    public double getA()
    {
        return a;
    }

}
abstract class TwoD extends Shape 
{
    public TwoD(double a) 
    {

        super(a);
    }
	public abstract double perimeter();
    
}

abstract class OneSide extends TwoD
{
    public OneSide(double a)
    {
        super(a);
    }
    public abstract double area();
    public abstract double perimeter();

}

class Square extends OneSide
{
    public Square(double a) 
    {
        super(a);
    }

    public double area()
    {
        return super.getA() * super.getA();
    }

    public double perimeter()
    {
        return 4 * getA();
    }
}           

class Equilateral extends OneSide
{
    public Equilateral(double a)
    {
        super(a);
    }
    public double area()
    {
        //(√3/4)a²
        return (1.732/4)*super.getA()*super.getA();
    }
    public double perimeter()
    {
        return 3*super.getA();
    }
    
}
class Circle extends OneSide 
{

    public Circle(double a) 
    {
        // Constructor for the Circle class
        super(a);
    }

    public double area() {
        return 3.14*super.getA()*super.getA();
    }

    public double perimeter() {
        return 2*3.14*super.getA();
    }
}
class Hexagone extends OneSide
{
    public Hexagone(double a)
    {
        super(a);
    }
    public double area()
    {
        
        return ((3*1.732)/2)*super.getA()*super.getA();
    }
    public double perimeter()
    {
        return 6*super.getA();
    }

}
//____
abstract class Twoside extends TwoD
{



    private double b;
    public Twoside(double a,double b)
    {
        super(a);
        this.b=b;  
    }
    public double getB()
    {
        return this.b;
    }
}
class isosceles extends Twoside
{
    public isosceles(double a,double b)
    {
        super(a,b);
    }
    public double area()
    {
        return (super.getA()*super.getB())/2;
    }
    public double perimeter()
    {
        return 2*super.getA()+super.getB();
    }
}
class Rectangle extends Twoside 
{
    public Rectangle(double a, double b) {
        super(a,b);
        
    }
    public double area() 
    {
        return super.getA() * super.getB();
    }

    public double perimeter() 
    {
        return 2 * (super.getA() + super.getB());
    }
}
class RightT extends Twoside
{
    public RightT(double a,double b)
    {
        super(a,b);
    }
    public double area()
    {
        return (super.getA()*super.getB())/2;
    }
    public double perimeter()
    {
       // a+b+Square Root of a +Square Root ob B
       //return super.getA()+super.getB()+Math.Sqrt(super.getA()*super.getA())+math.Sqrt(super.getB()*super.getB());
        return 1.0;
    }
}
class Pallerogram extends Twoside
{
    public Pallerogram(double a,double b)
    {
        super(a, b);
    }
    public double area()
    {
        return super.getA()*super.getB();
    }
    public double perimeter() 
    {
        return 2 * (super.getA() + super.getA());
    }
}
class Rombus extends Twoside
{
    public Rombus(double a, double b)
    {
        super(a, b);
    }
    public double area()
    {
        return (super.getA()*super.getB())/2;
    }
    public  double perimeter()
    {
        return 4*super.getA();
    }
}

abstract class ThreeSide extends TwoD
{
    private double d;
    private double c;
    public ThreeSide(double a,double d,double c)
    {
        super(a);
        this.d=d;
        this.c=c;
    }
    public double getC()
    {
        return this.c;
    }
    public double getD()
    {
        return this.d;
    }

}

class Trapezium  extends ThreeSide
{
   public Trapezium (double a,double d,double c)
    {
       super(a, d, c);
    }
    public double area()
    {
       return (super.getA()+super.getD()/2)*super.getC();
    }
   public double perimeter()
    {
       return super.getA();
    }

}

class ScaleneTringle extends ThreeSide
{
    
    public ScaleneTringle(double a,double d,double c)
    {
        super(a,d,c);
    }
    
    public double area()
    {
        return (getA()*getD())/2;
    }
    public double perimeter()
    {
        return getA()+getD()+getC();
    }
    
}
abstract class ThreeD extends Shape 
{
    public ThreeD(double a) 
	{
        super(a);
    }

    public abstract double area();

    public abstract double volume();
}
abstract class OneS extends ThreeD
{
    public OneS(double a)
    {
        super(a);
    }
     public abstract double  area();
    public abstract double volume();

}
class Cube extends OneS
{
    public Cube(double a)
    {
        super(a);
    }
    public double  area()
    {
        return 6*getA()*getA();
    }
    public double volume()
    {
        return getA()*getA()*getA();
    }
    
}
class Sphere extends OneS
{
    public Sphere(double a)
    {
        super(a);
    }
    public double  area()
    {
        return 4*3.14*getA()*getA();
    }
    public double volume()
    {
        return 4/3*(3.14*getA()*getA()*getA());
    }
    
}
class HemiSphere extends OneS
{
    public HemiSphere(double a)
    {
        super(a);
    }
    public double  area()
    {
        return 3*3.14*getA()*getA();
    }
    public double CurvedArea()
    {
        return 2*3.14*getA()*getA();
    }
    public double volume()
    {
        return 2/3*(3.14*getA()*getA()*getA());
    }
    
}
abstract class TwoS extends ThreeD
{
    private double e;
    public TwoS(double a,double e)
    {
        super(a);
        this.e=e;
    }
    public double getE()
    {
        return this.e;
    }
}
class Cylinder extends TwoS
{

    public Cylinder(double a,double e)
    {
        super(a, e);
    }
    public double  area()
    {
        return 2*3.14*getA()*getE()+2*3.14*getA()*getA();
    }
    public double CurvedArea()
    {
        return 2*3.14*getA()*getE();
    }
    public double volume()
    {
        return 3.14*getA()*getA()*getE();
    }
    
}
abstract class ThreeS extends ThreeD
{
    private double f;
    private double g;
    public ThreeS(double a,double f,double g)
    {
        super(a);
        this.f=f;
        this.g=g;
    }
    public double getF()
    {
        return this.f;
    }
    public double getG()
    {
        return this.g;
    }
}

class Cuboid extends ThreeS
{
    public Cuboid(double a,double f,double g)
    {
        super(a, f, g);
    }
    public double  area()
    {
        return 2*getA()*getF()+2*getA()*getG()+2*getF()*getG();
    }
    public double volume()
    {
        return getA()*getF()*getG();
    }

}
// class Cone extends ThreeS
// {
//     public Cone()
// }
//     public double  Area() {
//         double baseArea = 3.14  radius  radius;
//         double aArea = 3.14  radius  (radius + Math.sqrt(height  height + radius  radius));
//         return baseArea + aArea;
//     }


class Test
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Square square = new Square(5.0);
        System.out.println("Area of Square: " + square.area());
        System.out.println("Perimeter of Square: " + square.perimeter());
        System.out.println("----------------------------------------------");

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5.0);
        System.out.println("Area of Equilateral Triangle: " + equilateralTriangle.area());
        System.out.println("Perimeter of Equilateral Triangle: " + equilateralTriangle.perimeter());
        System.out.println("----------------------------------------------");

        Circle circle = new Circle(3.0);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Perimeter of Circle: " + circle.perimeter());
        System.out.println("----------------------------------------------");

        Hexagone hexagon = new Hexagone(6.0);
        System.out.println("Area of Hexagon: " + hexagon.area());
        System.out.println("Perimeter of Hexagon: " + hexagon.perimeter());
        System.out.println("---------------------------------------------");

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
        System.out.println("---------------------------------------------");

        RightTringle rightTriangle = new RightTringle(3.0, 4.0);
        System.out.println("Area of Right Triangle: " + rightTriangle.area());
        System.out.println("Perimeter of Right Triangle: " + rightTriangle.perimeter());
        System.out.println("--------------------------------------------");

        Pallerogram parallelogram = new Pallerogram(5.0, 7.0);
        System.out.println("Area of Parallelogram: " + parallelogram.area());
        System.out.println("Perimeter of Parallelogram: " + parallelogram.perimeter());
        System.out.println("---------------------------------------------");

        Rombus rhombus = new Rombus(5.0, 6.0);
        System.out.println("Area of Rhombus: " + rhombus.area());
        System.out.println("Perimeter of Rhombus: " + rhombus.perimeter());
        System.out.println("---------------------------------------------");

        Trapezium trapezium = new Trapezium(4.0, 6.0, 5.0);
        System.out.println("Area of Trapezium: " + trapezium.area());
        System.out.println("Perimeter of Trapezium: " + trapezium.perimeter());
        System.out.println("----------------------------------------------");

        ScaleneTringle scaleneTriangle = new ScaleneTringle(3.0, 4.0, 5.0);
        System.out.println("Area of Scalene Triangle: " + scaleneTriangle.area());
        System.out.println("Perimeter of Scalene Triangle: " + scaleneTriangle.perimeter());
        System.out.println("----------------------------------------------");

        Cube cube = new Cube(5.0);
        System.out.println("Surface Area of Cube: " + cube.area());
        System.out.println("Volume of Cube: " + cube.volume());
        System.out.println("----------------------------------------------");

        Sphere sphere = new Sphere(4.0);
        System.out.println("Surface Area of Sphere: " + sphere.area());
        System.out.println("Volume of Sphere: " + sphere.volume());
        System.out.println("------------------------------------------ ");
        
        HemiSphere hemisphere = new HemiSphere(5.0);
        System.out.println("Surface Area of Hemisphere: " + hemisphere.area());
        System.out.println("Curved Area of Hemisphere: " + hemisphere.CurvedArea());
        System.out.println("Volume of Hemisphere: " + hemisphere.volume());
        System.out.println("---------------------------------------------");


        Cylinder cylinder = new Cylinder(3.0, 5.0);
        System.out.println("Surface Area of Cylinder: " + cylinder.area());
        System.out.println("Curved Area of Cylinder: " + cylinder.CurvedArea());
        System.out.println("Volume of Cylinder: " + cylinder.volume());
        System.out.println("----------------------------------------------");

        Cuboid cuboid = new Cuboid(4.0, 5.0, 6.0);
        System.out.println("Surface Area of Cuboid: " + cuboid.area());
        System.out.println("Volume of Cuboid: " + cuboid.volume());

        
    }
}
