import java.util.Scanner;
class Test
{
   public static void main(String args [])
     {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any number");
	 int n=sc.nextInt();
	 int arm=0,sum=n,r=0;
	 while(n>0)
	 {   
	     r=n%10;
	     n= n/10;
	     arm=arm+(r*r*r);
	     
	 }
	    if(arm==sum)
	    System.out.println("number is aarmstromg");
	    else
	    System.out.println("number is not aarmstrong");  
    }
}     
