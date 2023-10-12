class Test{
    public static void main(String [] args)
    {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        int a[]=new int [5];
        int i;
        for( i=0;i<a.length;i++)
        a[i]=sc.nextInt();

        for(int x:a)
        {  
            System.out.println("ARRAY ELEMENTS ARE");
            System.out.println(a[x]+" ");
        }
    }
}