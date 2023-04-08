interface Function 
{
    public int evaluate(int arg);
}
class Half implements Function
{
    public int evaluate (int arg)
    {
        return arg/2;
    }
}
class Ques3
{
    public static void main(String arg[])
    {
        Half h = new Half();
        Function a;
        a = h;
        System.out.println("Answer: "+a.evaluate(8));
       
    }
}