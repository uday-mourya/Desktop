class Donaturalsum{
public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter Number");
	  int n = sc.nextInt();
	  
	  int i=1;
	  int sum=0;
	  do 
	  {
	    sum=sum+i;
	    System.out.print(i);
	    if(i<n){
	        System.out.print(" + ");
	    }
	    i++;
	  }
	  while(i<=n);
	  {
	    System.out.println(" = " +sum);
	  }
}
}	
