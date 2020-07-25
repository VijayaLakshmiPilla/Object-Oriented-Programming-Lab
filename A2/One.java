import java.util.Scanner;

class sponsors{
String name;
int amount;

}

class runner{
  int number;
  String finishtime;
  void checktime()
   {if(finishtime.equalsIgnoreCase("0:0:0"))
            {System.out.println(" Not Finished");}
     else  {System.out.println(" Finished in "+finishtime);}
    }
}

class professional extends runner{
 int ranking;}

class armature extends runner{
   int nos;
   sponsors objs[] = new sponsors[100]; 
}

class fancydress extends armature{
  String costume;

}



class One
{
  public static void main(String[] args){
    int num,n,i=-1,j=-1,k=-1,sum,a,b,c,z=-1;
    Scanner temp = new Scanner(System.in);
    char[] dum = new char[100];
    professional[] obj1 = new professional[100];
    armature[] obj2 = new armature[100];
    fancydress[] obj3 = new fancydress[100];
    while(1==1){
    System.out.println("1 - Add Runner details"+"\n"+
		       "2 - Display runner details"+"\n"+
		       "3 - Exit"+"\n"+
			"Enter choice ");
    
    num = temp.nextInt();
    if(num==3) {break;}
    switch(num)
     {
       case 1 : System.out.println("Type of Runner"+"\n"+
				        "1-Professional"+"\n"+
					"2-Armature"+"\n"+
					"3-Fancy dress runner"+"\n"+
					"Enter choice ");
              n = temp.nextInt();
	      if(n==1)  //professional
              {System.out.println("Enter runner details(Number,ranking,finish time)");
		dum[++z] = 'p';
	        ++i;
                obj1[i] = new professional();
	        obj1[i].number = temp.nextInt();
		obj1[i].ranking = temp.nextInt();
		obj1[i].finishtime = temp.next();
               }
               if(n==2) //armature
               {System.out.println("Enter runner details(Number,finish time)");
		dum[++z] = 'a';
		++j;
		obj2[j] = new armature();
		obj2[j].number = temp.nextInt();
		obj2[j].finishtime = temp.next();
                System.out.print("Enter number of sponsors  ");
                obj2[j].nos = temp.nextInt();
		System.out.println("Enter sponsorship details (Name of sponsors,amount)");
		for(int s=0;s<obj2[j].nos;s++)
		{ obj2[j].objs[s] = new sponsors();
		  obj2[j].objs[s].name = temp.next();
		  obj2[j].objs[s].amount = temp.nextInt();
  		}
		}
	      if(n==3) //fancydress
		{System.out.println("Enter runner details(Number,costume,finish time)");
		 dum[++z] = 'f';
		 ++k;
		 obj3[k] = new fancydress();
		 obj3[k].number = temp.nextInt();
		 obj3[k].costume = temp.next();
		 obj3[k].finishtime = temp.next();
		 System.out.print("Enter number of sponsors  ");
                 obj3[k].nos = temp.nextInt();
		 System.out.println("Enter sponsorship details (Name of sponsors,amount)");
		 for(int s=0;s<obj3[k].nos;s++)
		 { obj3[k].objs[s] = new sponsors();
		  obj3[k].objs[s].name = temp.next();
		  obj3[k].objs[s].amount = temp.nextInt();
  		 }
		}	
			break;

	case 2: a=-1;
		b=-1;
		c=-1;
                for(int l=0;l<=z;l++)
		{
                 if(dum[l]=='p')        //professionals
		 {  
		  ++a;               
		  System.out.print("Runner "+obj1[a].number+"(Ranking "+obj1[a].ranking+") ");
		  obj1[a].checktime();
		  System.out.println();
		 }
                 
		if(dum[l]=='a')	 //armature
		{
		  ++b;
		  System.out.print("Runner "+obj2[b].number+" sponsors ");
                  sum = 0;
		  for(int d=0;d<obj2[b].nos;d++)
		   {sum = sum + obj2[b].objs[d].amount;
		    System.out.print(obj2[b].objs[d].name+"-"+obj2[b].objs[d].amount+",");}
                    System.out.print("Total "+sum);
		    obj2[b].checktime();
		    System.out.println();
		 }

  		if(dum[l]=='f')  //fancydress
		{
		 ++c;
		 System.out.print("Runner "+obj3[c].number+"("+obj3[c].costume+")"+" sponsors ");
                 sum = 0;
		 for(int d=0;d<obj3[c].nos;d++)
		   {sum = sum + obj3[c].objs[d].amount;
		    System.out.print(obj3[c].objs[d].name+"-"+obj3[c].objs[d].amount+",");}
                    System.out.print("Total "+ sum);
		    obj3[c].checktime();
		    System.out.println();
		}
                }
  		break;
          default : System.exit(0);
        }
        } 
    }
  }
         
