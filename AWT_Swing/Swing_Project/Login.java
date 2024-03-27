package Swing_Project;

import Student.StudentDBConn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField cardtxt;
    JPasswordField pintxt;
    JButton signin, signup, clear;
    Login(){
        setLayout(null);
        setLocation(450,150);
        setSize(700,500);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Login");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Swing_Project/Icons/bg.jpg"));
        Image i2=i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel lbl= new JLabel(i3);
        lbl.setBounds(0,-20,700,500);


        JLabel loginlbl= new JLabel("Login Details");
        loginlbl.setBounds(230,50,250,40);
        loginlbl.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        loginlbl.setForeground(Color.WHITE);
        add(loginlbl);

        JLabel cardlbl=new JLabel("User ID: ");
        cardlbl.setBounds(150,125,100,30);
        cardlbl.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        cardlbl.setForeground(Color.WHITE);
        add(cardlbl);

        cardtxt= new JTextField();
        cardtxt.setBounds(300,125,200,30);
        cardtxt.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
        add(cardtxt);

        JLabel pinlbl = new JLabel("Password: ");
        pinlbl.setBounds(150,165,100,30);
        pinlbl.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        pinlbl.setForeground(Color.WHITE);
        add(pinlbl);

        pintxt=new JPasswordField();
        pintxt.setBounds(300,165,200,30);
        pintxt.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
        add(pintxt);

        signin = new JButton("SIGN IN");
        signin.setBounds(165,215,150,40);
        signin.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        signin.setBackground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);

        clear = new JButton("CLEAR");
        clear.setBounds(335,215,150,40);
        clear.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        clear.setBackground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(165,275,320,50);
        signup.setFont(new Font("Comic Sans MS",Font.BOLD,22));
        signup.setBackground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        add(lbl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==signin){
            try{
                StudentDBConn sdb = new StudentDBConn();

                PreparedStatement ps = sdb.c.prepareStatement("select * from login");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    if(rs.getString("userid").equals(cardtxt.getText())&&rs.getString("password").equals(pintxt.getText())){
                        JOptionPane.showMessageDialog(null, "Success");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Invalid");
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Invalid");
            }
        }
        if(ae.getSource()==clear){
            cardtxt.setText("");
            pintxt.setText("");
        }
        if(ae.getSource()==signup){
            dispose();
            new SignUp();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
