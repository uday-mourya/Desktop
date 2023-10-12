import java.lang.String;
import java.util.Scanner;
class Series16{
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter no.");
	  int n=sc.nextInt();
          int i=1;
          double fact=1,sum=0;
          
           for(i=1;i<=n;i++)
           {
	      fact=fact*i;
	      sum=sum+(i*2)/fact;
	      System.out.print((i*2)+ "/!" +i);
	     if(i<n)
	     {
	       System.out.print("+");
	     }


	    }
	       System.out.print(" = "+sum);
}
}
