import java.util.Scanner;
class Power25{
  public static void main(String [] args){
  	  Scanner sc =new Scanner(System.in);
  	  System.out.println("Enter Number");
  	  int a= sc.nextInt();
  	  System.out.println("Enter Power");
  	  int b= sc.nextInt();
  	  
  	  int i=1;
	  double pow=1;
	  double sum=0;
	  double fact=1;
	  for(i=1;i<=b;i++)
          {
            pow =pow*a;
            fact=fact*i;
            sum=sum+fact/pow;
            System.out.print(a+ "^" +i+ "/!" +i);
            if(i<b)
            {	  
	      System.out.print("+");
	     }
	  
	  }
	  
	    System.out.println("=" +sum);
	  
}
}
