import java.util.Scanner;
class Dotable{
  public static void main(String [] args ){
	   Scanner sc =new Scanner (System.in);
	   System.out.println("Enter Number");
	   int n=sc.nextInt();
	   
  	   int i=1;
	   do
	   {
	       int m=n*i;
	       System.out.println(n+ "*" +i+  "=" +m);
	     
	       i++;
	   }
	  while(i<=10); 
	  {
	     
	  }
}
}	   
