import java.util.Scanner;
class Fibbo{
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter no.");
	  int n=sc.nextInt();
	  
	  
	  int n1=0,n2=1,i,n3=0;
	  System.out.print(n1+ " ");
	  System.out.print(n2+ " ");
	  
	  
	  for(i=2;i<n;i++)
	  {
            n3=n1+n2;
            System.out.print(n3+ " ");
	    n1=n2;
	    n2=n3;

	  }


}
}	  
