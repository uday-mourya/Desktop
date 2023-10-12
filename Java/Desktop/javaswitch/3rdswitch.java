import java.util.Scanner;
class Switch3nd{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	  System.out.println("Your Choices Is :");
	  System.out.println("1st program :");
	  System.out.println("2nd program :");
	  System.out.println("3rd program :");
	  System.out.println("Enter Your Choice");
	  int ch =sc.nextInt();
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int fact=1;
   	  int sum=0;
   	  switch (ch)
   	  {  
   	  case 1 : 
   	   while(i<=n)
   	  { 
   	    fact=fact*i;   
   	    if(i%2==0){   
   	       sum=sum+i/fact;
   	       System.out.print(i+ "/!" +i+ "+");
   	       i++;
   	    }  
   	    else
   	     {
   	      sum=sum+i/fact;
   	      System.out.print(i+ "/!" +i+ "+");
   	      i++;
   	     }  
   	  
   	    } 
   	    System.out.println("="+sum);
   	    break;
   	    
   	    case 2 :
   	    while(i<=n)
   	  { 
   	    fact=fact*i;   
   	    if(i%2==0){   
   	       sum=sum-i/fact;
   	       System.out.print(i+ "/!" +i+ "+");
   	       i++;
   	    }  
   	    else
   	     {
   	      sum=sum+i/fact;
   	      System.out.print(i+ "/!" +i+ "-");
   	      i++;
   	     }  
   	  
   	    } 
   	    System.out.println("="+sum); 
   	    case 3:
   	    while(i<=n)
   	  { 
   	    fact=fact*i;   
   	    if(i%2==0){   
   	       sum=sum+fact/i;
   	       System.out.print("+!" +i+ "/" +i);
   	       i++;
   	    }  
   	    else
   	     {
   	      sum=sum-fact/i;
   	      System.out.print("-!"+i+ "/" +i);
   	      i++;
   	     }  
   	  
   	    } 
   	    System.out.println("="+sum);  
   	 default:
   	    System.out.println("You Are wrong");
   	    
}   
}   	     
}
	 
