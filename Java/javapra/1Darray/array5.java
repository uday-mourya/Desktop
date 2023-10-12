import java.util.Scanner;
class Test{
 public static void main(String [] args){
 	Scanner sc=new Scanner (System.in);
	int a[]=new int [5];
	System.out.println("Max Is Size Of Array = " +a.length);
	
	System.out.println("How many Elements You Wants to Entered");
	int n =sc.nextInt();
	
	System.out.println("Enter Element an Array");
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	
	System.out.println("Array Elements Are");
	for(int i=0;i<n;i++)
	System.out.println("\ta["+i+"] = " +a[i]);
	 
}
} 
