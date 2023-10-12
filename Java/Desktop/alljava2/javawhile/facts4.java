import java.util.Scanner;
class Devideseries{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int fact=1;
   	  int sum=0;
   	  while(i<=n)
   	  { 
   	    fact=fact*i;   
   	    if(i%2==0){   
   	       sum=sum+fact/i;
   	       System.out.print("!" +i+ "/" +i+ "+");
   	       i++;
   	    }  
   	    else
   	     {
   	      sum=sum+fact/i;
   	      System.out.print("!"+i+ "/" +i+ "+");
   	      i++;
   	     }  
   	  
   	    } 
   	    System.out.println("="+sum); 
 }
 }  	 
