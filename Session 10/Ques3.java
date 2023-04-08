package p;
public class A
{
    public static void meth1()
    {
        System.out.println("This is a Public Method");
    }
    protected static void meth2()
    {
        System.out.println("This is a Protected Method");
    }
    private static void meth3()
    {
        System.out.println("This is a private Method");
    }
    static void meth4()
    {
        System.out.println("this is default method");
    }
    public static void main(String[] args)
    {
        A a = new A();
        A.meth1();
        A.meth2();
        A.meth3();
        A.meth4();
    }
}

public class B extends A
{
    public static void main(String[] args)
    {
        B b = new B();
        B.meth1();
        B.meth2();
        //B.meth3(); cannot access as private
        B.meth4();
    }
}

