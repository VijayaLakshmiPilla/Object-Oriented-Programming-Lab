import java.util.Scanner;


class account{
    String account_holder_name;
    int Balance;
    public void credit(double c)
	{Balance += c;}
    public void debit(double d)
	{Balance -= d;}
}

class SBI extends account{
    public double calculate_interest()
      {return Balance*8/100;}
}

class HDFC extends account{
    public double calculate_interest()
      {return Balance*7/100;}
}



class Eighth{

  public static void main(String args[])
   {
     Scanner temp = new Scanner(System.in);
     SBI obj1 = new SBI();
     HDFC obj2 = new HDFC();
     System.out.println("Enter sbi customer details");
     obj1.account_holder_name = temp.next();
     obj1.Balance = temp.nextInt();
     obj1.credit(temp.nextDouble());
     obj1.debit(temp.nextDouble());
     System.out.println("Enter HDFC customer details");
     obj2.account_holder_name = temp.next();
     obj2.Balance = temp.nextInt();
     obj2.credit(temp.nextDouble());
     obj2.debit(temp.nextDouble());
     System.out.println(obj1.account_holder_name+" "+obj1.Balance+" "+obj1.calculate_interest());
     System.out.println(obj2.account_holder_name+" "+obj2.Balance+" "+obj2.calculate_interest());
  }
}
     
     
     

