import java.util.Scanner;
class Ifactdivi3{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact=1;
   	  double sum=0;
   	  while(i<=n)
   	  { 
   	    fact=fact*i;   
   	    if(i%2==0){   
   	       sum=sum+i/fact;
   	       System.out.print("+" +i+ "/!" +i);
   	       i++;
   	    }  
   	    else
   	     {
   	      sum=sum-i/fact;
   	      System.out.print("-"+i+ "/!" +i);
   	      i++;
   	     }  
   	  
   	    } 
   	    System.out.println("="+sum); 
 }
 }  	 
