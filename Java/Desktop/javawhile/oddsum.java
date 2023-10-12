import java.util.Scanner;
class Oddsum{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int j;
   	  int sum=0;
   	  while(i<=n)
   	  { 
   	    j=i*2-1;
   	    System.out.println("\t" +j); 
   	    sum=sum+j;
   	    i+=1;
   	   }
   	    System.out.println("\tSum =" +sum);
   	   
 }
 }  	  
