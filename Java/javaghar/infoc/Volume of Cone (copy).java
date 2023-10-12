//Volume of Cone
class Vcone
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the radius");
 float pi=3.14f;
 int r = sc.nextInt();
 System.out.println("Enter the height");
 int h= sc.nextInt();
 float C = 1*pi*r*r*h/3;
 System.out.println("Volume of Cone ="+C);
 }
}  
 
