import java.util.Scanner;
class Forfactorial{
  public static void main(String[] args){
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
