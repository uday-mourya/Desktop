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
        System.out.println("Enter principal rate and time");
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int x=this.cal(p,r,t);
        System.out.println("Simple i="+x);
    }
    public int cal(int p,int r,int t)
    {
        int si=(p*r*t)/100;  
       // System.out.println("simple interest is="+new Test().input());
    return si;
   }
} 
   
