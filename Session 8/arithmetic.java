interface Test
{
    int operation(int x, int y);
}
class Addition implements Test
{
    public int operation(int x, int y)
    {
        return x+y;
    }
}
class Multiplication implements Test
{
    public int operation(int x, int y)
    {
        return x*y;
    }
}
class ToTestInt
{
    public static void main(String arg[])
    {
        Addition a = new Addition();
        Multiplication m = new Multiplication();
        Test c;
        c = a;
        System.out.println("Addition: "+c.operation(8,10));
        c = m;
        System.out.println("Multiplication: "+c.operation(5,8));
    }
}
