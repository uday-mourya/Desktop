class Dofact{
public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter Number");
	  int n = sc.nextInt();
	  
	  int i=1;
	  int fact=1;
	  do 
	  {
	    fact=fact*i;
	    i++;
	  }
	  while(i<=n);
	  {
	    System.out.println("Factorial Of " +n+ " Is " +fact);
	  }
}
}	  
