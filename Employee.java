import java.util.*;

class Employee
{
    int id;
    String name;
    double salary;

    Employee(String name)
    {
        this.name = name;
    }
    Employee(String name , double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    Employee(int id , String name , double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void Display()
    {
        System.out.println("Employee I'D   :"+id);
        System.out.println("Employee Name  :"+name);
        System.out.println("Employee Salary:"+salary);
    }
    void Annual_Salary()
    {
        double Annual_Salary = salary * 12;

        System.out.println("Annual Salary of Employee  :"+Annual_Salary);
    }

    public static void main(String args[])
    {
        Employee e = new Employee(101 , "Akshay" , 50000);

        e.Display();
        e.Annual_Salary();
    }
}