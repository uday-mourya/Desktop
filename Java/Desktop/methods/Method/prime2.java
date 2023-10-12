 class Test
 { 
   public static void  prime()
   { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    int i=1;
    int count=0;
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
    Test ob=new Test();
    ob.prime();
   
   }
 }

