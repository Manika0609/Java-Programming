class Player 
{
    String name;
    int age;
    Player(String n,int a) 
    {
        name=n; age=a;
    }
    void show() 
    {
        System.out.println("Player name: "+name);
        System.out.println("Age: "+age);
    }
}
class cricket_player extends Player 
{
    String type;
    cricket_player(String n,String t,int a) 
    {
        super(n,a);
        type=t;
    }
    public void show() 
    {
    super.show();
    System.out.println("Player type : "+type);
    System.out.println("------------------------");
    }
}
class football_player extends Player 
{
    String type;
    football_player(String n,String t,int a) 
    {
        super(n,a);
        type=t;
    }
    public void show() 
    {
        super.show();
        System.out.println("Player type : "+type);
        System.out.println("------------------------");
    }
}
class hockey_player extends Player 
{
    String type;
    hockey_player(String n,String t,int a)
    {
        super(n,a);
        type=t;
    }
    public void show() 
    {
        super.show();
        System.out.println("Player type : "+type);
        System.out.println("------------------------");
    }
}
class Main 
{
    public static void main(String[] args) 
    {
        cricket_player c=new cricket_player("Manika ","Football",21);
        football_player f=new football_player("Tanisha","Cricket",21);
        hockey_player h=new hockey_player("Vidushi","Hockey",21);
        c.show();
        f.show();
        h.show();
    }
}