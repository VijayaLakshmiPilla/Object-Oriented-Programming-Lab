import java.util.Scanner;
class Fourth
{
  public int sum(int a,int b)
   {return a+b;}
  public int sum(int x,int y,int z)
   {return x+y+z;}
  public int pro(int n)
   {return -1*n;}
  
public static void main(String args[])
 {
   while(1==1){
   System.out.println("1: Add two numbers");
   System.out.println("2: Add three numbers");
   System.out.println("3: -1 * number");
   System.out.println("4: exit");
   System.out.print("Enter option : ");
   Scanner temp = new Scanner(System.in);
   int num = temp.nextInt();  
   if(num==4) {break;}
   Fourth obj = new Fourth();
   int s,p;
   switch(num)
   {
     case 1 : System.out.print("Enter 2 numbers:  ");
              s = obj.sum(temp.nextInt(),temp.nextInt());
              System.out.println("sum is "+s);
              break;
      
     case 2 : System.out.print("Enter 3 numbers:  ");
              s = obj.sum(temp.nextInt(),temp.nextInt(),temp.nextInt());
              System.out.println("sum is "+s);
              break;

     case 3 : System.out.print("Enter number:  ");
              p = obj.pro(temp.nextInt());
              System.out.println("-1*Number is "+p);
              break;
     default : System.exit(0);
   }
}
}

}
