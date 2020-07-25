import java.util.*;

public class Q2 {
    public static void main(String[] args)
  {
       try{ Scanner temp = new Scanner(System.in);
        System.out.println("Enter an integer");
      
      int b = Integer.parseInt(temp.nextLine()); 
      System.out.println("Enter array index");
       
        int c = Integer.parseInt(temp.nextLine()); 
        
        int[] a = new int[5];
            a[c] = 5/b;
         }
       
      catch(ArithmeticException e)
          {System.out.println("Cant divide a number by Zero"+"\n"+e);}
    //  catch(InputMismatchException e)
      //  {System.out.println("Mismatch" +e );}
       
      catch (NumberFormatException e) 
         {System.out.println("Number Format is wrong"+e);} 

     catch(ArrayIndexOutOfBoundsException e)
        {System.out.println("illegal index"+"\n"+e);}

      catch(Exception e)
        { System.out.println(e);}

      
    }
}
