import java.util.Scanner;
class Hemispherevolume{
public static void main(String [] args){
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter Radius");
	  float a = sc.nextFloat();                                       
	  float x=2*3.14f/1.5f;
	  float y=a*a*a;
	  float r=x*y;
	  System.out.println("Volume Of Hemisphere Is" +r);


}
}
