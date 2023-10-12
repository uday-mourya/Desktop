import java.util.Scanner;
class Test{
 public static void main(String [] args ){
	Scanner sc =new Scanner (System.in); 
 	System.out.println("Enter Range Of Prime Number ");
 	int n=sc.nextInt();
 	int i,j;
 	for (i=2;i<n;i++)
 	{ 	 
 	  if(i%i==0)
 	  break;
 	  i++;
        }
        if(i==i)
          System.out.println(i); 
 }
 }	
