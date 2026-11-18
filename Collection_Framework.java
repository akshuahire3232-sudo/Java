import java.util.*;

class Employee
{
    int id;
    String name;
    Employee(int id , String name)
    {
        this.id  = id;
        this.name = name;
    }

    public String toString()
    {
        return id+"-"+name;
    }
}
    public class Collection_Framework
    {
        public static void main(String args[])
        {
            ArrayList<Employee>list = new ArrayList<>();
            
            list.add(new Employee(101 , "Akshay"));
            list.add(new Employee(102 , "Saurav"));

            HashSet<String> department = new HashSet<>();

            department.add("IT");
            department.add("HR");

            HashMap<Integer , String> map  =new HashMap<>();

            map.put(101,"Akshay");
            map.put(102,"Saurav");

            System.out.println("Employee Directory");

            Iterator<Employee> itr =list.iterator();

            while(itr.hasNext())
            {
                System.out.println(itr.next());

                System.out.println("Deparment:"+department);
                System.out.println("Employee Map:"+map);
            }
        }
    }
