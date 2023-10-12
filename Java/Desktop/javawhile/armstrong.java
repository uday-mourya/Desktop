class Arms{
public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter Number");
	  int n = sc.nextInt();

	  int sum=0;
	  int c=n;
	  while(n>0)
	  {
	    int r =n%10; 
	    int k=r*r*r;
	      sum=sum+k;
	      n=n/10;
	  
	  }  
	  if(c==sum)
	     System.out.println("Armstrong");
	  else
	     System.out.println("Not Armstrong");   
}
}	  
