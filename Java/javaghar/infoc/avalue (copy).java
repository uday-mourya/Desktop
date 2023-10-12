//ASCCI value
import java.util.Scanner;
class Ascci
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of the character");
char a = sc.next().charAt(0);
int Asccivalue = a;
System.out.println("ASCCI value is =" +Asccivalue);
}
}
