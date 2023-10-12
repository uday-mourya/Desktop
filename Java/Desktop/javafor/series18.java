import java.util.Scanner;
class Series18{
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
   	    a=(i*2)/fact;
   	    sum=sum+a;
   	    System.out.print("+" +(i*2)+ "/!" +i);
   	    
   	    }
   	   else{
   	    a=(i*2)/fact;
   	    sum=sum-a; 
   	    System.out.print("-" +(i*2)+ "/!" +i);
   	    
   	    }
   	    
   	  }
   	    System.out.println(" = "+sum);
   	  
}
} 	  
   	  
