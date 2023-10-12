import java.util.Scanner;
class Series6{
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter no.");
	  int n=sc.nextInt();
	  
	  int i=1;
	  float fact=1, sum=0;
	  
	  for(i=1;i<=n;i++)
	  {
	    fact=fact*i;
	     if(i%2==0){
	     sum=sum+i/fact;
	     System.out.print("+" +i+"/!"+i);
	      
	     }
	     else{
	      sum=sum-i/fact;
	      System.out.print("-" +i+"/!"+i);
	      
	      }
	      }
	        System.out.println("="+sum);
}
}
