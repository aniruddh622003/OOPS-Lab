package Experiment2;

import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/lab11";
    static final String USER = "root";
    static final String PASS = "aniruddh13";

    public static void main(String[] args) {

        String CREATE_TABLE_SQL="CREATE TABLE employee2021 ("
                + "empid INT NOT NULL,"
                + "NAME VARCHAR(45) NOT NULL,"
                + "city VARCHAR(45) NOT NULL,"
                + "PRIMARY KEY (empid))";


        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {

            stmt.executeUpdate(CREATE_TABLE_SQL);

            System.out.println("Table created");

            String sql = "INSERT INTO employee2021 " +
                    "VALUES (12, 'ani', 'Raipur')";


            stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");

            ResultSet rs=stmt.executeQuery("select * from employee2021");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2) + " " +rs.getString(3));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

