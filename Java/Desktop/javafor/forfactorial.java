import java.util.Scanner;
class Factorial{

  public static void main(String [] args){
	Factorial.displayFactorial();
  }
  public static void displayFactorial(){
	  Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i,fact;
   	  for(i=1,fact=1;i<=n;i++)
   	  {
   	         fact=fact*i;
   	  }       
   	    System.out.println("Factorial =" +fact);     
   	         
}
}   	  
