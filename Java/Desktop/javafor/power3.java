import java.util.Scanner;
class Power3{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter Number");
	  int a = sc.nextInt();
	  System.out.println("Enter Power");
	  int b = sc.nextInt();
	  
	  int i;
	  int pow=1;
	  int sum=0;
	  
	  for(i=1;i<=b;i++)
          {
            pow =pow*a;
            if(i%2==0){
                sum=sum+pow;
                System.out.print("+" +a+ "^" +i);
       
	       }
	    else
	    {
	      sum=sum-pow;
	      System.out.print("-" +a+ "^" +i);
	      
	    }
	    
	  }
	  
	    System.out.println("=" +sum);
	  
}
}
