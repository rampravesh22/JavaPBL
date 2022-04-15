package JDBC;

import java.sql.*;
import java.util.Scanner;

public class AddingRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sql_hr";
        String username = "root";
        String password = "rpc123";
        Scanner sc = new Scanner(System.in);

//        String query = "insert into offices values(adress,city,state,query)";

        try {
            //Load and register mysql driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // stablish the conncction
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection success");

            // create a statement
            Statement stmt = con.createStatement();

            // Executing query
//            int count = stmt.executeUpdate(query);
//            ResultSet rs = stmt.executeQuery(query);

//            prepare staement
            String query = "insert into offices values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 15);
            ps.setString(2, "a31 street naini");
            ps.setString(3, "Prayagraj");
            ps.setString(4, "Uttar Pradesh");
            int count = ps.executeUpdate();
            System.out.println(count + " row afftected");

//            System.out.println(count + " row affected");

//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            }
            stmt.close();
            con.close();


        } catch (Exception e) {
            System.out.println("Excetion gernerated");
            e.printStackTrace();
        }

    }
}
