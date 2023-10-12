import java.util.Scanner;
class Evenser{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int j=0;
   	  int sum=0;
   	  while(i<=n)
   	  { 
   	    j=i*2;
   	    if(i<n){
   	    System.out.print(j+ "+");
   	    } 
   	    sum=sum+j;
   	    i+=1;
   	    
   	    
   	  }
   	   System.out.println(j+"= "+sum);
   	   
 }
 }  	  
