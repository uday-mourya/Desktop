import java.util.Scanner;
class Dotablesum{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int sum =0;
   	  while(i<=10)
   	  { 
   	    int m=n*i;
   	    System.out.print(m);
   	    if(i<10){
   	        System.out.print("+");
   	    }
   	    sum=sum+m;
   	    i++;
   	   }
   	   
   	   System.out.println(" = "+sum);
   	   
 }
 }  	  
