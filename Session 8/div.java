interface subject
{
    void division(int x);
    void modules(int y);
}
class sub implements subject
{
    int div, mod;
    public void division(int x)
    {
        div = x;
    }
    public void modules(int y)
    {
        mod = y;
    }
    void print(){
        System.out.println("Division: "+div);
        System.out.println("Modules: "+mod);
    }
}
class div
{
    public static void main(String arg[])
    {
        sub s = new sub();
        s.division(1);
        s.modules(12);
        s.print();
    }
}

