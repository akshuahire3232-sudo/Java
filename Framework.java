import java.util.*;
import java.util.Iterator;
class Employee
{
    int id;
    String name;

    Employee(int id , String name)
    {
        this.id = id;
        this.name = name;
    }
    public String toString()
    {
        return id+" "+name;
    }
}
class Framework
{
    public static void main(String args[])
    {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101 , "Akshay"));
        list.add(new Employee(102 , "Saurav"));

        HashSet<String> Depart = new HashSet<>();

        Depart.add("IT");
        Depart.add("HR");

        HashMap<Integer , String> map = new HashMap<>();

        map.put(104 , "varun");
        map.put(105 , "Prathamesh");


        Iterator<Employee> itr =list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
            System.out.println("Department of Employee:"+Depart);
            System.out.println("Employee Information"+map);
            
        }
    }
}