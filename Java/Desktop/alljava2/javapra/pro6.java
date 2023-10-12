import java.util.Scanner;
class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int fact=1;
   	  int sum=0;
   	  int a=1;
   	  while(a<=n)
   	  {    fact=fact*i;
   	       if(i%2==0)
   	        { 
   	          if(a%2==0){           
   	            sum=sum+fact/i;
   	            System.out.print("+!" +(a*2)+ "/" +(a*2));
   	         }
   	        
   	          else
   	          {
   	            sum=sum-fact/i;
   	            System.out.print("-!" +(a*2)+ "/" +(a*2));
   	            
   	          }   
   	           a++;  
   	         }
   	          i++;
   	  }       
   	          System.out.println("="+sum); 
 }
 }  	 
