import java.util.Scanner;
class Dooddser{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int sum=0;
   	  do 
   	  {
   	     int j=i*2-1;
   	     System.out.print(j);
   	      if(i<n){
   	        System.out.print("+");
   	    
   	    }
   	      sum=sum+j;
   	      i++;
   	  }
   	  while(i<=n); 
   	  {
   	     System.out.println( " = "+sum); 
   	  
   	  }
   	  
 }
 }  	  
