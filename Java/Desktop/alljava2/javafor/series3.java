import java.util.Scanner;
class Series3{
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter no.");
	  int n=sc.nextInt();
          int i=1;
          int fact=1;
          int sum=0;
          
          for(i=1;i<=n;i++)
          {
             fact=fact*i;
             
             if(i%2==0){
               sum=sum+fact/i;
               System.out.print("+!"+i+"/"+i);
               
           }
              else{
               sum=sum-fact/i;
               System.out.print("-!"+i+"/"+i);
                 
               }
               }
                 System.out.println("="+sum);
}
}
