class Newmark
{
  public static void main(String [] args)
 { 
  java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter PHYSICS Marks");
	int p=sc.nextInt();
	System.out.println("Enter CHEMISTRY Marks");
	int c=sc.nextInt();
	System.out.println("Enter MATHS Marks");
	int m=sc.nextInt();
	  int total =p+c+m;
	  double per =total/3.0;
	
        if(p<0&&c<0&&m<0||p>100&&c>100&&m>100||p<0||c<0||m<0||p>100||c>100||m>100)
        
          System.out.println("INVALID MARKS");
        else if(p<33&&c<33&&m<33){
          System.out.println("FAIL IN ALL SUB...");
          System.out.println("FAIL IN PHYSICS CHEMISTRY MATHS");
          }
        else if((p<33&&c<33)||(p<33&&m<33)||(c<33&&m<33))
        
          System.out.println("FAIL IN TWO SUB...");
          if(p<33&&c<33){ 
           System.out.println("FAIL IN PHYSICS CHEMISTRY");
          }
          if((p<33&&m<33)){ 
            System.out.println("FAIL IN PHYSICS AND MATHS");
	              }   
          if(c<33&&m<33)
          {
             System.out.println("FAIL IN Chemisrty Maths "); 
          }
          
        else if(p<33||c<33||m<33)
        {
            
          System.out.println("FAIL IN ONE SUB...");
          if(p<33)
            System.out.println("FAIL IN PHYSICS");
          if(c<33) 
            System.out.println("FAIL IN CHEMISTRY");
          if(m<33) 
            System.out.println("FAIL IN MATHS"); 
         }   
        else if(per>=60)
	      System.out.println("PASS IN FIRST DIVISION");
	   else if(per>=45)
	      System.out.println("you pass second division");
	   else if (per>=33)
	      System.out.println("you pass third division");
	   
	    System.out.println("YOUR TOTAL Marks "+total);
	    System.out.println("PERCENTAGE "+per);
 }
}
