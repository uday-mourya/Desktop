 class Test
 { 
   public static void  arm()
   { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    int m=n;
    int count=0 ;
    while(n>0)
    {
      count++;
      n/=10;
    }
     while(n>0)
     {
       int r=n%10;
       int i=1,pow=1,sum=0;
       while(i<=count)
       {
         pow*=r;
         i++;
       }
       sum+=pow;
       n=n/10;
     }
     
     if(m==sum)
        System.out.println("Prime NO");
     else
        System.out.println("Not Prime ");   
   }
   public static void main(String [] args )
   {
    Test ob=new Test();
    ob.arm();
   
   }
 }

