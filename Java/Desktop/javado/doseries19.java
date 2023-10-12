import java.util.Scanner;
class Doseries19{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact=1;
   	  double sum=0;
   	  double a=1;
   	  do
   	  { 
   	   fact=fact*i;
   	   a=(i*2)/fact;
   	   System.out.print((i*2)+ "/!" +i);
   	   if(i<n){
   	     System.out.print("+");
   	   }
   	   sum=sum+a;
   	   i++;
   	  }
   	  while(i<=n);
   	  {
   	    System.out.println(" = "+sum);
   	  }
}
} 	
