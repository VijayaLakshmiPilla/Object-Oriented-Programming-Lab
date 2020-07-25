import java.util.Scanner;

class person
{
  protected String name;
  protected int age;
 /* public person(String n,int a)
    {name=n;
      age=a;}*/
}

class emp extends person
{
  protected String emp_id;
  protected int salary;
    /*public emp(String e,int s)
      {emp_id = e;
       salary = s;}*/
}

class manager extends emp
{
  protected String managing_dep;
  protected int No_of_employees_working_under;
  public manager(String n,int a,String e,int s,String m,int no)
   {managing_dep = m;
     No_of_employees_working_under = no;
     name=n;
     age=a;
     emp_id = e;
     salary = s;
   }
}

class Fifth{
 public static void main(String args[])
  {
   
    Scanner temp = new Scanner(System.in);
    System.out.print("Enter number of managers  ");
    int num = temp.nextInt();
    System.out.println("Enter Details");
    manager[] obj = new manager[num];
    for(int i=0;i<num;i++)
     {
       
       obj[i] = new manager(temp.next(),temp.nextInt(),temp.next(),temp.nextInt(),temp.next(),temp.nextInt());
      }
    for(int i=0;i<num;i++)
     {
       System.out.println(obj[i].name+" "+obj[i].age+" "+obj[i].emp_id+" "+obj[i].salary+" "+obj[i].managing_dep+" "+obj[i].No_of_employees_working_under);}
 }
}
    
    
