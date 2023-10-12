import java.util.Scanner;
class MarksheetPojo
{
	private String name,course,father,mother,branch,college;
	private int year,rollno,phy,chemistry,maths,hindi,english,semester,total;
	private double percentage;
	public MarksheetPojo(String name,String course,String father,String mother,String branch,String college,int year,int rollno,int phy,int chemistry,int maths,int hindi,int english,int semester, int total,double percentage)
	{
		this.name=name;   
		this.father=father;
		this.mother=mother;
		this.course=course;
		this.branch=branch;
		this.college=college;
		this.year=year;
		this.rollno=rollno;
		this.phy=phy;
		this.chemistry=chemistry;
		this.maths=maths;
		this.english=english;
		this.hindi=hindi;
		this.semester=semester;
		this.total=+this.getPhy()+this.getChemistry()+this.getMaths()+this.getHindi()+this.getEnglish();
		this.percentage=this.getTotal()/5;
	}
	public void setTotal()
	{
		this.total=+this.getPhy()+this.getChemistry()+this.getMaths()+this.getHindi()+this.getEnglish();
	}
	public void setPercentage()
	{
		this.percentage=this.getTotal()/5;
	}
	public  void setName(String name)
    {
		this.name=name;
    }
	public  void setFather(String father)
    {
		this.father=father;
    }
	public  void setMother(String mother)
    {
		this.mother=mother;
    }
	public  void setCourse(String course)
    {
		this.course=course;
    }
	public  void setBranch(String branch)
    {
		this.branch=branch;
    }  
	public  void setCollege(String college)
    {
		this.college=college;
    }  
	public  void setYear(int year)
    {
		this.year=year;
    }  
	public  void setRollno(int rollno)
    {
		this.rollno=rollno;
    }  
	public  void setPhy(int phy)
    {
		this.phy=phy;
    }
	public  void setChemistry(int chemistry)
    {
		this.chemistry=chemistry;
    }  
	public  void setMaths(int maths)
    {
		this.maths=maths;
    }
	public  void setEnglish(int english)
    {
		this.english=english;
    }
	public  void setHindi(int hindi)
    {
		this.hindi=hindi;
    }
	public  void setSemester(int semester)
    {
		this.semester=semester;
    }
	public String getName()
    {
		return this.name;
    }
    public  String getFather()
    {
      return this.father;
    }
	public  String  getMother()
    {
      return this.mother;
    }
	public  String getCourse()
    {
     return this.course;
    }
	public  String getBranch()
    {
      return this.branch;
    }  
	public  String getCollege()
    {
      return this.college;
    }  
	public  int getYear()
    {
      return this.year;
    }  
	public  int getRollno()
    {
      return this.rollno;
    }  
	public  int getPhy()
    {
       return this.phy;
    }
	public int getChemistry()
    {
      return this.chemistry;
    }  
	public int getMaths()
    {
      return this.maths;
    }
	public int getEnglish()
    {
      return this.english;
    }
	public int getHindi()
    {
      return this.hindi;
    }
	public int getSemester()
    {
      return this.semester;
    }  
	public int getTotal()
	{
		return this.total;
	}
	public double getPercentage()
	{
		return this.percentage;
	}
}
class MarksheetOperations
{
    public void display(MarksheetPojo ref[],int i,int n)
    {
		String name=ref[i].getName();
		String course=ref[i].getCourse();
		String father=ref[i].getFather();
		String mother=ref[i].getMother();
		String branch=ref[i].getBranch();
		String college=ref[i].getCollege();
	    int year=ref[i].getYear();
		int rollno=ref[i].getRollno();
		int phy=ref[i].getPhy();
		int chemistry=ref[i].getChemistry();
		int maths=ref[i].getMaths();
		int hindi=ref[i].getHindi();
		int english=ref[i].getEnglish();
		int semester=ref[i].getSemester();
		int total=ref[i].getTotal();
		double percentage=ref[i].getPercentage();;;
		System.out.println("|________________________________________________________________________________________");
		System.out.println("|\t\t\t\t   ("+college+")");
		System.out.println("|\t\t\t\t <***************>");
		System.out.println("|                                                                                         ");
		System.out.println("|\tRoll        : "+rollno+"        |       Course : "+course+"      ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tName        : "+name+"          |       Branch : "+branch+"  ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tFather Name : "+father+"        |       Sem    : "+semester+"      ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\tMother Name : "+mother+"        |       Year   : "+year+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|");
		System.out.println("|__________________________________________________________________________________________");
		System.out.println("|\tSubCode  -     SubName    -    MaxMarks   -     MinMarks    -    ObtMark    ");
		System.out.println("|__________________________________________________________________________________________");
		System.out.println("|\tBSC101   *     physics    |     100       *        33    |        "+phy+"       ");
		System.out.println("|---------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC102   *     chemeistry |     100       *        33    |        "+chemistry+"       ");
		System.out.println("|---------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC103   *     Maths      |     100       *        33    |        "+maths+"       ");
		System.out.println("|---------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC104   *     Hindi      |     100       *        33    |        "+hindi+"       ");
		System.out.println("|--------------------------------------------------------------------------------------------");
		System.out.println("|\tBSC105   *     English    |     100       *        33    |        "+english+"       ");
		System.out.println("|------------------------------------------------------------------------------------------");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		/*------------------------------------------------------------*/
		if(phy<33&&maths<33&&chemistry<33&&hindi<33&&english<33)
		{
		System.out.println("|\t\t\t\t\t\tStatus: | FAIL");  /*continue.....*/
		System.out.println("|\tFail in all Subject");
		}

		else if((phy<33&&chemistry<33&&maths<33&&hindi<33)||(phy<33&&maths<33&&hindi<33&&english<33)||(phy<33&&hindi<33&&english<33&&chemistry<33)||(phy<33&&english<33&&chemistry<33&&maths<33)||(chemistry<33&&maths<33&&hindi<33&&english<33))
		{    

		System.out.println("|\t\t\t\t\t\tStatus: | FAIL");


		if(phy<33&&chemistry<33&&maths<33&&hindi<33)
		System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\thindi");

		else if(phy<33&&maths<33&&hindi<33&&english<33)
		System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");

		else if(phy<33&&hindi<33&&english<33&&chemistry<33)
		System.out.println("\tFail in four Subject:\n\tphysics\n\tchemistry\n\thindi\n\tEnglish");

		else if(phy<33&&english<33&&chemistry<33&&maths<33)
		System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");

		else if(chemistry<33&&maths<33&&hindi<33&&english<33)
		System.out.println("|\tFail in four Subject:\n\tchemistry\n\tmath\n\thindi\n\tEnglish");
		}

		else if((phy<33&&maths<33&&chemistry<33)||(phy<33&&chemistry<33&&hindi<33)||(phy<33&&maths<33&&hindi<33)||(chemistry<33&&maths<33&&hindi<33)||(phy<33&&chemistry<33&&english<33)||
		(maths<33&&hindi<33&&english<33)||(chemistry<33&&hindi<33&&english<33)||(phy<33&&hindi<33&&english<33)||(english<33 &&maths<33&&chemistry<33)||(phy<33&&maths<33&&english<33))
		{    
		System.out.println("|\t\t\t\t\t\tStatus: | FAIL");

		if(phy<33&&maths<33&&chemistry<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tchemistry ");

		else if(phy<33&&chemistry<33&&hindi<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\thindi");

		else if(phy<33&&maths<33&&hindi<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\thindi ");

		else if(chemistry<33&&maths<33&&hindi<33)
		System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\tmath\n|\thindi ");

		else if(phy<33&&chemistry<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\tenglish ");

		else if(maths<33&&hindi<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tmath\n|\thindi\n|\tenglish ");

		else if(chemistry<33&&hindi<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\thindi\n|\tenglish ");

		else if(phy<33&&hindi<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\thindi\n|\tenglish ");

		else if(english<33 &&maths<33&&chemistry<33)
		System.out.println("|\tFail in three Subject:\n|\tmath\n|\tchemistry\n|\tenglish  ");

		else if(phy<33&&maths<33&&english<33)
		System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tenglish  ");
		}

		else if((phy<33&&maths<33)||(phy<33&&chemistry<33)||(phy<33&&hindi<33)||(phy<33&&english<33)||
		(maths<33&&chemistry<33)||(maths<33&&hindi<33)||(maths<33&&english<33)||(chemistry<33&&hindi<33)||(chemistry<33&&english<33)||(hindi<33&& english<33))
		{
		System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");

		if(phy<33&&maths<33)
		System.out.println("|\tFail in two subject:\n|\tphysics\n|\tmath");

		else if(phy<33&&chemistry<33)
		System.out.println("|\tFail in two subject:\n|\tphysics\n|\tchemistry");

		else if(phy<33&&hindi<33)
		System.out.println("|\tFail in two subject:\n|\tphysics\n|\thindi");

		else if(phy<33&english<33)
		System.out.println("|\tFail in two subject:\n|\tphysics\n|\tEnglish");

		else if(maths<33&chemistry<33)
		System.out.println("|\tFail in two subject:\n|\tmath\n|\tchemistry");

		else if(maths<33&hindi<33)
		System.out.println("|\tFail in two subject:\n|\tmath\n|\thindi");

		else if(maths<33&english<33)
		System.out.println("|\tFail in two subject:\n|\tmath\n|\tenglish");

		else if(chemistry<33&hindi<33)
		System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tHindi");

		else if(chemistry<33&english<33)
		System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tenglish");

		else if(hindi<33&english<33)
		System.out.println("|\tFail in two subject:\n|\tHindi\n|\tenglish");
		}


		else if(phy<33||maths<33||chemistry<33||hindi<33|english<33)
		{
		System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");
		if(phy<33)
		System.out.println("|\tFail in one subject\n|\tphysics");
		else if(maths<33)
		System.out.println("|\tFail in one subject\n|\\tmath");
		else if(chemistry<33)
		System.out.println("|\tFail in one subject\n|\tchemistry");
		else if(hindi<33)
		System.out.println("|\tFail in one subject\n|\thindi");
		else if(english<33)
		System.out.println("|\tFail in one subject\n|\tEnglish");

		} /*COMPLETE*/

		/*ELSE BLOCK-----   COUNT TOTAL PERSENTAGE*/
		else
		{
		 total = phy+chemistry+maths+hindi+english;
		 percentage=total/5.0;
		 if(phy>=33&&chemistry>=33&&maths>=33&&hindi>=33&&english>33)
		 {



				System.out.println("|\t\t\t\t\t\tStatus: | PASS");
		 }
		else
			{
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
			}  
			System.out.println("|\tTotal mark is:  "+total+"\t\t\t\t\t\t  ");
			System.out.println("|\tPersentage is:  "+percentage+"\t\t");
			if(percentage>=60)
			{
				System.out.println("|\tpass in first Division\t\t\t\t\t\t  ");
			}
			else if(percentage>=45)
			{
				System.out.println("|\tpass in Second Division\t\t\t\t\t\t  ");
			}
			else if(percentage>=33)
			{
				System.out.println("|\tpass in Third Division\t\t\t\t\t\t  ");
			}
			else
			{
				System.out.println("|\t---- FAIL ----");
			}

		}/*COMPLETE*/

		System.out.println("|____________________________________________________________________________________________|");
		 
	}  
}
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

  
