import javax.swing.*;
import java.awt.*;

public class Swing extends JFrame {
    Swing(){
        setLayout(null);

        setSize(800,400);

        setDefaultCloseOperation(EXIT_ON_CLOSE);        //3 - works similarly as EXIT_ON_CLOSE
        setTitle("WELCOME");

        setLocation(450,100);

        JLabel name = new JLabel("Name");
        name.setBounds(100,50,200,30);
        name.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        add(name);

        JLabel address = new JLabel("Address");
        address.setBounds(100,100,200,30);
        address.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        add(address);

        JTextField tfname = new JTextField();
        tfname.setBounds(375,50,200,30);
        tfname.setBackground(Color.WHITE);
        tfname.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        add(tfname);

        JTextField tfadd = new JTextField();
        tfadd.setBounds(375,100,200,30);
        tfadd.setBackground(Color.WHITE);
        tfadd.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        add(tfadd);

        getContentPane().setBackground(Color.WHITE);

        JButton submit=new JButton("Submit");
        submit.setBounds(150,150,150,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        add(submit);

        JButton cancel=new JButton("Cancel");
        cancel.setBounds(365,150,150,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Comic Sans MS", Font.BOLD,20));
        add(cancel);

        JRadioButton male=new JRadioButton("Male");
        male.setBounds(185,200,100,30);
        male.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        male.setBackground(Color.WHITE);
        add(male);

        JRadioButton female=new JRadioButton("Female");
        female.setBounds(390,200,100,30);
        female.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        JCheckBox atm= new JCheckBox("ATM");
        atm.setBounds(185,240,100,30);
        atm.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        atm.setBackground(Color.WHITE);
        add(atm);

        JCheckBox net= new JCheckBox("Net Banking");
        net.setBounds(375,240,150,30);
        net.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        net.setBackground(Color.WHITE);
        add(net);

//        JOptionPane.showMessageDialog(null,"Bye-Bye");

        setVisible(true);

    }

    public static void main(String[] args) {
        new Swing();
    }

}
