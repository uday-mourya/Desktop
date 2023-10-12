import java.util.Scanner;
class With{
 public static void main(String[] args)
 {
	  Scanner rt = new Scanner (System.in);
	  System.out.println("Enter First Number");
	  int a = rt.nextInt();
	  System.out.println("Enter Second Number");
	  int b =rt.nextInt();
	  System.out.println("Before Swap A= " +a+ "B = "+b);
	      b=a*b;
	      a=b/a;
	      b=b/a;
	  System.out.println("After Swap A= " +a+ "B = "+b);    





}
}

