import java.util.Scanner;
class Wholesquare{
public static void main(String [] args){
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter A");
	  int a = sc.nextInt(); 
	  System.out.println("Enter B"); 
	  int b = sc.nextInt();                                      
	  int whole=a*a*+b*b+2*a*b;
	  System.out.println("(A+B)^2 =" +whole);


}
}
