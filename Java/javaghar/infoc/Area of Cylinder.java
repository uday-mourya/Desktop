/ Area of Cylinder
class Acylinder
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the radius");
 float pi=3.14f;
 int r = sc.nextInt();
 System.out.println("Enter the height");
 int h= sc.nextInt();
 float C = 2*pi*r*h+2*pi*r*r;
 System.out.println("Area of Cylinder ="+C);
 }
}   
