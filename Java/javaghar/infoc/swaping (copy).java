
class Swaping {
      public static void main(String args[])
      {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.println("Enter first number");
      int a = sc.nextInt();
      System.out.println("Enter second number");
      int b = sc.nextInt();
      System.out.println("Before swaping A="+a+"b="+b);
      int temp=a;
            a=b;        
            b=temp;
         System.out.println("After swaping A="+a+"b="+b);
         }
        }        
