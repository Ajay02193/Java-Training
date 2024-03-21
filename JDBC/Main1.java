import java.sql.*;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

//        Scanner scn =new Scanner(System.in);
//        System.out.println("Student_ID: ");
//        int sid=scn.nextInt();
//        scn.nextLine();
//        System.out.println("Email: ");
//        String em=scn.nextLine();
//        System.out.println("Password: ");
//        String pass=scn.nextLine();
        Connection conn;
        PreparedStatement ps;
        try{
            //1. Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. Connection Establishment
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/saitm","root","5269");

            //3. Connect mysql jar-file
            System.out.println("Connected");

            //4. Statement load
            ps =conn.prepareStatement("select * from Student1");
//            ps.setInt(1,sid);
//            ps.setString(2,em);
//            ps.setString(3,pass);

            //5. Execute
//            int count=ps.executeUpdate();
//            if(count!=0)
//                System.out.println("Successful");
//            else
//                System.out.println("Unsuccessful");
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                System.out.println("S_Id: "+rs.getInt("S_Id")+" | Email: "+rs.getString("Email")+" |; Password: "+rs.getString("Password"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}






//*************************************************************************************
//Statement s = conn.createStatement();
//
//ResultSet rs=s.executeQuery("select * from student");
//
//ResultSetMetaData rsm = rs.getMetaData();
//int cc=rsm.getColumnCount();
//            for(int i=1;i<=cc;i++){
//        System.out.print(rsm.getColumnName(i)+"\t");
//        }
//        System.out.println();
//
//            while(rs.next()){
//        for(int i=1;i<=cc;i++){
//        System.out.print(rs.getString(i)+"\t");
//        }
//        System.out.println();
//
//            }
//*************************************************************************************
