import java.util.Scanner;
class Marksheet 
{
   private Scanner sc = new Scanner(System.in);
   private Marksheet a[];
   private int n;
   private String name ;
   private String father;
   private String mother;
   private String standard;
   private String roll;
   private String sec;
   private String year;
   private String sem;
   private int e;
   private int h;
   private int p;
   private int c;
   private int m;
	
     public void  setData()
     {
	 System.out.println("How many students result your want to enter");
	 n = sc.nextInt();
	 a = new Marksheet[n];
         Marksheet marksheet;
					
	for(int i=0; i<n ;i++)
	{
						marksheet = new Marksheet();
						sc.nextLine();
						System.out.println("Enter Your name");
						name = sc.nextLine();
						System.out.println("Enter Your Father");
					        father = sc.nextLine();
						System.out.println("Enter Your mother");
						mother = sc.nextLine();
						System.out.println("Enter Your standard");
						standard = sc.nextLine();
						 boolean repeat;
     					   do {
          					  repeat = false;
          					  System.out.println("Enter Your roll");
          					  roll = sc.nextLine();

            // Check if the roll number already exists
           					 for (int j = 0; j < i; j++) {
               					 if (roll.equals(a[j].roll)) {
                 					   System.out.println("Roll number already exists. Please enter a unique roll number.");
                    						repeat = true;
                   				 break;
                						}
           						 }
      						  } while (repeat);
            				
						System.out.println("Enter Your sec");
						sec = sc.nextLine();
						System.out.println("Enter Year");
						year=sc.nextLine();
						System.out.println("Enter Sem");
						sem=sc.nextLine();

                                              	do{	
							System.out.println("Enter physics number:   ");
							p = sc.nextInt(); 
							if(p<0||p>100)	
							{
								System.out.println("Invalid mark Of physics..!!\nPleas re enter mark..");
							}
						}while(p<0||p>100);
					
						do{
							System.out.println("Enter chemistry number:   "); 
							c = sc.nextInt();
							if(c<0||c>100)	
							{
								System.out.println("Invalid mark Of chemistry..!!\nPleas re enter mark..");
							}
						}while(c<0||c>100);
				
						do{
							System.out.println("Enter math number:   ");
							m = sc.nextInt();
				  			if(m<0||m>100)	
							{
								System.out.println("Invalid mark Of math..!!\nPleas re enter mark..");
							}	
				 		}while(m<0||m>100);

						do{	 
							System.out.println("Enter hindi number:   ");
							h = sc.nextInt();
							if(h<0||h>100)	
							{
								System.out.println("Invalid mark Of Hindi..!!\nPleas re enter mark..");
							}	
						}while (h<0||h>100);
				
				 		do{	
							System.out.println("Enter english number:   ");
							e = sc.nextInt();
							if(e<0||e>100)	
							{
								System.out.println("Invalid mark Of English..!!\nPleas re enter mark..");
							}			
						}while(e<0||e>100);
						
							marksheet.name = name;
							marksheet.father = father;
							marksheet.mother = mother;
							marksheet.standard= standard;
							marksheet.roll = roll;
							marksheet.sec = sec;
							marksheet.year  = year;
							marksheet.sem  = sem;
							marksheet.n = n;
					
							marksheet.e = e;
							marksheet.h = h;
							marksheet.p = p;
							marksheet.c = c;
							marksheet.m = m;
						        a[i] = marksheet;
        
					}

					
							
		
	}
	public void searchByName(String searchName) 
	{
    		boolean found = false;
    		for (int i = 0; i < n; i++) 
		{
        		if (name == a[i].name) 	
			{
            			a[i].getData();
            			found = true;
        		}
    		}
    		if (!found) 
		{
        		System.out.println("No marksheet found for the given name.");
    		}
	}

	public void getData()
	{
		for(int i=0; i<n;  i++)
		{
			System.out.println("|-------------------------------------------------------------------------|");
				
				System.out.println("|\t\t\t\tRGPV BHOPAL                               ");
				System.out.println("|\tRoll\t: "+a[i].roll+"\t\t\t\t\tClass : "+a[i].standard+"      ");
				System.out.println("|\tName\t: "+a[i].name+"\t\t\t\t\tsection : "+a[i].sec+"  ");	
				System.out.println("|\tFName\t: "+a[i].father+"\t\t\t\t\tSem    : "+a[i].sem+"      ");
				System.out.println("|\tMName \t: "+a[i].mother+"\t\t\t\t\tYear   : "+a[i].year+"     ");
				System.out.println("|");
				System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
				System.out.println("|\tBte101       physics        100            33            "+a[i].p+"       ");
				System.out.println("|\tBte102       chemestr       100            33            "+a[i].c+"       ");
				System.out.println("|\tBte103       Mathes         100            33            "+a[i].m+"       ");
				System.out.println("|\tBte104       Hindi          100            33            "+a[i].h+"       ");
				System.out.println("|\tBte105       English        100            33            "+a[i].e+"       ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		}
		
	}
}

class Test 
{
   public static void main(String args[])
  {
     Marksheet ob = new Marksheet();		
     Scanner sc = new Scanner(System.in);		
     ob.setData();
		//ob.getData();
     System.out.println("Enter the name to search:");
     String searchName = sc.nextLine();
     ob.searchByName(searchName);	
		
  }
}
