import java.util.Scanner;
class Test{
       //1!-3!+5!-6!
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int fact=1;
   	  int sum=0;
   	  int a=1;
   	  while(a<=n)
   	  {    
   	       fact=fact*i;
   	       if(i%2!=0)
   	       {  
   	         if(a%2!=0)
   	          {
   	            sum=sum+fact; 
   	            System.out.print("+!"+(a*2+1)+"/"+(a*2+1));
   	          } 
   	       else
   	       {
   	        sum=sum-fact;	      
   	        System.out.print("-!"+(a*2+1)+"/"+(a*2+1)+"+");
   	       }
   	        a++; 
   	      }
   	      i++;
   	  }  
   	       System.out.println("="+sum); 
}
}  	 
