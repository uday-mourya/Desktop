import java.util.Scanner;
class Test{
 public static void main(String [] args){
        int i,j,temp=0;
 	Scanner sc=new Scanner (System.in);
	int a[]=new int [20];
	System.out.println("How many Elements You Wants to Entered");
	int n =sc.nextInt();
	                                              
	System.out.println("Enter Element an Array");
	for(i=0;i<n;i++)
	a[i]=sc.nextInt();

	for( i=0;i<n-1;i++)
	{  
	  for(j=i+1;j<n-i-1;j++){
	    if(a[j]>a[j+1]){
	     temp=a[j];
	     a[j]=a[j+1];
	     a[j+1]=temp;
	  }  
	 } 
        }	
	for (i=0;i<n;i++){
	  System.out.println("\t"+a[i]);
	}   
}
} 
