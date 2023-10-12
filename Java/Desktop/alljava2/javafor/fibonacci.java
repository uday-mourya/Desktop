import java.util.Scanner;
class Fibo2{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  
   	  int i=1;
   	  int n1=-1;
   	  int n2=1;
   	  
   	  for(i=1;i<=n;i++)
   	  {
   	    int n3=n1+n2;
   	    
   	    System.out.print((n3)+ " ");
   	    n1=n2;
   	    n2=n3;
   	    
   	    
   	    
   	  }  
 }
 }  	  
