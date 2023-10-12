import java.util.Scanner;
class Series12{
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
   	    a=(i+1)/fact;
   	    sum=sum+a;
   	    System.out.print( "+"+(i+1)+ "/!" +i);
   	    
   	    }
   	   else{
   	    a=(i+1)/fact;
   	    sum=sum-a;	    
   	    System.out.print("-" +(i+1)+ "/!" +i);
   
   	    }
   	    
   	  }
   	    System.out.println(" = "+sum);
   	  
}
} 	  
   	  
