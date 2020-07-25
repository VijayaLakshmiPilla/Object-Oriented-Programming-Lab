import java.util.Scanner;

class engine
{
   int engine_no;
   int cc;
}

class car 
{
  String color;
  int price;
  engine en = new engine();
}

class Seventh{
  public static void main(String[] args)
  {
    Scanner temp = new Scanner(System.in);
    System.out.println("Enter car details :");
    car obj = new car();
    obj.en.engine_no = temp.nextInt();
    obj.en.cc = temp.nextInt();
    obj.color = temp.next();
    obj.price = temp.nextInt();
    System.out.println(obj.en.engine_no+" "+obj.en.cc+" "+obj.color+" "+obj.price);
  }
}
    
     
    
