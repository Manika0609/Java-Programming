package balance;
public class Account
{
    public void Display_Balance(ina a)
    {
        System.out.println("balance",+a);
    }
}
import balance.*;
{
    class Ques2
    {
        public static void main(String args[])
        {
            Account obj = new Account();
            obj.Display_Balance(4500);
        }
    }
}