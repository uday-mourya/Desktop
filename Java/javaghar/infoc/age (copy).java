import java.util.Scanner;
class Test3
   {
 	public static void main(String Args[])
           {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter any age");
		  int age=sc.nextInt();
		  
		  if(age<=0)
		      { 
		          System.out.println("invalid age");
		      }
		      else
			{ 
		           if(age<=12)
		           System.out.println("you are chid");
	                   else
			       {   
				        if(age<=19)
				        System.out.println("you are teenage");
				        else
				          { 
					       if(age<=59)
					       System.out.println("you are younger");
					       else
					       System.out.println("you are oldest");
				          } 
                              }     
                       }   
           }
   }      
 
    
    
    
    
    
    
    
       
