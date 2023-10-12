class Prime2{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter any number");
	  int n = sc.nextInt();
	  int i =2;
	  
	  while(i<n)
	  {
	    if (n%1==0){
	       i++;
	       break;
	      
	      }
	    if(i==n)
	      System.out.println(" Prime No.");
	    else
	      System.out.println(" Not Prime No."); 
	     
	    }  
	                                	  
}
}	  
