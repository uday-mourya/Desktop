import java.util.Scanner;
class Marksheet 
{
	private Scanner sc = new Scanner(System.in);
	private Marksheet a[];
	private int n;
	private String name ;
	private String father;
	private String mother;
	private String course;
	private String roll;
	private String branch;
	private String year;
	private String sem;
	private int total;
	private int e;
	private int h;
	private int p;
	private int c;
	private int m;
	private double per;
	
	
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
						System.out.println("Enter Your course");
						course = sc.nextLine();
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
            				
						System.out.println("Enter Your branch");
						branch = sc.nextLine();
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
							total=(p+c+m+h+e);
				  		        per =(total/5);
						
							marksheet.name = name;
							marksheet.father = father;
							marksheet.mother = mother;
							marksheet.course= course;
							marksheet.roll = roll;
							marksheet.branch = branch;
							marksheet.year  = year;
							marksheet.sem  = sem;
							marksheet.n = n;
					
							marksheet.e = e;
							marksheet.h = h;
							marksheet.p = p;
							marksheet.c = c;
							marksheet.m = m;
							marksheet.total = total;
							marksheet.per= per;
						        a[i] = marksheet;
        
					}

					
							
		
	}
	public void searchByName(String Name) 
	{
    		boolean found = false;
    		for (int i = 0; i < n; i++) 
		{
        		if (Name.equals(a[i].name)) 	
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
	public void all()
	{
		for(int i=0; i<n; i++)
			a[i].getData();
	}
	public void searchByRoll(String roll) 
	{
    		boolean found = false;
    		for (int i = 0; i < n; i++) 
		{
        		if (roll.equals(a[i].roll)) 	
			{
            			a[i].getData();
            			found = true;
        		}
    		}
    		if (!found) 
		{
        		System.out.println("No marksheet found for the given Roll number.");
    		}
	}

	public void getData()
	{
	
		
			System.out.println("|-------------------------------------------------------------------------|");
				
				System.out.println("|\t\t\t\tRGPV BHOPAL                               ");
				System.out.println("|\tRoll\t: "+this.roll+"\t\t\t\t\tCourse : "+this.course+"      ");
				System.out.println("|\tName\t: "+this.name+"\t\t\t\t\tBranch : "+this.branch+"  ");	
				System.out.println("|\tFName\t: "+this.father+"\t\t\t\t\tSem    : "+this.sem+"      ");
				System.out.println("|\tMName \t: "+this.mother+"\t\t\t\t\tYear   : "+this.year+"     ");
				System.out.println("|");
				System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
				System.out.println("|\tBte101       physics        100            33            "+this.p+"       ");
				System.out.println("|\tBte102       chemestr       100            33            "+this.c+"       ");
				System.out.println("|\tBte103       Mathes         100            33            "+this.m+"       ");
				System.out.println("|\tBte104       Hindi          100            33            "+this.h+"       ");
				System.out.println("|\tBte105       English        100            33            "+this.e+"       ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				 if(p<33 && c<33 && m<33 && h<33 && e<33)
          System.out.print("|\t\t\tFail in all Subjects.                                                       ");
       else if((p<33 && c<33 && m<33 && h<33 )||(p<33 && c<33 && h<33 && e<33)||(p<33 && m<33 && h<33 && e<33)||(c<33 && m<33 && h<33 && e<33))
       {
       if(p<33 && c<33 && m<33 && h<33 )
           System.out.print("|\t\t\tFail in Phy.,Chem.,Maths,Hindi.");
       else if(p<33 && c<33 && m<33 && e<33)
           System.out.print("|\t\t\tFail in Phy.,Chem.,Maths,English.                                           ");       
       else if(p<33 && c<33 && h<33 && e<33)
           System.out.print("|\t\t\tFail in Phy.,Chem.,Hindi,English.                                           ");    
       else if(p<33 && m<33 && h<33 && e<33)
           System.out.print("|\t\t\tFail in Phy.,Maths,Hindi,English.                                           ");
       else if(c<33 && m<33 && h<33 && e<33)
           System.out.print("|\t\t\tFail in Phy.,Chem.,Maths,English.                                           ");    
       }
       
       else if((p<33 && c<33 && m<33 )||(p<33 && c<33 && h<33)||(p<33 && m<33 && e<33)||(p<33 && m<33 && e<33)||(p<33 && m<33 && h<33)||(c<33 && m<33 && e<33)||(c<33 && m<33 && h<33)||(c<33 && h<33 && e<33)||(m<33 && h<33 && e<33))
       {
       if(p<33 && c<33 && m<33 )
           System.out.print("|\t\t\tFail in Phy.,Chem.,Maths.                                                   ");
       else if(p<33 && c<33 && h<33)
           System.out.print("|\t\t\tFail in Phy.,Chem.,Hindi.                                                   ");
       else if(p<33 && c<33 && e<33)
           System.out.print("|\t\t\tFail in Phy.,Chem.,English.                                                 ");   
       else if(p<33 && m<33 && e<33) 
           System.out.print("|\t\t\tFail in Phy.,Maths,English.                                                 ");
       else if(p<33 && m<33 && h<33)
           System.out.print("|\t\t\tFail in Phy.,Maths,Hindi.                                                   ");  
       else if(c<33 && m<33 && e<33)
           System.out.print("|\t\t\tFail in Chem.,Maths,English.                                                ");      
       else if(c<33 && m<33 && h<33)
           System.out.print("|\t\t\tFail in Chem.,Maths,Hindi.                                                  ");      
       else if(c<33 && h<33 && e<33)
           System.out.print("|\t\t\tFail in Chem.,Hindi,English.                                                ");      
       else if(m<33 && h<33 && e<33)
           System.out.print("|\t\t\tFail in Maths,Maths,English.                                                ");      
       }
       
       else if((p<33 && c<33 )||(p<33 && m<33 )||(p<33 && h<33 )||(p<33 && e<33 )||(c<33 && m<33 )||(c<33 && h<33 )||(c<33 && e<33 )||(m<33 && h<33)||(m<33 && e<33)||(h<33 && e<33))
       {
       if(p<33 && c<33 )
           System.out.print("|\t\t\tFail in Phy.,Chem..                                                         ");    
       else if(p<33 && m<33 )
           System.out.print("|\t\t\tFail in Phy.,Maths.                                                         ");      
       else if(p<33 && h<33 )
           System.out.print("|\t\t\tFail in Phy.,Hindi.                                                         ");    
       else if(p<33 && e<33 )
           System.out.print("|\t\t\tFail in Phy.,English.                                                       "); 
       else if(c<33 && m<33 )
           System.out.print("|\t\t\tFail in Chem.,Maths.                                                        ");  
       else if(c<33 && h<33 )
           System.out.print("|\t\t\tFail in Chem.,Hindi.                                                        "); 
       else if(c<33 && e<33 )
           System.out.print("|\t\t\tFail in Chem.,English.                                                      "); 
       else if(m<33 && h<33)
           System.out.print("|\t\t\tFail in Maths,Hindi.                                                        ");     
       else if(m<33 && e<33)
           System.out.print("|\t\t\tFail in Maths,English.                                                      ");
       else if(h<33 && e<33)
           System.out.print("|\t\t\tFail in Hindi.English                                                       ");
        }   
       
       else if(p<33 || c<33 || m<33 || h<33 || e<33)
       {
       if(p<33)
       	  System.out.print("|\t\t\tFail in Phy..                                                               ");
       else if(c<33)
       	  System.out.print("|\t\t\tFail in Chem..                                                              ");
       else if(m<33)
       	  System.out.print("|\t\t\tFail in Maths.                                                              ");
       else if(h<33)
       	  System.out.print("|\t\t\tFail in Hindi.                                                              ");
       else if(e<33)
       	  System.out.print("|\t\t\tFail in English.                                                            ");
       }
	   else
           System.out.print("|\t\t\tPass in all Subjects.                                                                          "); 
	   System.out.println("\n| Status               :                                                                            ");
      
	  if(per>=33 && per<100)
      {
           System.out.print("|\t\t\tPASS                                                                        ");
         System.out.println("\n| Division             :                                                         ");
       if(per>=60)
      {
           System.out.print("|\t\t\tFirst Division                                                            ");
      }
      else if(per>=45)
      {
           System.out.print("|\t\t\tSecond Division                                                           ");
      }
      else if(per>=33)
      {
           System.out.print("|\t\t\tThird Division                                                            ");
      }
      }
      else
           System.out.print("|\t\t\tFAIL                                                                      "); 
					
					
	   
        System.out.println("\n|_____________________________________________________________________________");
						
					
	
	
		
		
	}
}

class Test 
{
	public static void main(String args[])
	{
		Marksheet ob = new Marksheet();
		
		Scanner sc = new Scanner(System.in);
		
		
		ob.setData();
		int ch;
	do
	{
		System.out.println("how you want to search marksheet");
		System.out.println("press 1 to search by name ");
		System.out.println("press 2 to search by roll number \npress 3 for print all marksheet \n press 4 for exit");
		System.out.println("Enter your choice");
		ch  = sc.nextInt();
		switch(ch)
		{
			case 1 : System.out.println("Enter your name");
				 sc.nextLine();
				 String name =  sc.nextLine();
				 ob.searchByName(name);
			break;
			
			case 2 : System.out.println("Enter your Roll number");
				 sc.nextLine();
				 String roll =  sc.nextLine();
				
				 ob.searchByRoll(roll);
			break;
	
			case 3 : ob.all();
		}	
	}while(ch!=4);				
		

	
		
	}
}