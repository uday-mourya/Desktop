import java.lang.String;
import java.util.Scanner;

class persion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first persion age");
        int a = sc.nextInt();
        System.out.println("Enter second persion age");
        int b = sc.nextInt();
        System.out.println("Enter third persion age");
        int c = sc.nextInt();
        System.out.println("Enter fourth persion age");
        int d = sc.nextInt();

        // if((a>b&&a>c&&a>d)||(b>a&&b>c&&b>d)||(c>a&&c>b&&c>d)||(d>a&&d>b&&d>c))
        // {
        // System.ou.println("A is Greatest");
        // }
        if (a > b && a > c && a > d) {
            System.out.println("A is greatest");
        } else if (b > a && b > c && b > d) {
            System.out.println("B is greatest");
        } else if (c > a && c > b && c > d) {
            System.out.println("C is greatest");
        } else {
            System.out.println("D is greatest");
        }

    }
}
