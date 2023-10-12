class Prime3{
  public static void main(String [] args){
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter any number");
	  int n = sc.nextInt();
	  int i =2,flag=1;
	  
	  while(i<n)
	  {
	    if (n%i==0){
	       flag=0;
	       break;
	      }
	     i++;
	     }
	    if(flag==1)
	      System.out.println(" Prime No.");
	    else
	      System.out.println(" Not Prime No."); 
	     
	     
	                                	  
}
}	  
