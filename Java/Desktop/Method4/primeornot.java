class Test
 { 
   public static void  prime(int n, int i, int count)
   { 
    
    while(i<=n)
    {
      if(n%i==0)
       {
        count++;
       }
       i++; 
     }
  
     if(count==2)
        System.out.println("Prime NO");
     else
        System.out.println("Not Prime ");   
   }
   public static void main(String [] args )
   {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    int i=1;
    int count=0;
   

    Test.prime(n,i,count);
   
   }
 }