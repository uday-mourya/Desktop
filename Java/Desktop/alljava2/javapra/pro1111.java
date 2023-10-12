import java.util.Scanner;
class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int fact=1;
   	  int sum=0;
   	  while(i<=n)
   	  { 
   	       fact=fact*(i*2);
   	       if(i%2==0){     
   	        sum=sum+fact;
   	        System.out.print("!" +(i*2));
   	       if(i<n){
   	           System.out.print("+");
   	       }
               }
   	       i++; 
   	    } 
   	    System.out.println("="+sum); 
 }
 }  	 
