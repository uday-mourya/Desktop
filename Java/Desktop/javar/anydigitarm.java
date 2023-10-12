class Anyarms{
public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter Number");
	  int n = sc.nextInt();

	  int sum=0;
	  int count =0;
	  int m=n;
	  while(n>0)
	  {
	     count++;
	     n=n/10;
	  }
	      n=m;  
	  while(n>0)
	  {
	    int r =n%10;
	    int i=1,pow=1; 
	    
	    while(i<=count)
	    {
	      pow=pow*r;
	      i++;
	    }
	      sum=sum+pow;
	      n=n/10;
	  
	  }  
	  if(m==sum)
	     System.out.println("Armstrong");
	  else
	     System.out.println("Not Armstrong");   
}
}	  
