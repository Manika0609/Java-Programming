class EmployeeDetails {
    String n;
    int id;
    int pay;
    EmployeeDetails(String name,int emp_id, int salary)//parameterised constructor
    { n=name; id=emp_id;pay=salary; }
    void increase_salary(int x) {
        pay = pay+ ((x*pay)/100);
        System.out.println("The increased salary is : "+pay);
    }
    EmployeeDetails(){}//default constructor
    void show()
    {
    System.out.println("\n--------------------------");
    System.out.println("Name of Employee: "+n);
    System.out.println("Employee id: "+id);
    System.out.println("Salary of Employee: "+pay);
    
    }
    void type() {System.out.println("This is a Employee");}
}


class Manager extends EmployeeDetails {
    String department="Technical";
    Manager(String name,int emp_id, int salary){
        super(name,emp_id,salary);
    }
        void print() 
        {
            show();
            System.out.println("Department: "+ department);
        }
    void type() {System.out.println("This is a Manager");}//method overriding
    void type(int a) {System.out.println("This is also a Manager form "+a+" years");}//method overloading
        
    Manager(){
        show();
        System.out.println("This is also a manager");
        System.out.println("Default constructor Created");
        }
        
    }

public class emp {
    
    public static void main(String args[])
    {
    Manager m = new Manager("Manika", 18, 48200);  //parameterised constructor
                      //name/ emp_id/ salary
    m.print();
    m.increase_salary(50);
    m.type();
    m.type(10);

    Manager m2= new Manager();// default constructor

    }
}
