import java.util.Scanner;
class Test{
 public static void main(String [] args ){
	Scanner sc =new Scanner (System.in); 
 	System.out.println("Enter Range Of Prime Number ");
 	int n=sc.nextInt();
 	int i,j,count;
 	
 	for(i=2;i<=n;i++)
 	{
 	  for(j=2,count=1;j<i;j++)
 	  {
 	    if(i%j==0)
 	    {
 	     count++;
 	     break;
 	    }
 	 }
 	  if(count==1){
      	    System.out.println(i);
 	 }
 	  
        }
}
} 	   
