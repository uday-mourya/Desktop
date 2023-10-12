import java.util.Scanner;
class Test
    {
     public static void main(String args[])
      { 
        Test ob=new Test();
        ob.input();
      }
      public void input()
      {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("how many number you want to Enter");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Array Elements");
        for( int i=0; i<n; i++)
        {                                                    
          a[i]=sc.nextInt();
        }
        System.out.println("Array Element Are ;");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
       }
       
    }
      
     
