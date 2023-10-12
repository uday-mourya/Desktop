class Test
{
   public void one(int n)
   {
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
       System.out.print("*");
      }
      System.out.println();
    }
     
   }
   public void two(int n)
   { 
    
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }    
      System.out.println();
     }
     
   }
   public void three(int n)
   {
    int num=1;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(num+ " ");
        ++num;
      }
      System.out.println();
     
     }
     
   }
   public void four(int n)
   {
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
       System.out.print(i);
      }
      System.out.println();
     }
     
   }
   public void five (int n)
   {
    for(int i=n;i>1;i--)
    {
      for(int j=1;j<=i;j++)
      {
       System.out.print("*");
      }
      System.out.println();
     }
     
   }
   public void six (int n)
   {
    for(int i=n;i>=1;i--)
    {
      for(int j=1;j<=i;j++)
      {
       System.out.print(i);
      }
      System.out.println();
     }
     
   }
     public void seven(int n)
     {
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n-i;j++)
        {
          System.out.print("*");
        }
         System.out.println();
      }
     }
   public void eight (int n)
   {
    for(int i=n;i>=1;i--)
    {
      for(int j=1;j<=i;j++)
      {
       System.out.print(i);
      }
       System.out.println();
    }
     
 }
  public static void main(String [] args)
  {  
     java.util.Scanner sc=new java.util.Scanner(System.in); 
     System.out.println("#1 for  #2 For");
     System.out.println("\t\t ----------------------- ");
     System.out.println("\t\t|  *       \t1          |");
     System.out.println("\t\t|  **      \t1 2        | ");
     System.out.println("\t\t|  ***     \t1 2 3      |");
     System.out.println("\t\t|  ****    \t1 2 3 4    |");
     System.out.println("\t\t|  *****   \t1 2 3 4 5  |");
     System.out.println("\t\t|  #3for   #4 For       |"); 
     System.out.println("\t\t|  1       \t1          |");
     System.out.println("\t\t|  23      \t2 2        | ");
     System.out.println("\t\t|  456     \t3 3 3      |");
     System.out.println("\t\t|  78910   \t4 4 4 4    |");
     System.out.println("\t\t|  -----   \t5 5 5 5 5  |");
     System.out.println("\t\t|  #5 for  #6 For       |");
     System.out.println("\t\t|  *****   \t5 5 5 5 5  |");
     System.out.println("\t\t|  ****    \t4 4 4 4    | ");
     System.out.println("\t\t|  ***     \t3 3 3      |");
     System.out.println("\t\t|  **      \t2 2        |");
     System.out.println("\t\t|  #7 for  #8 For       |");
     System.out.println("\t\t|  *****   \t5 5 5 5 5  |");
     System.out.println("\t\t|  ****    \t4 4 4 4    | ");
     System.out.println("\t\t|  ***     \t3 3 3      |");
     System.out.println("\t\t|  **      \t2 2        |");
     System.out.println("\t\t|  *       \t1          |");
     System.out.println("\t\t -----------------------");
     System.out.println("\t\tEnter Your choice ");
     int ch=sc.nextInt();
     System.out.println("\t\tEnter Range");
     int n=sc.nextInt();
     switch(ch)
     {
      case 1: 
       new Test().one(n);
       break;
      case 2:
       new Test().two(n);
      break;
      case 3:new Test().three(n);
      break;
      case 4:
       new Test().four(n);
      break;
      case 5:
       new Test().five(n);
      break;
      case 6:
       new Test().six(n);
       break;
      case 7:new Test().seven(n);
       break;
      case 8:new Test().eight(n);
      
     
     
     
     
     }
  }
}  
 
