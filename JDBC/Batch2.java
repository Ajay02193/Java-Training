import java.sql.*;

public class Batch2 {
    public static void main(String[] args) {
        Connection conn;
        PreparedStatement ps;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm", "root", "5269");
            ps= conn.prepareStatement("insert into Student1 values(?,?,?)");

            ps.setInt(1,111);
            ps.setString(2,"ert@mail.com");
            ps.setString(3,"ert");
            ps.addBatch();

            ps.setInt(1,112);
            ps.setString(2,"bnm@mail.com");
            ps.setString(3,"bnm");
            ps.addBatch();

            ps.setInt(1,113);
            ps.setString(2,"246@mail.com");
            ps.setString(3,"246");
            ps.addBatch();

            int[] i =ps.executeBatch();
            for(int cnt:i)
                System.out.println("Success"+cnt);

        } catch (Exception e) {

        }
    }
}
