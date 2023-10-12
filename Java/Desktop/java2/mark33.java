class Mark33{
  public static void main(String [] args)
 { 
  java.util.Scanner sc=new java.util.Scanner(System.in);
       
        System.out.println("Enter PHYSICS Marks");
	int p=sc.nextInt();
	System.out.println("Enter CHEMISTRY Marks");
	int c=sc.nextInt();
	System.out.println("Enter MATHS Marks");
	int m=sc.nextInt();
	
        if(p<0&&c<0&&m<0||p>100&&c>100&&m>100)
          System.out.println("INVALID MARKS");
        else if(p<33&&c<33&&m<33)
          System.out.println("FAIL IN ALL SUB...");
        else if((p<33&&c<33)||(p<33&&m<33)||(c<33&&m<33))  
          System.out.println("FAIL IN TWO SUB...");
        else if(p<33||c<33||m<33)  
          System.out.println("FAIL IN ONE SUB...");
        else 
        
         int total =p+c+m;
	 double per =total/3.0;
	 System.out.println("YOUR TOTAL NUMBER "+total);
	 System.out.println("PERCENTAGE"+per);
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
