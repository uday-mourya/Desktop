import java.util.Scanner;
class Loan {
    public static void main(String[] args) {
        System.out.println("enter desired loan amt.");
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        System.out.println("enter Annual Income");
        int b=sc.nextInt();
        System.out.println("what will the loan be used for");
        Scanner sj=new Scanner(System.in);
        String c=sj.nextLine();
        System.out.println("Name");
        String d=sj.nextLine();
        System.out.println("DOB");
        String e=sj.nextLine();
        System.out.println ("Phone no.");
        int f=sc.nextInt();
        System.out.println("email address");
        String g=sj.nextLine();
        System.out.println("Street address");
        String h=sj.nextLine();
        System.out.println("city \t Region");
        String i=sj.nextLine();
        String j=sj.nextLine();
        System.out.println ("postal \t Country");
        String k=sj.nextLine();
        String l=sj.nextLine();
        System.out.println ("Job title");
        String m=sj.nextLine();
        System.out.println ("Employer name");
        String n=sj.nextLine();
        System.out.println("enter 1 for apply");
        int o=sc.nextInt();
    }
} 
