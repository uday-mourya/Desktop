import java.util.Scanner;
class Power21{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter Number");
	  int a = sc.nextInt();
	  System.out.println("Enter Power");
	  int b = sc.nextInt();
	  
	  int i=1;
	  double pow=1;
	  double sum=0;
	  for(i=1;i<=b;i++)
          {
            pow =pow*a;
            if(i%2==0){
            sum=sum+(i*2-1)/pow;
            System.out.print(" +" +(i*2-1)+ "/" +a+ "^" +i);
	   }
	   else
	   {
	     sum=sum-(i*2-1)/pow;;
	     System.out.print( "-" +(i*2-1)+ "/"  +a+ "^" +i);
	         
	   }
	   
	 }  
	  
	    System.out.println("=" +sum);
	  
}
}
