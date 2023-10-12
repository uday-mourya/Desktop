//Area of Circle
import java.util.Scanner;
class Areaofcircle 
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the radius");
 float pi=3.14f;
 int r = sc.nextInt();
 float a = pi*r*r;
 System.out.println("area of circle ="+a);
 }
}  
