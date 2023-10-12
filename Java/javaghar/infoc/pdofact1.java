import java.util.*;
class Test
 { 
   public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int i=1;
        double sum=0,power=1;
        
        do
         {
       	  power=power*x;
      		  if(i%2==0)
                    {
               	System.out.print(x+"^"+i+"/"+(2*i-1)+"+");
               	sum=sum-power/(2*i-1);
             	     }
                 else 
                    {  
              		 System.out.print(x+"^"+i+"/"+(2*i-1));
               	 if(i<y)
              		 System.out.print("-");
               	 sum=sum+power/(2*i-1);
                    }	 
                    i++;        
         }
        while(i<=y);
        System.out.print("="+sum);
        
     }   
 }    
