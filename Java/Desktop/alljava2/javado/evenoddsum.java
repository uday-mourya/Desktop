import java.util.Scanner;
class Evenoddsum{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int esum=0;
   	  int osum=0;
   	  
   	  do
   	  {
   	   if(i%2==0){
   	      System.out.println(i+ " ");
   	      
              esum=esum+i;    	  
   	    }  
   	   else{
   	      System.out.print(i+ " ");
   	      
   	      osum=osum+i;
   	   }
   	      
   	   i++;
   	  }
   	  
   	  while(i<=n);
   	  {
   	     System.out.println("Even sum"+esum );
   	     System.out.println("Odd  sum "+osum );
   	  
   	  }
 }
 }  	  
