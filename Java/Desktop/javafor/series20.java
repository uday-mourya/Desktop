import java.util.Scanner;
class Series20{
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
   	   if(i%2==0){
   	    a=fact/(i*2-1);
   	    sum=sum-a;
   	    System.out.print("!"+i+ "/" +(i*2-1));
   	    if(i<n){
   	      System.out.print("+");
   	    }
   	    }
   	   else{
   	    a=fact/(i+1);
   	    sum=sum+a;
   	    
   	    System.out.print("!" +i+ "/" +(i*2-1));
   	    if(i<n){
   	      System.out.print("-");
   	    }
   	    }
   	    
   	  }
   	    System.out.println(" = "+sum);
   	  
}
} 	  
   	  
