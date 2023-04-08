class call {

    String x;
    int y;
    call(String n,int time)
    { x=n; y=time; }
    void show()
    {
        System.out.println("\n--------------------------");
        System.out.println("Call Type: "+x);
        System.out.println("Time used: "+y);

    }

}

class Ordinary extends call {

    int z;
    Ordinary(String name,int min,int r)
    {
        super(name,min);
        z=r;

    }
    void show()
    {
        super.show();
        System.out.println("Call Rate: "+z+" Rs/min");
        System.out.println("Total Cost: "+y*z);
    }

}

class Urgent extends call {

    int z;
    Urgent(String name,int min,int r)
    {
        super(name,min);
        z=r;

    }
    void show()
    {
        super.show();
        System.out.println("Call Rate: "+z+" Rs/min");
        System.out.println("Total Cost: "+y*z);
    }

}

class Lightening extends call {

    int z;
    Lightening(String name,int min,int r)
    {
        super(name,min);
        z=r;

    }
    void show()
    {
        super.show();
        System.out.println("Call Rate: "+z+" Rs/min");
        System.out.println("Total Cost: "+y*z);
    }

}

public class trunk {
    public static void main(String[] args) {
        Lightening lc=new Lightening("lightening",14, 12);
        Urgent uc=new Urgent("urgent", 15, 10);
        Ordinary oc= new Ordinary("ordinary", 18,10);
        lc.show();
        uc.show();
        oc.show();
    }

}

