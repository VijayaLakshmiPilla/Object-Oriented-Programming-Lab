import java.util.Scanner;

class shape{
   double length;
   double height;
   double radius;
  public void setl(double le)
        {length = le;}
  public void seth(double he)
	{height = he;}  
  public void setr(double ra)
	{radius = ra;}
}


class rectangle extends shape{
  public double area()
    {return length*height;}
}

class circle extends shape{
   public double area()
    {return 3.14*radius*radius;}
}

class Second{


  public static void main(String args[])
   {
     rectangle obj1 = new rectangle();
     circle obj2 = new circle();
     Scanner temp = new Scanner(System.in);
     System.out.println("Enter l and h of rectangle");
     obj1.setl(temp.nextDouble());
     obj1.seth(temp.nextDouble());
     System.out.println("Enter radius of circle");   
     obj2.setr(temp.nextDouble());
     System.out.println("Area of rectangle"+"\n"+obj1.area());
     System.out.println("Area of circle"+"\n"+obj2.area());
  }
}
     
     
     

