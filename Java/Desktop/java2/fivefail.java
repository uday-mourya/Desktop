import java.util.Scanner;
class Fivefail{
  public static void main (String [] args)
{
  	Scanner sc=new Scanner(System.in);
	System.out.println("Enter PHYSICS Marks");
	int p=sc.nextInt();
	System.out.println("Enter CHEMISTRY Marks");
	int c=sc.nextInt();
	System.out.println("Enter MATHS Marks");
	int m=sc.nextInt();
	System.out.println("Enter HINDI Marks");
	int h=sc.nextInt();
	System.out.println("Enter ENGLISH Marks");
	int e=sc.nextInt();
	
	if(p<33)  
	  {
	    if(c<33)
	      {
		if(m<33)
	             {
	               if(h<33)
	                 { 
	                  if(e<33)
	               
	                   {
	                      System.out.println("FAIL IN ALL SUB...");
	                   }
	                  else
	                   {
	                    System.out.println("FAIL IN FOUR SUB...");
	                    System.out.println("FAIL IN PHYSICS Chemistry,MATHS, hindi");
	                   }
	                 }
	   
	               else
	              {
	   
	              if(e<33)
	              {
	                 System.out.println("FAIL IN FOUR SUB...");
	                 System.out.println("FAIL IN PHYSICS AND MATHS");
	              }   
	              else
	              {
	                System.out.println("FAIL IN THREE SUB...");
	                System.out.println("FAIL IN PHYSICS,CHEMISTRY,MATHS");
	              } 
		else
 		 {
	           if(h<33)
	           {
	            if(e<33)
	            {
	              System.out.println("FAIL IN FOUR SUB...");
	               System.out.println("FAIL IN PHYSICS,chemistry,HINDI,english");
	           
	             }
	            else
	            { 
	              System.out.println("FAIL IN THREE SUB...");
	              System.out.println("FAIL IN PHYSICS,CHEMISTRY,HINDI");
	             } 
	          else
	         {  
	           if(e<33)
	            {
	              System.out.println("FAIL IN Three SUB..");
	              System.out.println("FAIL IN PHYSICS Maths and English");
	           else
	              System.out.println("FAIL IN Two SUB..");
	              System.out.println("FAIL IN PHYSICS Maths ");         
	         
	             }
                 } 
	               
	                 
	        }
	    else
	    {  
	      if(m<33) 
	       { 
	         if(h<33)
	         {
	           if(e<33)
	            {
	              System.out.println("FAIL IN FOUR SUB...");
	               System.out.println("FAIL IN PHYSICS,MATHS,HINDI,english");
	           
	             }
	            else
	            { 
	               System.out.println("FAIL IN THREE SUB...");
	               System.out.println("FAIL IN PHYSICS,Maths,HINDI"); 
	         
	             }
	         else
	         {  
	           if(e<33)
	            {
	              System.out.println("FAIL IN Three SUB..");
	              System.out.println("FAIL IN PHYSICS Maths and English");
	           else
	              System.out.println("FAIL IN Two SUB..");
	              System.out.println("FAIL IN PHYSICS Maths ");   
	             }  
	          }
	    else
           {
            if(h<33)
             {
               if(e<33)
           
             }	         
	      
	   }     
	   }
	    
	  } 
	}    
	        
	
 }
}
