
class Base 
{
    public int A , B ;

    public Base()
    {
        System.out.println("Base Countructor");
    }
    public  void fun()
    {
        System.out.println("Base fun");
    }
}

class Derived extends Base 
{
    public int X, Y;
    
    public Derived ()
    {
        System.out.println("Derived Countructor");
    }
    public void gun()
    {
        System.out.println("Derived gun");
    }
}

class DerivedX extends Base
{
    public int P, Q;

    public DerivedX()
    {
        System.out.println("DerivedX Countructor");
    }

}

class Hierarchal 
{
public static void main ( String  arg [])
{
    DerivedX dobj1 = new DerivedX();
    DerivedX dobj2 =new DerivedX();
}

}