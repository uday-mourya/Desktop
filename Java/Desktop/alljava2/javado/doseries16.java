import java.util.Scanner;
class Doseries16{
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
   	   a=fact/(i*2);
   	   System.out.print("!"+i+ "/" +(i*2));
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
