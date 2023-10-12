import java.util.Scanner;
class Series10{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact=1;
   	  double sum=0;
   	  do
   	   { 
   	       fact=fact*i;     
   	       sum=sum+(i+1)/fact;
   	       System.out.print((i+1)+ "/!" +i);
   	       if(i<n){
   	          System.out.print("+");
   	       }
   	       
   	     i++; 
   	    }
   	    while(i<=n);
   	    {
   	      System.out.println("="+sum); 
   	      
   	    }
   	    
   	   
 }
 }  	 
