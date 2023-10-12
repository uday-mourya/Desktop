import java.util.Scanner; 
class Test 
{   
    public void input(Test x)
    {   
        Scanner sc=new Scanner (System.in);
        int a[]=new int[20];
        System.out.println("How many elements want to enter");
        int n=sc.nextInt();
        System.out.println("Enter elements in array");
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter any item");
        int item=sc.nextInt();
        this.Method(a,n,item);
    }
    public int Method(int a[],int n,int item) 
    {   int i;
        boolean b=false;
        for ( i=0;i<n;i++)
        { 
            
                if (a[i]==item)
                {
                    b=true;
                }
        }
        if (b)
        System.out.println ("item found");
        else
        System.out.println ("item not found");
         
          return item;

        }

    public static void main(String[] args) {
          Test ob=new Test();
          ob.input(ob);

    }
}
