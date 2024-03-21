import java.sql.*;

public class Batch {
    public static void main(String[] args) {
        Connection conn;
        Statement ps;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm", "root", "5269");
            ps= conn.createStatement();
            ps.addBatch("insert into Student1 values(107,'yui@mail.com','yui')");
            ps.addBatch("insert into Student1 values(108,'qwe@mail.com','qwe')");
            ps.addBatch("insert into Student1 values(109,'dfg@mail.com','dfg')");
            ps.addBatch("insert into Student1 values(110,'hjk@mail.com','hjk')");
            int[] i =ps.executeBatch();
            for(int cnt:i)
                System.out.println("Success"+cnt);

        } catch (Exception e) {

        }
    }
}
