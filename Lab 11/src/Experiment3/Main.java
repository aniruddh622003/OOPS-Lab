package Experiment3;

import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/lab11";
    static final String USER = "root";
    static final String PASS = "aniruddh13";

    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = con.createStatement();){
            String sql = "CREATE TABLE Meeting " +
                    "(id INTEGER NOT NULL AUTO_INCREMENT, " +
                    " NameOfParticipant VARCHAR(255), " +
                    " MeetingID VARCHAR(255), " +
                    " ScheduledTime DATETIME, " +
                    " Email VARCHAR(255), " +
                    " Mobile VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
            System.out.println("Inserting records into the table...");
            sql = "INSERT INTO Meeting VALUES (1, 'Amit', '1105', '2021-11-28 12:10:00', 'amitsq@gmail.com', '2294829384')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Meeting VALUES (2, 'Radha', '1105', '2021-11-28 12:10:00', 'radhaed@gmail.com', '3284758923')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Meeting VALUES (3, 'John', '1051', '2021-11-28 15:20:00', 'johnwalk@gmail.com', '9485038549')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Meeting VALUES (4, 'Vimal', '1144', '2021-11-30 15:20:00', 'vim@gmail.com', '3425678921')";
            stmt.executeUpdate(sql);

            ResultSet rs = stmt.executeQuery("select * from Meeting");
            ResultSetMetaData rsMeta = rs.getMetaData();
            System.out.println("");
            System.out.println("Names of Column in Table MEETING -> ");
            int c = rsMeta.getColumnCount();
            for (int i = 1; i <= c; i++){
                System.out.println(rsMeta.getColumnName(i));
            }

            rs = stmt.executeQuery("select NameofParticipant from Meeting where MeetingID = '1144'");
            System.out.println("");
            System.out.println("Names of participants in meeting 1144 -> ");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }

            sql = "INSERT INTO Meeting (NameofParticipant) VALUES  ('New Name');";
            stmt.executeUpdate(sql);

            rs = stmt.executeQuery("select id from Meeting where NameofParticipant = 'New Name'");
            System.out.println("");
            System.out.println("ID of new participants -> ");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }

            rs = stmt.executeQuery("select count(*) from Meeting where MeetingID = '1105'");
            System.out.println("");
            System.out.print("No of participants in Meeting 1105: ");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }

            rs = stmt.executeQuery("select NameofParticipant, DAYOFWEEK(ScheduledTime) from Meeting");
            System.out.println("");
            System.out.println("Participants attending Tuesday meetings -> ");
            while(rs.next()){
                if((rs.getString(2) + "").equals("3")){
                    System.out.print(rs.getString(1) + " ");
                }
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
