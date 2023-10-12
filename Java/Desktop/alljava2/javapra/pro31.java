import java.util.Scanner;
class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter Number");
   	  int a = sc.nextInt();
   	  System.out.println("Enter Power");
   	  int b=sc.nextInt();
   	  int i=1;
   	  double pow=1;
   	  double sum=0;
   	  while(i<=b)
   	  { 
   	      if(i%2==0){
   	         
   	          }
   	       else{       
   	       pow=pow*a;
   	       sum=sum+pow;    
   	       System.out.print(a+ "^" +i+ "/" +(i*2));
   	       if(i<b){
   	           System.out.print("+");
   	       }
   	       i++; 
   	     
   	    }
   	    }
   	      System.out.println("="+sum);    	    
 }
 }  	 
