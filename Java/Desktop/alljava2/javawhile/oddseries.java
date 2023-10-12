import java.util.Scanner;
class Odds{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int j;
   	  while(i<=n)
   	  { 
   	    j=i*2-1;
   	    System.out.println( "\t"+j); 
   	    i+=1;
   	   }
   	   
   	   
 }
 }  	  
