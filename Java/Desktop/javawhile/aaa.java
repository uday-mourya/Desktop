import java.util.Scanner;
class Test3{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int sum=0;
   	  while(i<=n)
   	  { 
   	   
   	    if(i%2==0)
   	       sum=sum-i;
   	    else 
   	       sum=sum+i;  
   	       i++;
   	     
   	   }
   	     
   	    System.out.println("Sum=" +sum);
   	   
 }
 }  	  
