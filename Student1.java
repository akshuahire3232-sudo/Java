
import java.sql.*;

class Student1
{
    public static void main(String args[]) throws Exception
    {
        // Connect Database
    //    Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/", "root", "root");

        Statement st = con.createStatement();

        // Create Database
        st.executeUpdate("CREATE DATABASE IF NOT EXISTS college");
        st.executeUpdate("USE college");

        System.out.println("Database Created Successfully");

        // Create Table
        st.executeUpdate(
            "CREATE TABLE IF NOT EXISTS Student1 ("+
            "id INT PRIMARY KEY,"+
            "name VARCHAR(50),"+
            "department VARCHAR(30),"+
            "marks DOUBLE)"
        );

        System.out.println("Table Created Successfully");

        // Delete Old Records
        st.executeUpdate("DELETE FROM Student1");

        // Insert Records
        st.executeUpdate("INSERT INTO Student1 VALUES(101,'Akshay','AIDS',89)");
        st.executeUpdate("INSERT INTO Student1 VALUES(102,'Varun','AIDS',90)");

        System.out.println("Records Inserted Successfully");

        // Display Records
        ResultSet rs = st.executeQuery("SELECT * FROM Student1");

        System.out.println("\nStudent Records:");

        while(rs.next())
        {
            System.out.println(
                rs.getInt(1)+" "+
                rs.getString(2)+" "+
                rs.getString(3)+" "+
                rs.getDouble(4));
        }

        // Update Record
        st.executeUpdate("UPDATE Student1 SET marks=95 WHERE id=101");

        System.out.println("\nRecord Updated Successfully");

        // Display Updated Records
        rs = st.executeQuery("SELECT * FROM Student1");

        while(rs.next())
        {
            System.out.println(
                rs.getInt(1)+" "+
                rs.getString(2)+" "+
                rs.getString(3)+" "+
                rs.getDouble(4));
        }

        // Delete Record
        st.executeUpdate("DELETE FROM Student1 WHERE id=102");

        System.out.println("\nRecord Deleted Successfully");

        // Display Final Records
        rs = st.executeQuery("SELECT * FROM Student1");

        while(rs.next())
        {
            System.out.println(
                rs.getInt(1)+" "+
                rs.getString(2)+" "+
                rs.getString(3)+" "+
                rs.getDouble(4));
        }

        // Close Connection
        rs.close();
        st.close();
        con.close();
    }
}