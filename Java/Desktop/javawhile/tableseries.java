import java.util.Scanner;
class Tableseries{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int sum =0;
   	  while(i<=10)
   	  { 
   	    
   	     int m=n*i;
   	     if(m<n){    
   	      System.out.print(m+ "+" );
   	    }
   	      sum=sum+m;
   	      i++;
   	   }
   	   
   	   System.out.println( "= "+sum);
   	   
 }
 }  	  
