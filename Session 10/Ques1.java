package pack;
public class A
{
    public void msg()
    {
        System.out.println("Manika");
    }
}
import pack.*;
class B
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.msg();
    }
}