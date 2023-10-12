import java.util.Scanner;
 class Power24{
   public static void main(String [] args){
   	  Scanner sc= new Scanner(System.in);
   	  System.out.println("Enter Number");
   	  int a= sc.nextInt();
   	  System.out.println("Enter Power");
   	  int b= sc.nextInt();
   	  
   	  int i=1;
   	  int pow =1;
   	  int fact=1;
   	  int sum=0;
   	  
   	  for (i=1;i<=b;i++)
   	  {
   	    pow=pow*a;
   	    fact=fact*i;
   	    if(i%2==0){
   	       sum=sum+pow/fact;
   	       System.out.print("+" +a+ "^" +i+ "/!"+i);
   	    
   	    }
   	    else
   	    {
   	      sum=sum+pow/fact;
   	      System.out.print("-" +a+ "^" +i+ "/!" +i);
   	     
   	    } 
   	  }
   	   System.out.println(" = "+sum);
}
}   	  
