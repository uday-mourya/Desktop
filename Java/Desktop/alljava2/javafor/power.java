import java.util.Scanner;
class Powerfor{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter Number");
	  int a = sc.nextInt();
	  System.out.println("Enter Power");
	  int b = sc.nextInt();
	  
	  int i=1;
	  int pow=1;
	  
	  for(i=1;i<=b;i++)
	  {
	     pow=pow*a;
	     
	  }
	  
	  System.out.println("Power = " +pow);
}
}	  
	  
