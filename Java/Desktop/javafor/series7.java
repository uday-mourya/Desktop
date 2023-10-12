import java.util.Scanner;
class Series7{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact=1;
   	  double sum=0;
   	  for(i=1;i<=n;i++)
   	  { 
   	  
   	      fact=fact*i;  
   	       sum=sum+fact/(i+1);
   	       System.out.print("!" +i+ "/" +(i+1));
   	       if(i<n){
   	         System.out.print("+");
   	       }
   	       
   	   }    
   	   System.out.println(" = " +sum);    
 }
 }  	       
