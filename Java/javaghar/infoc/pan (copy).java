import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Pancard
{
 public static void main(String args[])
 { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Department name");
    String Depart = sc.nextLine();
    System.out.println("Enter Government name");
    String Gov = sc.nextLine();
    System.out.println("Enter pan number");
    String Pan = sc.nextLine();
    System.out.println("Enter your name");
    String name = sc.nextLine();
    System.out.println("Enter father name");
    String father = sc.nextLine();
    System.out.println("Enter DOB");
    String DOB = sc.nextLine();
    System.out.println("_______________________________________________________");
    System.out.println("|"+Depart+     "DEPARTMENT   *O*   GOVT.OF."+Gov+"       |");
    System.out.println("|                         ***                         |");
    System.out.println("|                         *o*                         |");
    System.out.println("| ---------                                           |");
    System.out.println("| |\t  |                                           |");
    System.out.println("| |\t  | Permanent Account Number Card _______     |");   
    System.out.println("| |\t  |                              |.......|    |");    
    System.out.println("| |\t  |        "+Pan+"            |.......|    |");
    System.out.println("| |\t  |                              |.......|    |"); 
    System.out.println("| ---------                              |_______|    |"); 
    System.out.println("| Name                                                |");
    System.out.println("| "+name+"                                         |");
    System.out.println("| Father Name                                         |");
    System.out.println("| "+father+"                                          |");
    System.out.println("| Date of Birth        shyam                          |");
    System.out.println("| "+DOB+"          Signature                       |");
    System.out.println("|_____________________________________________________|");
    }
 }   
