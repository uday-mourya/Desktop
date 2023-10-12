import java.util.Scanner;
class Test{
 public static void main(String [] args){
 	Scanner sc=new Scanner (System.in);
	int a[]=new int [7];
	System.out.println("Max Is Size Of Array = " +a.length);
	
	for(int i=0;i<a.length;i++)
	a[i]=sc.nextInt();
	
	for(int i=0;i<a.length;i++)
	System.out.println("\ta["+i+"] = " +a[i]);
	 
}
} 
