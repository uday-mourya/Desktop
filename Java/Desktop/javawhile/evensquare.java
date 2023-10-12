import java.util.Scanner;
class Esquare{
 public static void main(String [] args){
        Scanner sc =new Scanner (System.in);
 	System.out.println("Enter any Number");
 	int n=sc.nextInt();
 	int i=1;
 	while(i<=n)
 	{
 	  int s=i*i;
 	  System.out.println(s);
 	  i+=1;
 	}
}
} 	 
