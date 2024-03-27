import java.sql.*;

public class ConnectionJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm","root","5269");
            System.out.println("Connection: "+conn);
        }catch (Exception e){
            System.out.println("Connection failed");
        }
    }
}
