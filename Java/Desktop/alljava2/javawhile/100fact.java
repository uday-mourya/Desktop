 import java.util.Scanner;
class Fact100{
  public static void main(String[] args){
   	  //Scanner sc = new Scanner(System.in);
   	  //System.out.println("Enter Any Number.....");
   	  //int n = sc.nextInt();
   	  int i=1,fact=1;
   	  int n=100;
   	  
   	  while(i<=n)
   	  {
   	   if(i<n)
   	   {
   	     System.out.print(i+"*");
   	   }      
   	    fact=fact*i;
   	    i++;
   	   
   	  } 
   	    System.out.println(n+"=" +fact );
 }
 }  	    
