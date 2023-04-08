class shape
{
    private int l,b;
        int area()
        {return(l*b);}
}
class cuboid extends shape
{
    int h;
    cuboid(int l,int b,int d)
{
    super(l,b);
    h=d;
}
    int volume()
{
    return(area()*h);
}
}
    class lab6
{
    public static void main(String args[])
    {
    cuboid c=new cuboid(16,12,4);
    int ar=c.area();
    int vl=c.volume();
    System.out.println("Area of Room : "+ar);
    System.out.println("Volume of Room : "+vl);
    }
}
