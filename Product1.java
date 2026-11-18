import java.sql.*;

class Product1
{
    public static void main(String args[]) throws Exception
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");

        Statement st = con.createStatement();

        st.executeUpdate("CREATE DATABASE IF NOT EXISTS Product");
        st.executeUpdate("use Product");

        st.executeUpdate(
            "CREATE TABLE IF NOT EXISTS Clothing("+
            "id INT PRIMARY KEY,"+
            "name VARCHAR(50),"+
            "material VARCHAR(30))"
        );

        System.out.println("table created Successfully");

        st.executeUpdate("insert into Clothing values(105 , 'T-shirt' , ' Cotton' )");
        st.executeUpdate("insert into Clothing values(106 , 'pant' , ' Cotton' )");

        System.out.println("Record added Successfully");

        ResultSet rs= st.executeQuery("select * from Clothing");

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }

        st.executeUpdate("update Clothing set material='tericot' where id=106");

        System.out.println("Record Update Successfully");

        rs= st.executeQuery("select * from Clothing");

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }

        st.executeUpdate("delete from Clothing where id=102");

        System.out.println("Record Deleted Successfully");

        rs= st.executeQuery("select * from Clothing");

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }

        rs.close();
        st.close();
        con.close();

    }
}