class Addition
{  
    private int a,b;
    public void display()
    {
       System.out.println(" A = "+a+ "B = "+b);
    }
    
}
class Test
{    
    public static void main(String [] args)
    { 
       java.util.Scanner sc=new java.util.Scanner(System.in);
       System.out.println("Welcome in main Method");
       Addition ob=new Addition();
       ob.display();
    } 
}   
