/Find the volume of cylinder
class Cvolume 
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the radius");
 float pi=3.14f;
 int r = sc.nextInt();
 System.out.println("Enter the height");
 int h= sc.nextInt();
 float C = pi*r*r*h;
 System.out.println("Volume of Cylinder ="+C);
 }
}  
