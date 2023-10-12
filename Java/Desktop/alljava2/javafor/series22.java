import java.util.Scanner;
class Series22{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact=1;
   	  double sum=0;
   	  double a=1;
   	  for(i=1;i<=n;i++)
   	  { 
   	   fact=fact*i;
   	   a=(i*2-1)/fact;
   	   sum=sum+a;
   	   System.out.print((i*2-1)+ "/!" +i);
   	   if(i<n){
   	     System.out.print("+");
   	  
 
   	  }
   	  }
   	 
   	    System.out.println(" = "+sum);
}
} 	
