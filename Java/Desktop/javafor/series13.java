import java.util.Scanner;
class Series13{
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter no.");
	  int n=sc.nextInt();
	  
	  int i=1;
	  double fact=1,sum=0;
	  
	  for(i=1;i<=n;i++)
	  {
	    fact=fact*i;
	    sum=sum+fact/(i*2);
	    System.out.print("!"+i+"/"+(i*2));
	   if(i<n)
	   {
	     System.out.print("+");
	    }


	  }
	     System.out.print(" = "+sum);
}
}
