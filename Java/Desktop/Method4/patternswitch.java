import java.util.Scanner;
class Test
{
    public static void main(String []args)
    {
      new Test().input();
    }
    public void input()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Your choices are");
    	System.out.println("press 1 - *");
    	System.out.println("          **");
    	System.out.println("          ***");
    	System.out.println("________________ ");
    	System.out.println("press 2 - 1 2 3");
    	System.out.println("          1 2  ");
    	System.out.println("          1    ");
    	System.out.println("_______________");
    	System.out.println("press 3 - ****");
    	System.out.println("          ***");
        System.out.println("          **"); 
        System.out.println("          *");
        System.out.println("_______________");
        System.out.println("press 4 - 54321");
        System.out.println("           4321");
        System.out.println("            321");
        System.out.println("             21");
        System.out.println("              1");
        System.out.println("_______________");
        System.out.println("press 5 - *****");
        System.out.println("           ****");
        System.out.println("            ***");
        System.out.println("             **");
        System.out.println("              *");
        System.out.println("________________");
        System.out.println("press 6 - 12345");
        System.out.println("           2345");
        System.out.println("            345");
        System.out.println("             45");
        System.out.println("              5");
        System.out.println("_________________");
        System.out.println("press 7 - 11111");
        System.out.println("           2222");
        System.out.println("            333");
        System.out.println("             44");
        System.out.println("              5");
        System.out.println("_________________");
    	System.out.println("press 8 - **");
    	System.out.println("          ****");
    	System.out.println("          ******");
    	System.out.println("________________ ");
        System.out.println("press 9 - *");
    	System.out.println("          ***");
    	System.out.println("          *****");
    	System.out.println("________________ ");
    	System.out.println("press 10 - *");
    	System.out.println("           **");
    	System.out.println("           ****");
    	System.out.println("           *******");
    	System.out.println("________________ ");
        System.out.println("Enter your choice");
    	int ch=sc.nextInt();
    	System.out.println("_______________");
    	System.out.println("Set Range");
    	int n=sc.nextInt();
    	
     switch(ch)
     {
    	case 1: new Test().first(n);
    	break;
    	case 2: new Test().second(n);
    	break;
    	case 3: new Test().third(n);
    	break; 
    	case 4: new Test().fourth(n);
    	break;
    	case 5: new Test().fifth(n);
    	break;
       case 6: new Test().sixth(n);
       break;
       case 7: new Test().seven(n);
       break;
       case 8: new Test().eight(n);
        break;
       case 9: new Test().nine(n);
       break;
       case 10: new Test().ten(n);
       break;
     }
   }
    public void first(int n)
    {    	
    	for(int i=1; i<n; i++)
    	{
    	   for(int j=1; j<i; j++)
    	   {
    	       System.out.print(" *");
    	   }
    	   System.out.println("\n");
       }
    }    	   
    public void second(int n)
    {
    	for(int i=n; i>1; i--)
    	{
    	   for(int j=1; j<=i; j++)
    	   {
    	       System.out.print(" "+j);
    	   }
    	   System.out.println("\n");
       }
    }
    public void third(int n)
    {
    	for(int i=n; i>=1; i--)
    	{
    	   for(int j=1; j<=i; j++)
    	   {
    	       System.out.print(" *");
    	   }
    	   System.out.println("\n");
        }
    }
     public void fourth(int n)
    {
    	for(int i=1; i<=n; i++)
    	{
    	   for(int j=1; j<=n; j++)
    	   {   	      
    	       if(i<=j)
    	       System.out.print((n-j+1)+" ");
    	       else
    	       System.out.print("  ");    	     
    	   }
    	  System.out.println(); 
        }    
    }
      public void fifth(int n)
      {
    	for(int i=1; i<=n; i++)
    	{
    	   for(int j=1; j<=n; j++)
    	   {   	      
    	       if(i<=j)
    	       System.out.print("* ");
    	       else
    	       System.out.print("  ");    	     
    	   }
    	  System.out.println(); 
        }    
     }
      public void sixth(int n)
     {
    	for(int i=1; i<=n; i++)
    	{
    	   for(int j=1; j<=n; j++)
    	   {   	      
    	       if(i<=j)
    	       System.out.print(j+" ");
    	       else
    	       System.out.print("  ");    	     
    	   }
    	  System.out.println(); 
        }        
    }
      public void seven(int n)
     {
    	for(int i=1; i<=n; i++)
    	{
    	   for(int j=1; j<=n; j++)
    	   {   	      
    	       if(i<=j)
    	       System.out.print(i+" ");
    	       else
    	       System.out.print("  ");    	     
    	   }
    	  System.out.println(); 
        }    
    }
     public void eight(int n)
    {    	
    	for(int i=1; i<=n; i++)
    	{
    	   for(int j=1; j<=i*2; j++)
    	   {
    	       System.out.print(" *");
    	   }
    	   System.out.println("\n");
       }
    }  
    public void nine(int n)
    {    	
    	for(int i=1; i<=n; i++)
    	{
    	   for(int j=1; j<i*2; j++)
    	   {
    	       System.out.print(" *");
    	   }
    	   System.out.println("\n");
       }
    }
     public void ten(int n)
    {    	int k=1;
    	for(int i=1; i<=n; i++)
    	{
    	   for(int j=1; j<=k; j++)
    	   {
    	     System.out.print(" *");
    	   }
    	   k=k+i;
    	   System.out.println("\n");
       }
    }    	
} 	    	    
     		       
    	        	
     
