import java.util.Scanner;
class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact=1;
   	  double sum=0;
   	  int a=1;
   	  while(a<=n)
   	  {    fact=fact*i;
   	       if(i%2==0){            
   	       sum=sum+i/fact;
   	       System.out.print("!" +(a*2)+ "/" +(a*2));
   	       if(a<n){
   	           System.out.print("+");
   	       } 
   	       a++;  
   	       } 
   	       i++;  
   	    }
   	    System.out.println("="+sum); 
 }
 }  	 
