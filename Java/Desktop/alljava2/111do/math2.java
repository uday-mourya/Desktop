import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any Number");
    int x=sc.nextInt();
    System.out.println("Enter any Power");
    int y=sc.nextInt();
    
       System.out.println( "Power of " +x+ "and "+y+ " = "+Math.pow(x,y));
       System.out.println( "Power of 2 and 2 Is= "+Math.pow(2,2));
       System.out.println( "Power of 4 and 4 Is = "+Math.pow(4,4));
       System.out.println( "Power of 10 and 10 Is= "+Math.pow(10,10));
 }
}    
