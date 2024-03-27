package Swing_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener {

    JTextField nametxt,emailtxt;
    JPasswordField passtxt;
    JButton submit,back;
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

        nametxt=new JTextField();
        nametxt.setBounds(300,125,200,30);
        nametxt.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
        add(nametxt);

        JLabel emaillbl=new JLabel("Email ID: ");
        emaillbl.setBounds(150,175,100,30);
        emaillbl.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        emaillbl.setForeground(Color.WHITE);
        add(emaillbl);

        emailtxt=new JTextField();
        emailtxt.setBounds(300,175,200,30);
        emailtxt.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
        add(emailtxt);

        JLabel passlbl=new JLabel("Password: ");
        passlbl.setBounds(150,225,100,30);
        passlbl.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        passlbl.setForeground(Color.WHITE);
        add(passlbl);

        passtxt = new JPasswordField();
        passtxt.setBounds(300,225,200,30);
        passtxt.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
        add(passtxt);

        submit = new JButton("SUBMIT");
        submit.setBounds(165,285,150,40);
        submit.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        submit.setBackground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        back = new JButton("BACK");
        back.setBounds(335,285,150,40);
        back.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        add(lbl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){

        }
        if(ae.getSource()==back){
            dispose();
            new Login();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
