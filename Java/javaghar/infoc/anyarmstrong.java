import java.util.Scanner;
class Test
	{
 		public static void main(String args [])
 			{
				 Scanner sc=new Scanner(System.in);
				 System.out.println("Enter any number");
				 int n=sc.nextInt();
				 int m=n,count=0;
				 while(n>0)
					 { 
					     count++;
					     n= n/10;
					     
					  } 
					     n=m;
					     int sum=0;
					     while(n>0)
					       {
					          int r=n%10;
					          int i=1,power=1;
					     
					          while(i<=count)
					            {
					               power=power*r;
					               i++;
					    	    }
					               sum=power+sum;
					               n=n/10;
					       }
			         if(m==sum)
				     System.out.println("number is aarmstromg");
			         else
		                    System.out.println("number is not aarmstrong");
		      }
 }     
