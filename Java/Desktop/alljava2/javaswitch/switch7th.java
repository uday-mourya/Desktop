import java.util.Scanner;
class Switch7th{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	  System.out.println("Your Choices Is :");
	  System.out.println("1st program :");
	  System.out.println("2nd program :");
	  System.out.println("3rd program :");
	  System.out.println("Enter Your choice");
   	  int ch= sc.nextInt();
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact=1;
   	  double sum=0;
   	  double a=1;
   	  switch(ch)
   	  {
   	   case 1:
   	   while(i<=n)
   	   { 
   	     fact=fact*i;
   	     a=(i*2)/fact;
   	     System.out.print((i*2)+ "/!" +i+ "+");
   	     sum=sum+a;
   	     i++;
   	   }
   	     
   	  case 2:  
   	    while(i<=n)
   	  { 
   	   fact=fact*i;
   	   if(i%2==0){
   	    a=(i*2)/fact;
   	    System.out.print((i*2)+ "/!" +i+  "+");
   	    sum=sum-a;
   	    i++;
   	    }
   	   else{
   	    a=(i*2)/fact;
   	    System.out.print((i*2)+ "/!" +i+  "-");
   	    sum=sum+a;
   	    i++;
   	    }
   	    
   	  }
   	    
   	  case 3:  
   	    while(i<=n)
   	  { 
   	   fact=fact*i;
   	   if(i%2==0){
   	    a=(i*2)/fact;
   	    System.out.print("+" +(i*2)+ "/!" +i+ "+");
   	    sum=sum+a;
   	    i++;
   	    }
   	   else{
   	    a=(i*2)/fact;
   	    System.out.print("-" +(i*2)+ "/!" +i+ "-");
   	    sum=sum-a;
   	    i++;
   	    }
   	    
   	  }
   	    System.out.println(" = "+sum);
}	  
}
}
