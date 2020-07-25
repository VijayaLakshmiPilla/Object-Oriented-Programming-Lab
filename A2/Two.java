import java.util.Scanner;


enum inputtype
{
  O,
  E,
  L,
}

class Bus{
  int Busno;
  String From;
  String To;
  int Distance;
  inputtype Type;
  int Fare;
  public Bus(int b,String f,String t,int d)
    {Busno = b;
      From = f;
      To = t;
      Distance = d;
      Type = inputtype.O;
      }
  public Bus(int b,String f,String t,int d,String i)
    {
      Busno = b;
      From = f;
      To = t;
      Distance = d;
      Type = inputtype.valueOf(i);
     }
   public int CalcFare()  
    {
      if(Type==inputtype.O) 
	{Fare = 10*Distance;}
      else if(Type==inputtype.E) 
	{Fare = 20*Distance;}
      else if(Type==inputtype.L) 
	{Fare = 24*Distance;}  
      return Fare;   
    }

  public void Show()
   { System.out.println(Busno+" "+From+" "+To+" "+Distance+" "+Type+" "+CalcFare());}

}
class Two{

  public static void main(String[] args)
   {
     Scanner temp = new Scanner(System.in);
     int i=-1;
     Bus obj[] = new Bus[100];
     int num,bno;
     String fr,to,ty,dum;
     int distance;
     while(true)
     {
     System.out.println("1-Add details"+"\n"+"2-Show details"+"\n"+"3-Exit"+"\n"+"Enter choice ");
     num = temp.nextInt();
     if(num==3){break;}
     if(num==1)
      {     
          System.out.println("Enter bus details(Busno,from,to,distance,type)");
          Scanner temp2 = new Scanner(System.in);
          dum = temp2.nextLine();
          //System.out.println(dum);
             String[] words = dum.split(" ");
             if(words.length==5||words.length==4)
		{
              if(words.length==5){
              bno = Integer.valueOf(words[0]);
              fr = words[1];
	      to = words[2];
	      distance = Integer.valueOf(words[3]);
              ty = words[4];
              obj[++i] = new Bus(bno,fr,to,distance,ty);}
               if(words.length==4)
                 {
		bno = Integer.parseInt(words[0]);
              fr = words[1];
	      to = words[2];
	      distance = Integer.parseInt(words[3]);
             obj[++i] = new Bus(bno,fr,to,distance);}
               }
   }

   if(num==2)
     {for(int j=0;j<=i;j++)
 	 {obj[j].Show();}} 
      /*{System.out.println(obj[j].Busno+" "+obj[j].From+" "+obj[j].To+" "+obj[i].Distance+" "+obj[j].Type+" "+obj[j].CalcFare());}*/
  }
}
}



        
       
