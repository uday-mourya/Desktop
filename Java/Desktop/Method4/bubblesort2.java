import java.util.Scanner;
class Test
{  
    public void input(Test x)
    {  
        Scanner sc=new Scanner (System.in);
        int a[]=new int[20];
        System.out.println("how many elements want to enter");
        int n=sc.nextInt();
        System.out.println("enter elements in array");
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        this.Method(a,n);
    }
    public int Method(int a[],int n)
    {   int i,temp;
        for ( i=0;i<n;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;

                }
            }
        }
        for ( i=0;i<n;i++)
        {
         System.out.println(" "+a[i]);
        }
        return a[i];
    }
   
    public static void main(String[] args) {
          Test ob=new Test();
          ob.input(ob);

    }
}
