import java.util.Scanner;

class Fibbo {
    // Method to generate Fibonacci series
    static void generateFibonacci(int n) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " ");
        
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci series:");
        generateFibonacci(n);
    }
}