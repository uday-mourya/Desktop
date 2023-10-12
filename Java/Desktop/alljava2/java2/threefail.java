import java.util.Scanner;
class Fail{
  public static void main (String [] args)
{
  	Scanner sc=new Scanner(System.in);
	System.out.println("Enter PHYSICS Marks");
	int p=sc.nextInt();
	System.out.println("Enter CHEMISTRY Marks");
	int c=sc.nextInt();
	System.out.println("Enter MATHS Marks");
	int m=sc.nextInt();
	
	if(p<33)  
	   {
	     if(c<33)
	      {
	        if(m<33)
	          System.out.println("FAIL IN ALL SUB...");
	      }
	   
	      else
	      {
	        if(m<33){
	         System.out.println("FAIL IN TWO SUB...");
	         System.out.println("FAIL IN PHYSICS AND MATHS");
	         }
	         else
	         {
	          System.out.println("FAIL IN ONE SUB...");
	          System.out.println("FAIL IN PHYSICS");
	         } 
	          
	      }
	   }
	else
	{
	  if(c<33)
	   {
	     if(m<33)
	     {
	        System.out.println("FAIL IN TWo SUB..");
	        System.out.println("FAIL IN CHEMISTRY AND PHYSICS");
	      }  
	      else
	        {
	        System.out.println("FAIL IN ONE subject");
	        System.out.println("FAIL IN CHEMISTRY");  
	        }
	   }
	   
	  else
	  {  
	     if(m<33)
	     {
	     System.out.println("FAIL IN ONE SUB....");
	     System.out.println("FAIL IN maths");
	     }
	     else
	       {
	        System.out.println("---PASS---");
	        int total = p+c+m;
	        double per=total/5;
	          System.out.println("YOUR TOTAL NUMBER "+total);
	          System.out.println("PERCENTAGE"+per);
	        }
	        
	  } 
	}    
	        
	
 }
}
