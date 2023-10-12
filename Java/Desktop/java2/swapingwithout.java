import java.util.Scanner;
class Swapwithout{
  public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
	System.out.println("Enter Second Number :");
	int a = sc.nextInt();
   	System.out.println("Enter Second Number :");
   	int b = sc.nextInt();
   	System.out.println("Before Swap A= " +a+ "B = "+b);
	      a=a^b;
	      b=a^b;
	      a=a^b;
	  System.out.println("After Swap A= " +a+ "B = "+b);    


}
}
