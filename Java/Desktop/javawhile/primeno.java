class Prime
{
  public static void main(String [] args)
  {
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter any number");
	  int n = sc.nextInt();
	  int i =1,count=0;
	  
	  while(i<=n)
	  {
	    if (n%i==0)
	       count++;
	       i++;
	      }
	    if(count==2)
	      System.out.println(" Prime No.");
	    else
	      System.out.println(" Not Prime No."); 
  }
}	  
