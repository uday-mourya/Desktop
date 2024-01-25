import java.util.Scanner;

class p {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = sc.nextInt();
		int i = 1;
		int pro = 1;
		while (i <= n) {
			pro = pro * i;
			i++;

		}
		System.out.println("product = " + pro);
	}
}
