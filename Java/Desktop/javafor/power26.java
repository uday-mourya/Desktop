import java.util.Scanner;
class Power26{
  public static void main(String [] args){
  	  Scanner sc =new Scanner(System.in);
  	  System.out.println("Enter Number");
  	  int a= sc.nextInt();
  	  System.out.println("Enter Power");
  	  int b= sc.nextInt();
  	  
  	  int i=1;
  	  double pow=1;
  	  double fact=1;
  	  double sum=0;
  	  
  	  for(i=1;i<=b;i++)
  	  {
  	   pow=pow*a;
  	   fact=fact*i;
  	   if(i%2==0){
  	    sum=sum-fact/pow; 
  	    System.out.print("!" +i+ "/" +a+ "^" +i);
  	      if(i<b){
  	          System.out.print("+");
  	          
  	             }
  	   }
  	   else{
  	     sum=sum+fact/pow;
  	     System.out.print("!" +i+ "/" +a+ "^" +i);
  	     
  	     if(i<b){
  	         System.out.print("-");
  	        }
  	     }
  	   }  
  	       System.out.println(" = " +sum);
 }
 } 	  
