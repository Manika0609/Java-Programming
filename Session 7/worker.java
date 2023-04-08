class worker
{
String name;
int empno;
worker(int no,String n)
{
     empno=no;
    name=n; 
}
void show()
{
System.out.println("Employee number : "+empno);
System.out.println("Employee name : "+name);
}
}
class dailyworker extends worker
{
int salary;
dailyworker(int no,String n,int r)
{
super(no,n);
salary=r;
}
int h=45;
void compay()
{
show();
System.out.println("Salary : "+salary*h);
}
}
class salariedworker extends worker
{
int salary;
salariedworker(int no,String n,int r)
{
super(no,n);
salary=r;
}
int hour=40;
void compay()
{
show();
System.out.println("Salary : "+salary*hour);
}
}
class workers
{
public static void main(String args[])
{
dailyworker d=new dailyworker(1247,"Vidushi",250);
salariedworker s=new salariedworker(1758,"Vibha",100);
d.compay();
s.compay();
}
}