import java.util.*;

interface Academic 
{
    void Academic_Details();
    void Academic_Display();

}
interface Sport
{
    void Sport_Details();
    void Sport_Display();
}

class Student implements Academic , Sport
{
    int rollno;
    String name , branch;
    String spo_name;
    String rank;

    Scanner sc = new Scanner(System.in);
    
    public void Academic_Details()
    {
        System.out.println("Enter a Student Roll NUmber  :");
        rollno =sc.nextInt();

        sc.nextLine();
        System.out.println("Enter a Student Name   :");
        name =sc.nextLine();

        System.out.println("Enter a Student Branch :");
        branch = sc.nextLine();

    }
    public void Academic_Display()
    {
        System.out.println("Student Roll Number  :"+rollno);
        System.out.println("Student Name         :"+name);
        System.out.println("Student Branch       :"+branch);
    }

    public void Sport_Details()
    {
        System.out.println("Enter a Student Sport Name :");
        spo_name = sc.next();

        System.out.println("Enter a Student Sport Rank :");
        rank= sc.next();
    }
    public void Sport_Display()
    {
        System.out.println("Student Sport Name  :"+spo_name);
        System.out.println("Student Sport Rank  :"+rank);
    }
}

class Practical6
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.Academic_Details();
        s.Sport_Details();
        s.Academic_Display();
        s.Sport_Display();
    }
}