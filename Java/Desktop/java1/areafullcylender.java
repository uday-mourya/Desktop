import java.util.Scanner;
class Fcylender{
public static void main(String [] args){
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter Radius");
	  float a = sc.nextFloat(); 
	  System.out.println("Enter Height"); 
	  float b = sc.nextFloat();                                      
	  float cy=2*3.14f*a(a+b);
	  System.out.println("Area of Full Cylender Is" +cy);


}
}
