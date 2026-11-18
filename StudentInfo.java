import java.sql.*;

class StudentInfo
{
    public static void main(String args[]) throws Exception
    {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");

        Statement st = con.createStatement();

     //   st.executeUpdate("Create database if not exists Product");

        st.executeUpdate("use Product");

        st.executeUpdate("create table if not exists Student("+"id int primary key, "+" name varchar(50),"+" branch varchar(30)," +"marks double)");

        System.out.println("Table Created Successfully");

        st.executeUpdate("insert into Student values(104,'Saurav' , 'AIDS' , 89.00)");
        st.executeUpdate("insert into Student values(105,'Karan' , 'AIDS' , 91.00)");
        st.executeUpdate("insert into Student values(106,'siddu' , 'AIDS' , 94.00)");

        System.out.println("Record Added Successfully");

        ResultSet rs = st.executeQuery("select * from Student");

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
        }

        st.executeUpdate("update Student set marks=95.98 where id=105");

        System.out.println("Record Updated Successfully");

         rs = st.executeQuery("select * from Student");

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
        }

       st.executeUpdate("delete from student where id=103");

       System.out.println("Record Deleted Successfully");

         rs = st.executeQuery("select * from Student");

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
        }

        rs.close();
        st.close();
        con.close();

    }
}