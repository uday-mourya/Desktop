import java.util.Scanner;
class Power18{
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
            sum=sum+pow/(i*2-1);
            System.out.print(" +" +a+ "^" +i+ "/" +(i*2-1));
	   }
	   else
	   {
	     sum=sum-pow/(i*2-1);;
	     System.out.print( "-" +a+ "^"  +i+ "/" +(i*2-1));
	         
	   }
	   
	 }  
	  
	    System.out.println("=" +sum);
	  
}
}
