class Logicalmark2{
  public static void main(String [] args)
 { 
  java.util.Scanner sc=new java.util.Scanner(System.in);
          System.out.println("Enter Your Roll No....");
   	  int a = sc.nextInt();
   	  System.out.println("Enter Your Course....");
   	  String b = sc.next();
   	  System.out.println("Enter Your Name....");
   	  String l = sc.next();
   	  System.out.println("Enter Your Branch....");
   	  String r = sc.next();
   	  System.out.println("Enter Your Father Name....");
   	  String s = sc.next();
   	  System.out.println("Enter Your Semester....");
   	  String d = sc.next();
   	  System.out.println("Enter Your Mother Name....");
   	  String e = sc.next();
   	  System.out.println("Enter Your Year....");
   	  String j = sc.next();
   	   
	  System.out.println("Enter PHYSICS Marks");
	  int p=sc.nextInt();
	  System.out.println("Enter CHEMISTRY Marks");
	  int c=sc.nextInt();
	  System.out.println("Enter MATHS Marks");
	  int m=sc.nextInt();
   	  System.out.println(" \t\t\t\t\t\t\tDAVV-INDORE                               ");
 	  System.out.println("");
 	  System.out.print("\tROLL NO :"+a );
 	  System.out.println("\t\t\t\t\t\t\t\t\t\tCourse   :"+b );
 	  System.out.print("\tName    :"+l );
 	  System.out.println("\t\t\t\t\t\t\t\t\t\tBranch   :"+m );
 	  System.out.print("\tF Name  :"+c );
 	  System.out.println("\t\t\t\t\t\t\t\t\t\tSemester :"+b );
 	  System.out.print("\tM Name  :"+e );
 	  System.out.println("\t\t\t\t\t\t\t\t\t\tYear     :"+j );
  	  System.out.println();
 	  System.out.println("\tSub Code \t\t  Sub Name \t\t  Max Marks \t\t  Min Marks \t\t OBT Marks");
 	  System.out.println("\tCSE-152  \t\t  physics  \t\t   70       \t\t  33        \t\t " +p);
 	  System.out.println("\tCSE-153  \t\t  chemistry\t\t   70       \t\t  33        \t\t " +c);
 	  System.out.println("\tCSE-154  \t\t  Maths    \t\t   70       \t\t  33        \t\t " +m);
      
	   int total =p+c+m;
	   double per =total/3.0;

        if((p<0&&c<0&&m<0)||(p>100&&c>100&&m>100)||p<0||c<0||m<0||p>100||c>100||m>100)
          System.out.println("INVALID MARKS");
        else if(p<33&&c<33&&m<33)
          System.out.println("FAIL IN ALL SUB...");
        else if((p<33&&c<33)||(p<33&&m<33)||(c<33&&m<33))  
          System.out.println("FAIL IN TWO SUB...");
        else if(p<33||c<33||m<33)
          
          System.out.println("FAIL IN ONE SUB...");
          
        else
        {
     
	   System.out.println("YOUR TOTAL NUMBER "+total);
	   System.out.println("PERCENTAGE"+per);
	   }
	   
	   if(per>=60)
	      System.out.println("PASS IN FIRST DIVISION");
	   else if(per>=45)
	      System.out.println("you pass second division");
	   else if (per>=33)
	      System.out.println("you pass third division");
	   else 
	      System.out.println("---FAIL---"); 
	        
 }
 }
