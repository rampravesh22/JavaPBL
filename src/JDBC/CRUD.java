package JDBC;

import java.sql.*;
import java.util.Scanner;


public class CRUD {
    public static void main(String[] args) throws Exception {
        CRUD c = new CRUD();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter 1 for Adding record\nEnter 2 for Deleting record\nEnter 3 for Updating record\nEnter 4 for show all the Record\nEnter 5 the close the connection: ");
            int ch = sc.nextInt();
            if (ch == 1)
                c.addRecord();
            if (ch == 2)
                c.deleteRecord();
            if (ch == 3) {

            }
            if (ch == 4) {
                c.showRecord();
            }
            System.out.println("jddjjdjjdjdj");
            if (ch == 5) {
                c.closeConnection();
                break;
            }
            System.out.println("------------------------------------------------------------");
        }
    }

    public void addRecord() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roll = ");
        int roll = sc.nextInt();
        String empty = sc.nextLine();
        System.out.print("Enter the Student name = ");
        String name = sc.nextLine();
        String url = "jdbc:mysql://localhost:3306/sql_hr";
        String username = "root";
        String password = "rpc123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        String query = "insert into student values(?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, roll);
        ps.setString(2, name);
        int count = ps.executeUpdate();
        System.out.println("One row is ADDED in the Student table");


    }

    public void deleteRecord() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No To Delete The Record = ");
        int roll = sc.nextInt();
        String url = "jdbc:mysql://localhost:3306/sql_hr";
        String username = "root";
        String password = "rpc123";
        String query = "delete from student where roll=" + roll;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        int count = stmt.executeUpdate(query);
        stmt.close();
        con.close();
        System.out.println("One row is DELETED in the Student table");


    }

    public void updateRecord(int roll) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name = ");
        String name = sc.nextLine();
        String url = "jdbc:mysql://localhost:3306/sql_hr";
        String username = "root";
        String password = "rpc123";
        String query = "update student set name=" + name + "where id=" + roll;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        int count = stmt.executeUpdate(query);
        stmt.close();
        con.close();

        System.out.println("One row is UPDATED in the Student table");


    }

    public void showRecord() throws Exception {
        String url = "jdbc:mysql://localhost:3306/sql_hr";
        String username = "root";
        String password = "rpc123";
        String query = "select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "  " + rs.getString(2));
        }
        stmt.close();
        con.close();


    }

    public void closeConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/sql_hr";
        String username = "root";
        String password = "rpc123";
        String query = "select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        con.close();
    }
}
