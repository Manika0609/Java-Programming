class A
{  
    String ele="A's Variable";
    A(){System.out.println("A class is created");} 
    void func(){
        System.out.println("A's function");
    } 
}  
    class B extends A
    {  
        //using super to refer parent class variable
        void varcall(){
            System.out.println(ele);//prints element of child class
            System.out.println(super.ele);//prints element of parent's class using "super"
        }
        String ele="A's Variable";
        B(){  
        super();  //super() used to call parent class constructor
        System.out.println("B class is created");  
    } 
        void func(){
        super.func();//super() used to call parent class method
        System.out.println("B's function");
    } 
    }  
    class Test
    {  
    public static void main(String args[]){  
    B b=new B();  
    b.func();
    b.varcall();
    }
    }