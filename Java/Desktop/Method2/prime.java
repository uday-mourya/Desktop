class Test
{
  public static void prime()
  { 
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("Enter Number");
     int n=sc.nextInt();
     int i=2;
     while(i<n)
     {
      if(n%i==0)
      break;
     i++;
     }
  
     if(i==n)
       System.out.println("Prime No...");
     else
       System.out.println("Not Prime No.. ");   
   }
    public void show(Test k)
    {
     k.prime(); 
    } 
    public static void main(String [] args)
    {
    
     Test ob =new Test();
     ob.show(ob);
   
    }
}
   
