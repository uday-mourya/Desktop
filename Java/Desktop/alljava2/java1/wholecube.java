import java.util.Scanner;
class Wholecube{
public static void main(String [] args){
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter A");
	  int a = sc.nextInt(); 
	  System.out.println("Enter B"); 
	  int b = sc.nextInt();                                      
	  int whole=(a-b)*(a*a+a*b+b*b);
	  System.out.println("(A+B)^3 =" +whole);


}
}
