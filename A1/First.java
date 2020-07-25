import java.util.Scanner;
class First
{
  String Myname;
  String Myrno;
  double Mycgpa;
 public First(String n,String r,double c)
   {
     Myname = n;
     Myrno = r;
     Mycgpa = c;
   }
  static double calc(double cg)
  {
    return ((cg-0.5)*10);
  }


public static void main(String args[])
 {
    Scanner temp = new Scanner(System.in);
    System.out.print("Enter number of students  ");
    int num = temp.nextInt();
    First[] obj = new First[num];
    System.out.println("Student Details");
    String name;
    String rno;
    double cgpa;
    for(int i=0;i<num;i++)
     { name = temp.next();
       rno = temp.next();
       cgpa = temp.nextDouble();      
      obj[i] = new First(name,rno,cgpa);
  
     }
    for(int i=0;i<num;i++)
     {
     System.out.println(obj[i].Myname+" "+obj[i].Myrno+" "+obj[i].Mycgpa+" "+calc(obj[i].Mycgpa)+"%");}
}
}
      
     
     
