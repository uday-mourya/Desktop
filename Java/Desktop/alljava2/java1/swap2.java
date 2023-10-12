import java.util.Scanner;
class To {
 public static void main(String[] args)
 {
	  Scanner rt = new Scanner (System.in);
	  System.out.println("Enter First Number");
	  int a = rt.nextInt();
	  System.out.println("Enter Second Number");
	  int b =rt.nextInt();
	  System.out.println("Before Swap A= " +a+ "B = "+b);
	      a=a+b;
	      b=a-b;
	      a=a-b;
	  System.out.println("After Swap A= " +a+ "B = "+b);    





}
}

