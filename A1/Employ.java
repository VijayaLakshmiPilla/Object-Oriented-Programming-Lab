import java.util.Scanner;


class Employ{
  protected String name;
  protected String emp_id;
  public Employ(String s,String e)
  {
  name = s;
  emp_id = e;
  }
  public static void main(String args[])
   {
    Scanner temp = new Scanner(System.in);
    System.out.print("Enter number of employees  ");
    int num=temp.nextInt();
    Employ[] obj = new Employ[num];
    System.out.println("Enter details");
    for(int i=0;i<num;i++)
      {obj[i] = new Employ(temp.next(),temp.next());}
    for(int i=0;i<num;i++)
      {System.out.println(obj[i].name+" "+obj[i].emp_id);}
  }
}

