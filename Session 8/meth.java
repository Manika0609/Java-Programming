interface A
{
    void meth1();
    void meth2();
}

class MyClass implements A
{
        public void meth1()
        {
            System.out.println("Hello");
        }
    
        public void meth2()
        {
            System.out.println ("World");
        }
        public static void main (String arg[])
        {
            MyClass m = new MyClass();
            m.meth1();
            m.meth2();
            System.out.println("\n");
            
    }   
}

