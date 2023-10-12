import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Marksheet
{
 public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter university name");
    String DAVV = sc.nextLine();
    System.out.println("Enter  roll number");
    String roll = sc.nextLine();
    System.out.println("Enter course name");
    String course = sc.nextLine();
    System.out.println("Enter your name");
    String name = sc.nextLine(); 
    System.out.println("enter Branch name");
    String Branch = sc.nextLine();
    System.out.println("Enter father name");
    String father = sc.nextLine();
    System.out.println("Enter mother name");
    String mother = sc.nextLine();
    System.out.println("Enter sem name");
    String SEM = sc.nextLine();
    System.out.println("Enter year");
    String year = sc.nextLine(); 
   
  
    System.out.println("Enter your physics marks");  
    int p=sc.nextInt();
    System.out.println("Enter your Chemistry marks");
    int c=sc.nextInt();
    System.out.println("Enter your Maths marks ");
    int m=sc.nextInt(); 
    System.out.println("Enter your Hindi marks ");
    int h=sc.nextInt(); 
    System.out.println("Enter your English marks");
    int e=sc.nextInt();
    System.out.println("___________________________________________________________________________________");
    System.out.println("|\t\t\t\t"+DAVV+"\t\t\t\t\t   |");
    System.out.println("|\t\t\t\t\t\t\t\t\t\t   |");
    System.out.println("|   Roll\t:"+roll+"\t\t\t\t\t\tCourse:"+course+"\t   |");
    System.out.println("|   Name\t:"+name+"\t\t\t\t\tBranch:"+Branch+"\t   |");
    System.out.println("|   Father name :"+father+"\t\t\t\t\tsem:"+SEM+"\t\t   |");
    System.out.println("|   Mother name :"+mother+"\t\t\t\t\tyear:"+year+"\t   |");
    System.out.println("|\t\t\t\t\t\t\t\t\t\t   |");
    System.out.println("|   SubCode\t\tSubName\t\tMaxMarks\tMinMarks\tObtMarks  |");
    System.out.println("|   Bse-502\t\tPhysics  \t70\t\t33\t\t"+p+"\t   |");
    System.out.println("|   Bse-503\t\tChemistry\t70\t\t33\t\t"+c+"\t   |");
    System.out.println("|   Bse-507\t\tMaths    \t70\t\t33\t\t"+m+"\t   |");
    System.out.println("|   Bse-509\t\tHindi    \t70\t\t33\t\t"+h+"\t   |");
    System.out.println("|   Bse-505\t\tEnglish  \t70\t\t33\t\t"+e+"\t   |");
    System.out.println("|_________________________________________________________________________________| ");
   }
   }
    
