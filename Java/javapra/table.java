public class table {
    public static void main(String[] args) {
        java.util.Scanner ob=new java.util.Scanner(System.in);
        System.out.println("Enter any Number");
        int a=ob.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
