package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/sql_hr";
        String username = "root";
        String password = "rpc123";
        String query = "update offices set address='Mondar' where office_id=11";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("connection success");
        Statement stmt = con.createStatement();
        int count = stmt.executeUpdate(query);
        System.out.println(count + "row affected");
        stmt.close();
        con.close();
    }
}
