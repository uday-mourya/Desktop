import java.util.Scanner;
 class Test2{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int esum=0;
   	  int osum=0;
   	  while(i<=n)
   	  { 
   	    System.out.print(i+ "+");
   	    if(i%2==0)
   	       esum=esum+i;
   	    else 
   	       osum=osum+i;  
   	       i++;
   	     
   	   }
   	     
   	    System.out.println("Esum=" +esum);
   	    System.out.println("Osum =" +osum);
 }
 }  	  
