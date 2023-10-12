import java.util.Scanner;
class Switchvoco{
  public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.outprintln("Enter Any Character : ");
	char ch=sc.nextInt().charAt(0);
	switch(ch)
	case'a':
	case'e':
	case'i':
	case'o':
	case'u':
	  System.out.println("Vowel");
	default:  
	  System.out.println("Consonent");
	
	
	
}
}	
