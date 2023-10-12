import java.util.Scanner;
class Dfact{
  public static void main(String[] args){
   	  Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter Any Number.....");
   	  int n = sc.nextInt();
   	  int i; 
   	  int fact=n;
   	  if(n==n){
   	     System.out.print(n+ "*");
   	    }
   	  for(i=n-1;i>=1;i--)
   	  {  
   	     
   	     fact=fact*i;
   	     System.out.print(i);
           if(i>1)
           {
             System.out.print("*");
           }   	   
   	  } 
   	    System.out.println("=" +fact );
 }
 }  	    
