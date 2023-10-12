class Fibo{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter any number");
	  int n = sc.nextInt();
	  int i=1;
	  int a=-1;
	  int b=1;
	  int c;
	  while (i<=n)
	  {
	    c=a+b;
	    //System.out.println(i+ "Term " +c) ;
	    System.out.print(c+ " " ) ;
	    a=b;
	    b=c;
	    i++;
	  }	  
}
}	  
