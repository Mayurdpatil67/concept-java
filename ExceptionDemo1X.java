import java.util.*;

class ExceptionDemo1X
{ 
    public static void main (String Arg[])
    {
    Scanner sobj =new Scanner(System.in);

    System.out.println("Enter first number");
    int iNo1=sobj.nextInt();

    System.out.println("Enter second number");
    int iNo2=sobj.nextInt();
    
    int iAns =0;
    
    try
    {
        System.out.println("Inside try block ");
        iAns=iNo1/iNo2;
    }

    catch(ArithmeticException obj)
    {
        System.out.println("Inside catch block"+obj);
    }

    catch(ArrayIndexOutOfBoundsException obj)
    {
        System.out.println("Inside array index out of bound exception"+obj);
    }

    catch(Exception obj)
    {
        System.out.println("Inside generic catch  block"+obj);
    }
    
    finally
    {
        System.out.println("Inside generic catch  block");
    }
   
       System.out.println("Division is "+iAns);
   }
}