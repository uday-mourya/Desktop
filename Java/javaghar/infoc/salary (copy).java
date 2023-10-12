import java.util.Scanner;
class Colo
{
 public static void main(String Args[])
 { 
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any Salary");
  float S = sc.nextFloat();
  float pf=(float)((S*12)/100);
  System.out.println("Pf="+pf);
  S=S-pf;
  float TA=(float)((S*3.6)/100);
  System.out.println("TA="+TA);
  S=S-TA;
  float DA=(float)((S*7.8)/100);
  System.out.println("DA="+DA);
  S=S-DA;
  System.out.println("Gross salary="+S);
  }
 }
