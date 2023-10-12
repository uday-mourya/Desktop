 class Test
 { 
   public static void  prime()
   { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    int i=2;
    int flag=1;
    while(i<n)
    {
     if(n%i==0)
      {
       flag=0;
       break;
      }    
     i++;
    }
     if(flag==1)
        System.out.println("Prime NO");
     else
        System.out.println("Not Prime ");   
   }
    public void show(Test k)
   {
     k.prime(); 
   }
   public static void main(String [] args )
   {
    Test ob=new Test();
    ob.show(ob);
   
   }
 }

