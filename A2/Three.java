import java.util.Scanner;

enum inputtype{
 Day,
 Night,
}

interface salaryFinder {
  public int findSalary();
}

class person{
   String name;
   int age;
   
}

class Employee extends person{
	int emp_id;
	int salary_per_day;
	int No_of_days_present;
}

class Security extends Employee implements salaryFinder{
	inputtype shift;
    public Security(String nam,int agg,int ei,int salpd,int dp,String sh)
      {
	name	= nam;
	age	= agg;
	emp_id	= ei;
	salary_per_day	= salpd;
	No_of_days_present  = dp;
	shift = inputtype.valueOf(sh);
	}
	  
        public int findSalary()
		{ return salary_per_day*No_of_days_present;}
   
}

   
class Teacher extends Employee{
	String branch;
	String specialization;
}

class HOD extends Teacher implements salaryFinder{
     int not_wrking_under;
     int no_gs;
     public HOD(String n,int a,int e,int spd, int nodp,String s,String b,int notwu,int nog) 
      {
        name	=  n;
	age     =  a;
	emp_id  =  e;
	salary_per_day	   =  spd;	
        No_of_days_present =  nodp;
	specialization	   =  s;
	branch  	 =	b;
	not_wrking_under   =	notwu;
	no_gs		=  nog;
      }
        public int findSalary()
	  { return salary_per_day*No_of_days_present;}
}



class Three{


public void pw(int a,String ch)
     {		
         String one[] = {" "," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten"," Eleven"," Twelve"," Thirteen"," Fourteen","Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen" };
 
	 String ten[] = {" "," "," Twenty"," Thirty"," Forty"," Fifty"," Sixty","Seventy"," Eighty"," Ninety"};
 
         if (a > 19)
	{System.out.print(ten[a / 10] + " " + one[a % 10]);}
	else
	{System.out.print(one[a]);}
	if (a > 0)
	  {System.out.print(ch);}
    }
      
   static void words(int no)
    {
      Three obj = new Three();
         obj.pw(((no / 1000) % 100), " thousand");
	 obj.pw(((no / 100) % 10), " hundred");
	 obj.pw((no % 100), " ");
    }

   
 public static void main(String[] args)
 {
   Scanner temp = new Scanner(System.in);
   HOD obj1[] = new HOD[100];
   Security obj2[] = new Security[100];
   int num,i=-1,j=-1,p;
   String na,sp,br,shif;
   int sal_pd;
   int ag,em,no_dp,not_wu,no_gs;
   while(1==1)
   {
    System.out.println("1-Insert HOD details"+"\n"+
		       "2-Insert security details"+"\n"+
		       "3-Display HOD details"+"\n"+
		       "4-Display Security details"+"\n"+
		       "5-Exit"+"\n"+"Enter Choice ");
    num = temp.nextInt();
    if(num==5) {break;}
    switch(num){
        case 1: System.out.println("Enter details of HOD (name , age, emp_id, salary_per_day, No_of_days_present, specialization ,branch, number_of_Teachers_working_under, number_of_guideship)");
                na = temp.next();
		ag = temp.nextInt();
		em = temp.nextInt();
		sal_pd = temp.nextInt();
		no_dp = temp.nextInt();
		sp = temp.next();
		br = temp.next();
		not_wu = temp.nextInt();
		no_gs = temp.nextInt();
                obj1[++i] = new HOD(na,ag,em,sal_pd,no_dp,sp,br,not_wu,no_gs);
		break;
                 
		
	case 2:  System.out.println("Enter details of Security (name , age, emp_id, salary_per_day, No_of_days_present, shift)");
		na = temp.next();
		ag = temp.nextInt();
		em = temp.nextInt();
		sal_pd = temp.nextInt();
		no_dp = temp.nextInt();
		shif = temp.next();
		obj2[++j] = new Security(na,ag,em,sal_pd,no_dp,shif);
		break;
		
		 
	case 3: for(p=0;p<=i;p++)
		{System.out.print(obj1[p].name+" "+obj1[p].findSalary());
                 words(obj1[p].findSalary());
                 System.out.println();}
		break;
	case 4: for(p=0;p<=j;p++)
		{System.out.print(obj2[p].name+" "+obj2[p].findSalary());
                 words(obj2[p].findSalary());
		System.out.println();}
                 		break;
	default: System.exit(0);
      }
    }
   }
}

     



   
