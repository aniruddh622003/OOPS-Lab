package Experiment1;

import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/lab11";
    static final String USER = "root";
    static final String PASS = "aniruddh13";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {

            String sql = "CREATE TABLE q1 " +
                    "(id INTEGER NOT NULL AUTO_INCREMENT, " +
                    " Name VARCHAR(255), " +
                    " Age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // Execute a query
            System.out.println("Inserting records into the table...");
            sql = "INSERT INTO q1 VALUES (100, 'ani', 19)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO q1 VALUES (101, 'ram', 20)";
            stmt.executeUpdate(sql);


            System.out.println("Inserted records into the table...");
            ResultSet rs=stmt.executeQuery("select * from q1");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2) + " " +rs.getString(3));


            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
