import java.util.Scanner;
class Test{
 public static void main(String [] args ){
	Scanner sc =new Scanner (System.in); 
 	System.out.println("Enter Range Of Prime Number ");
 	int n=sc.nextInt();
 	int i=2,a=2;
 	while(i<n)
 	{
         if(i%i==0){
          break;}
          i++;
        } 
        if (i==i)
          System.out.println(i);
     
}
}
