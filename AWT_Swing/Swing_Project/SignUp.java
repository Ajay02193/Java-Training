package Swing_Project;

import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {

    SignUp(){
        setLayout(null);
        setLocation(450,150);
        setSize(700,500);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Sign Up");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Swing_Project/Icons/bg.jpg"));
        Image i2=i1.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel lbl= new JLabel(i3);
        lbl.setBounds(0,-20,700,500);

        JLabel loginlbl= new JLabel("Sign Up Details");
        loginlbl.setBounds(230,50,250,40);
        loginlbl.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        loginlbl.setForeground(Color.WHITE);
        add(loginlbl);

        JLabel namelbl=new JLabel("Name: ");
        namelbl.setBounds(150,125,100,30);
        namelbl.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        namelbl.setForeground(Color.WHITE);
        add(namelbl);

        add(lbl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new SignUp();
    }
}
