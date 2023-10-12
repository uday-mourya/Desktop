package mypack1;
public class MarksheetOperations
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