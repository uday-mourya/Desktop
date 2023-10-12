import java.util.Scanner;
import mypack1.MarksheetPojo;
import mypack1.MarksheetOperations;
class Main
{ 
    static int i,n;
	static String resetColor = "\u001B[2m";
	static String color = "\u001B[31m";
	public static void main(String args[])
	{
    	Scanner sc = new Scanner(System.in);
		MarksheetPojo stu[]=new MarksheetPojo[100]; 
		MarksheetOperations op = new MarksheetOperations();
		int m=0;
		int ch;
		do{
			System.out.println("-------------------------------------------------------------------------------------------|");
			System.out.println("|\t\t                                                                      |");
			System.out.println("|\t\t|********************|\t\t\t\t|**********************|                |");
			System.out.println("|\t\t| 1. InsertRecord   |\t\t\t\t|  2. Search Record   |                |");
			System.out.println("|\t\t|********************|\t\t\t\t|**********************|                |");
			System.out.println("|------------------------------------------------------------------------------------------|");
			System.out.println("|\t\t|********************|\t\t\t\t|**********************|                |");
			System.out.println("|\t\t| 3. UpdateRecord   |\t\t\t\t|  4. Exit(<-)         |                |");
			System.out.println("|\t\t|********************|\t\t\t\t|**********************|                |");
			System.out.println("|\t\t                                                                      |");
			System.out.println("-------------------------------------------------------------------------------------------|");
			ch=sc.nextInt();
			switch(ch)
				{
					case 1:
						if(i==0)
						{	
							System.out.println("how many student record insert");
							n = sc.nextInt();
							Main.input(stu,op,sc,m);
						}
						else
						{
							System.out.println(color+"\t\t-----------------------------------------------------------");
							System.out.println("\t\t     Record Is Exeist Please Update Record \t");
							System.out.println("\t\t-----------------------------------------------------------"+resetColor);
						}
						break;	
					case 2:
						if(i!=0)
						{
							Main.choice(stu,op,i,n,sc);
						}	
						else
						{
							System.out.println(color+"\t\t-----------------------------------------------------------");
							System.out.println("\t\t     No Record Found Please First Insert Record \t");
							System.out.println("\t\t-----------------------------------------------------------"+resetColor);
						}
						break;
					case 3:
						if(i!=0)
						{
							System.out.println("how many update record you want to enter ");
							m = sc.nextInt();
							Main.input(stu,op,sc,m);
						}
						else
						{
							System.out.println(color+"\t\t-----------------------------------------------------------");
							System.out.println("\t\t\t     No Record Found Please First Insert Record \t");
							System.out.println("\t\t-----------------------------------------------------------"+resetColor);
						}
						break;
				}
		}while(ch!=4);
		
	}
		

	public static void input(MarksheetPojo stu[],MarksheetOperations op,Scanner sc,int k)
	{
		n=n+k;
		String name,course,father,mother,branch,college;
	    int year,roll,phy,chemistry,maths,hindi,english,semester,total;
	    double percentage;
    	for(i=0;i<n;i++)
		{	
			roll=Main.roll(stu,i,sc);
			System.out.println("Enter your name :");
			name=sc.next();
			sc.nextLine();
			System.out.println("Enter your Father's name :");
			father=sc.nextLine();
			System.out.println("Enter your Mother's name :");
			mother=sc.nextLine();
			System.out.println("Enter your college :");
			college=sc.nextLine();
			System.out.println("Enter your branch:");
			branch=sc.nextLine();
			System.out.println("Enter your course :");
			course=sc.nextLine();
			System.out.println("Enter your year :");
			year=sc.nextInt();
			System.out.println("Enter your Semester :");
			semester=sc.nextInt();	
			System.out.println("Enter the physics marks");
			phy = Main.takeMarks(sc); 
			System.out.println("Enter the chemistry number"); 
			chemistry =Main.takeMarks(sc);
			System.out.println("Enter the math number");
			maths =Main.takeMarks(sc);
			System.out.println("Enter the hindi number");
			hindi =Main.takeMarks(sc);
			System.out.println("Enter the english number");
			english =Main.takeMarks(sc);
			total =phy+chemistry+maths+hindi+english;
			percentage = total/5;	
	        stu[i]=new MarksheetPojo(name,course,father,mother,branch,college,year,roll,phy,chemistry,maths,hindi,english,semester,total,percentage);
		}	
		//Main.choice(stu,op,i,n,sc);
	}	
	public static int roll(MarksheetPojo stu[],int i,Scanner sc)
	{
		boolean z;
		int roll;
		do
		{
			System.out.println("Enter the roll number");
			roll=sc.nextInt();
			sc.nextLine();
			z = false; 	
			for(int j=0;i>0&&j<i; j++)
			if(stu[j].getRollno()==roll)
			{
				System.out.println("roll number already exist please valid roll number\n");
				z=true;
			}
			
		}
		while(z);
		return roll;
	}	
	public static int takeMarks(Scanner sc)
	{
		int marks;
		do
		{	marks=sc.nextInt();
			if(marks<0||marks>100)	
			{
				System.out.println("Invalid Mark  Please Enter Valid Mark");
			}
		}while(marks<0||marks>100);
		return marks;
	}	
	public static void choice(MarksheetPojo stu[],MarksheetOperations op,int i,int n,Scanner sc)
	{
		int ch=0;
		do
		{
		    System.out.println("_____________________________________________________________________________________________________ ");
			System.out.println("|\t\tYOUR CHOICE ARE :                                                                    |");                                                                               
			System.out.println("|\t\t---------------                                                                      |");
			System.out.println("|\tPRESS.1 FOR ALL MARKSHEET PRINT   : PRESS.2 FOR PERCENTAGE SEARCH MARKSHEET :                |");
			System.out.println("|----------------------------------------------------------------------------------------------------|");
			System.out.println("|\tPRESS.3 FOR ROLL NUMBER MARKSHEET : PRESS.4 FOR SEARCH BY NAME MARKSHEET    :                |");
			System.out.println("|----------------------------------------------------------------------------------------------------|");
			System.out.println("|\t\t\tPRESS.5 Exit                                                                             |");
			System.out.println("|                                                                                                    |");
			System.out.println("|\tENTER YOUR CHOICE  :                                                                         |");
		    System.out.println("|____________________________________________________________________________________________________|");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
				case 1 :for(i=0;i<n;i++)
						{
								op.display(stu,i,n);
						}
						break;
				case 2 :System.out.println("Please Enter Search Perceantage");
						double m=sc.nextInt();
						for(i=0;i<n;i++)
						{
							if(m==stu[i].getPercentage())
							{
								op.display(stu,i,n);
							}
						} 
						break;
				case 3 :System.out.println("Enter seaching Roll Number");
						int num = sc.nextInt();
						for(i=0;i<n;i++)
						{
							if(stu[i].getRollno()==num)
							{
								op.display(stu,i,n);
							}
						}
						break;
				case 4 :System.out.println("Please Enter Searching Name");
						String naam=sc.next();
						for(i=0;i<n;i++)
						{
							if(stu[i].getName().equalsIgnoreCase(naam))
							{
								op.display(stu,i,n);
							}
						}
						break;
			}
		}
		while(ch!=5);
	}	
}

  
