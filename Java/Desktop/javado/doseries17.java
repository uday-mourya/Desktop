import java.util.Scanner;
class Doseries17{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact=1;
   	  double sum=0;
   	  double a=1;
   	  do
   	  { 
   	   fact=fact*i;
   	   if(i%2==0){
   	    a=fact/(i*2);
   	    sum=sum-a;
   	    System.out.print("!"+i+ "/" +(i*2));
   	    if(i<n){
   	      System.out.print("+");
   	    }
   	    i++;
   	    }
   	   else{
   	    a=fact/(i+1);
   	    sum=sum+a;
   	    
   	    System.out.print("!" +i+ "/" +(i*2));
   	    if(i<n){
   	      System.out.print("-");
   	    }
   	    i++;
   	    }
   	    
   	  }
   	   while(i<=n)
   	   {
   	     System.out.println(" = "+sum);
   	   }
}
} 	  
   	  
