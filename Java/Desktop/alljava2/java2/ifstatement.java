import java.util.Scanner;
class If{
public static void main (String [] args)
{	  Scanner sc =new Scanner (System.in);
	  System.out.println("Enter Two Number"); 
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  if(a==b){
	     System.out.println("Both Are Same");
	  
	  }
	  if(a!=b){
             System.out.println("Both Are Different");
          }   

            System.out.println("Good Job.....");
}
}
