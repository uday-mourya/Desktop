import java.util.Scanner;
class Loop12{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact =1;
   	  double sum=0;
   	  double a =1;
   	  
   	  while(i<=n)
   	  {
   	    fact =fact*i;
   	    a= fact/(i*2);
   	    sum=sum+a;
   	    i++;
   	   }
   	    System.out.println("SUM = "+sum);
   	  
}
} 	  
