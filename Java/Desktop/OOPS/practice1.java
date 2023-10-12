class Addition
{  
    private int a,b;
    public void display(int x,int y)
    {
       a=x; 
       b=y;
       System.out.println(" A = "+a+ "B = "+b);
    }
    
}
class Test
{    
    public static void main(String [] args)
    { 
       System.out.println("Welcome in main Method");
       //System.out.println("Enter Two Number");
       //int a=sc.nextInt();
       //int b=sc.nextInt();
       Addition ob=new Addition();
       ob.display(6,7);
    } 
}   
