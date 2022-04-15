package JDBC;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sql_hr";
        String username = "root";
        String password = "rpc123";
        String query = "select * from offices";
        try {
            //Load and register mysql driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // stablish the conncction
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection success");

            // create a statement
            Statement stmt = con.createStatement();

            // Executing query
            ResultSet rs = stmt.executeQuery(query);

            //process the result

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();


        } catch (Exception e) {
            System.out.println("Excetion gernerated");
            e.printStackTrace();
        }

    }
}
