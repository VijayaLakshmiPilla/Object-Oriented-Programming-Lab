import java.io.IOException;
import java.util.*;
public class Student{
    String name;
    String rollNo;
    int internalMark;
    int externalMark;
    int assignmentMark;
    public static void main(String[] args)
  {
       try{ 
            Scanner temp =new Scanner(System.in);
            String a = temp.nextLine();
            String[] arr = new String[5];
	    String[] arr2 = new String[5];
            arr = a.split("[ \t]");  
           // arr2 = a.split(" ");
            //if(arr2.length==5)
   		//throw new MyException("Exception: Give Tab Space in between values");
	 
            Student obj = new Student();
            obj.name = arr[0];
            obj.rollNo = arr[1];
            obj.internalMark = Integer.parseInt(arr[2]);
 	    obj.externalMark = Integer.parseInt(arr[3]);
            obj.assignmentMark = Integer.parseInt(arr[4]);
              try
                 {if(!obj.name.matches("[a-zA-Z ]+"))
 		  throw new nameExcep("Exception: Enter Valid Name");}
              catch(nameExcep e)
                  {System.out.println(e);}

              try{
   	      if(!obj.rollNo.matches("[a-zA-Z0-9]+"))
   		  throw new rollExcep("Exception: Enter Valid RollNo");}
                catch(rollExcep e)
                  {System.out.println(e);}
  
              
               try{
                    if(obj.internalMark >15){
                        throw new InternalExcep("Internal Marks should be less than 15");
                    }
                    if(obj.internalMark < 0 ){
                        throw new InternalExcep("Internal Marks should be positive");
                    }
                  }
                catch(InternalExcep e) 
                   { System.out.println(e);}
		

                try{
                    if(obj.externalMark >50){
                        throw new ExternalExcep("External marks should be less than 50");
                    }
                    if(obj.externalMark <0){
                        throw new ExternalExcep("External marks should be positive");
                    }
                }
		
                catch(ExternalExcep e) 
                    {System.out.println(e);}
        
           
                try{
                    if(obj.assignmentMark >25){
                        throw new assignExcep("Assignment Marks should be less than 50");
                    }
                    if(obj.assignmentMark <0){
                        throw new assignExcep("Assignment Marks should be positive");
                    }
                }
	
                catch(assignExcep e) 
                   { System.out.println(e);}
                


        }
          catch(NumberFormatException e)
                  {System.out.println("Exception: give Valid input For Marks");}
          catch(ArrayIndexOutOfBoundsException e)
                  {System.out.println("All the attributes are not given");}
          catch(Exception e)
            {System.out.println(e);}

        
          }
}
           //System.out.println(obj.name + obj.rollNo + obj.internalMark + obj.externalMark + obj.assignmentMark);
 
class InternalExcep extends Exception 
 {       public InternalExcep(String msg) 
           {super(msg);}
 }

class ExternalExcep extends Exception 
 {      public ExternalExcep(String msg) 
           {super(msg);}
 }     
    
class assignExcep extends Exception 
 {      public assignExcep(String msg) 
           {super(msg);}
 }

class nameExcep extends Exception
 { 	public nameExcep(String msg)
           {super(msg);}
 }
   

class rollExcep extends Exception
 {      public rollExcep(String msg)
           {super(msg);}
 }
 

  



