import java.util.Scanner;
class Student
{
	private int roll,sem,year,p,c,m,e,h;
	private String name,fn,mn,cor,brch,uc;
	public void setData(int i, Student std[],Scanner sc)
	{
		boolean z;
		do
		{
			System.out.println("Enter the roll number");
			this.roll=sc.nextInt();
			sc.nextLine();
			z = false; 	
			for(int k=0;i>0&&k<i; k++)
			if(std[k].roll==roll)
			{
		   System.out.println("roll number already please correct roll number\n");
				z=true;
			}
		}while(z);
		System.out.println("Enter your name:");
		this.name =sc.nextLine();
		System.out.println("Enter your Father's name:");
		this.fn=sc.nextLine();
		System.out.println("Enter your Mother's name:");
		this.mn=sc.nextLine();
		System.out.println("Enter your Course:");
		this.cor=sc.nextLine();
		System.out.println("Enter Your Branch Name =");
		this.brch =sc.nextLine();
		System.out.println("Enter Your Collage name =");
		this.uc =sc.nextLine();
		System.out.println("Enter your year:");
		this.year=sc.nextInt();
		System.out.println("Enter your sem:");
		this.sem=sc.nextInt();
		do
		{	
			System.out.println("Enter the physics marks");
			p = sc.nextInt(); 
			if(p<0||p>100)	
			{
				System.out.println("Invalid Mark  Please Enter Valid Mark");
			}
			}while(p<0||p>100);
			do
			{
				System.out.println("Enter the chemistry number"); 
				c = sc.nextInt();
				if(c<0||c>100)	
				{
					System.out.println("Invalid Mark  Please Enter Valid Mark");
				}
			}while(c<0||c>100);
			do
			{
				System.out.println("Enter the math number");
				m = sc.nextInt();
				if(m<0||m>100)	
				{
					System.out.println("Invalid Mark  Please Enter Valid Mark");
				}	
			}while(m<0||m>100);
			do
			{	 
				System.out.println("Enter the hindi number");
				h = sc.nextInt();
				if(h<0||h>100)	
				{
					System.out.println("Invalid Mark  Please Enter Valid Mark");
				}	
			}while (h<0||h>100);
			do
			{	
				System.out.println("Enter the english number");
				e = sc.nextInt();
				if(e<0||e>100)	
				{
					System.out.println("Invalid Mark  Please Enter Valid Mark");
				}			
			}while(e<0||e>100);
		
	}
	public void getData()
	{
		int nm ;
		double d ; 
                           
		System.out.println("|--------------------------------------------------------------------|");  
		System.out.println("|\t\t\t\t"+uc+"\t\t\t\t\t\t|");
		System.out.println("|Name  \t:"+name+"      \t\t\t\t\tCourse   :"+cor+"\t\t|");
		System.out.println("|Roll.N\t:"+roll+"      \t\t\t\t\tBranch   :"+brch+"\t\t|");
		System.out.println("|Father\t:"+fn+"        \t\t\t\t\tSem      :"+sem+"\t\t|");
		System.out.println("|Mother\t:"+mn+"        \t\t\t\t\tYear     :"+year+"\t\t|");
		System.out.println("|____________________________________________________________________|");
		System.out.println("|SubCode |\tSubName   |\tMaxMarks |\tMinMarks |\tObtmarks |");
		System.out.println("| 101    |\tEnglish   |\t70       |\t33       |\t"+e+"\t  |");
		System.out.println("| 102    |\tHindi     |\t70       |\t33       |\t"+h+"\t  |");
		System.out.println("| 103    |\tphysics   |\t70       |\t33       |\t"+p+"\t  |");
		System.out.println("| 104    |\tchemistry |\t70       |\t33       |\t"+c+"\t  |");
		System.out.println("| 105    |\tMaths     |\t70       |\t33       |\t"+m+"\t  |");
		System.out.println("----------------------------------------------------------------------"); 
		 nm = p+c+m+h+e;
                  d = nm/5;
		if(p<33&&c<33&&m<33&&h<33&&e<33)
		System.out.println("all subject fail");
		else if((p<33&&c<33&&m<33&&h<33)||(p<33&&c<33&&m<33&&e<33)||(p<33&&c<33&&h<33&&e<33)||(p<33&&m<33&&h<33&&e<33)||(c<33&&m<33&&h<33&&e<33))
		 System.out.println("FAIL IN FOUR SUBJECT");
            if(p<33&&c<33&&m<33&&h<33)
            System.out.println("fail in four sub phy and chem and maths and hindi");
            else if(p<33&&c<33&&m<33&&e<33)
            System.out.println("fail in four sub is phy and chem and maths and english");
            else if(p<33&&c<33&&h<33&&e<33)
            System.out.println("fail in four sub is physics and chem and hindi and english");
            else if(p<33&&m<33&&h<33&&e<33)
            System.out.println("fail in four sub is physics and maths and hindi and english");
            else 
            System.out.println("fail in four sub is chemistry and maths and hindi and english");
			else if((p<33&&c<33&&m<33)||(p<33&&c<33&&h<33)||(p<33&&c<33&&e<33)||(c<33&&m<33&&e<33)||(c<33&&m<33&&h<33)||(m<33&&h<33&&e<33)||(m<33&&h<33&&p<33)||(h<33&&p<33&&e<33)||(e<33&&p<33&&m<33))
			if(p<33&&c<33&&m<33)
			System.out.println("fail in three sub phy and chem and maths");
			else if(p<33&&c<33&&h<33)
			System.out.println("fail in three sub phy and chem and hindi");
			else if(p<33&&c<33&&e<33)
			System.out.println("fail in three sub phy and chem and english");
			else if(c<33&&m<33&&e<33)
			System.out.println("fail in three sub chem and maths and english");
			else if(c<33&&m<33&&h<33)
			System.out.println("fail in three sub chem and maths and hindi");
			else if(m<33&&h<33&&e<33)
			System.out.println("fail in three sub maths and hindi and english");
			else if(m<33&&h<33&&p<33)
			System.out.println("fail in three sub maths and hindi and phy");
			else if(h<33&&p<33&&e<33)
			System.out.println("fail in three sub phy and hindi and english");
			else 
			System.out.println("fail in three sub phy and maths and english");
			else if((p<33&&c<33)||(p<33&&m<33)||(p<33&&h<33)||(p<33&&e<33)||(c<33&&m<33)||(c<33&&h<33)||(c<33&&e<33)||(m<33&&h<33)||(m<33&&e<33)||(h<33&&e<33))
			if(p<33&&c<33)
			System.out.println("fail in two sub phy and chem");
			else if(p<33&&m<33)
			System.out.println("fail in two sub phy and maths");
			else if(p<33&&h<33)
			System.out.println("fail in two sub phy and hindi");
			else if(p<33&&e<33)
			System.out.println("fail in two sub phy and english");
			else if(c<33&&m<33)
			System.out.println("fail in two sub chem and maths ");
			 else if(c<33&&h<33)
			System.out.println("fail in two sub chem and hindi ");
			else if(c<33&&e<33)
			System.out.println("fail in two sub chem and english");
			 else if(m<33&&h<33)
			System.out.println("fail in two sub maths and hindi ");
			else if(m<33&&e<33)
			System.out.println("fail in two sub maths and english");
			else
			System.out.println("fail in two sub hindi and english");
			else  if(p<33||c<33||m<33||h<33||e<33)      
            if(p<33)
			System.out.println("fail in one sub phy"); 
			else if(c<33)
			System.out.println("fail in one sub chem"); 
			else if(m<33)
			System.out.println("fail in one sub maths");
			else if(h<33)
			System.out.println("fail in one sub hindi");
			else
            System.out.println("fail in one sub english");
			else 
				nm = p+c+m+h+e;
                d = nm/5;
                System.out.println("Total Marks is = "+nm);
                System.out.println("percantage is ="+d);
                if(d>=65)
                System.out.println("Pass in First Division");
                else if(d>=45)
                System.out.println("Pass in Second Division");
                else if(d>=33)
                System.out.println("Pass in Third Division");
                else
                System.out.println("you are pass"); 

	}
	public void roll(Student std[],int roll,int i)
	{
		   if(std[i].roll==roll)
		   this.getData();
	
	
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many sutudent result");
		int n = sc.nextInt();
		Student std[] = new Student[n];
		for(int i=0;i<n;i++)
		{
			std[i]=new Student();
		}
		for(int i=0;i<n;i++)
		{
			std[i].setData(i,std,sc);
		}
		int roll;
		System.out.println("check roll");
		roll=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			std[i].roll(std,roll,i);
		}
		
		
	}
}
