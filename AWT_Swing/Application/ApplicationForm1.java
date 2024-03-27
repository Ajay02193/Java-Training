package Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import com.toedter.calendar.*;

public class ApplicationForm1 extends JFrame implements ActionListener {

    JButton next;
    JTextField nametxt, fathertxt, emailtxt,addresstxt, citytxt, statetxt, pinCodetxt;
    JRadioButton male, female, cash, upi, other;
    JDateChooser dobtxt;
    Long formno;
    ApplicationForm1(){
        setLayout(null);
        setLocation(400,75);
        setSize(800,700);

        Random ran = new Random();
        formno = Math.abs(ran.nextLong()%9000+1000);

        JLabel head = new JLabel("APPLICATION FORM NO. "+formno);
        head.setBounds(100,25,600,50);
        head.setFont(new Font("COMIC SANS MS",Font.BOLD,35));
        add(head);

        JLabel subHead = new JLabel("Page 1: Personal Details");
        subHead.setBounds(250,75,300,50);
        subHead.setFont(new Font("COMIC SANS MS",Font.BOLD,25));
        add(subHead);

        JLabel namelbl = new JLabel("Name: ");
        namelbl.setBounds(75,125,200,50);
        namelbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(namelbl);

        nametxt = new JTextField();
        nametxt.setBounds(325,135,350,30);
        nametxt.setFont(new Font("COMIC SANS MS",Font.PLAIN,18));
        add(nametxt);

        JLabel fatherlbl = new JLabel("Father's Name: ");
        fatherlbl.setBounds(75,160,200,50);
        fatherlbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(fatherlbl);

        fathertxt = new JTextField();
        fathertxt.setBounds(325,170,350,30);
        fathertxt.setFont(new Font("COMIC SANS MS",Font.PLAIN,18));
        add(fathertxt);

        JLabel doblbl = new JLabel("Date of Birth: ");
        doblbl.setBounds(75,195,200,50);
        doblbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(doblbl);

        dobtxt = new JDateChooser();
        dobtxt.setBounds(325,205,350,30);
        dobtxt.setFont(new Font("COMIC SANS MS",Font.PLAIN,18));
        add(dobtxt);

        JLabel genderlbl = new JLabel("Gender: ");
        genderlbl.setBounds(75,230,200,50);
        genderlbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(genderlbl);

        male= new JRadioButton("Male");
        male.setBounds(340,240,100,30);
        male.setFont(new Font("COMIC SANS MS",Font.BOLD,18));
        add(male);

        female= new JRadioButton("Female");
        female.setBounds(540,240,200,30);
        female.setFont(new Font("COMIC SANS MS",Font.BOLD,18));
        add(female);

        ButtonGroup gender= new ButtonGroup();
        gender.add(male);
        gender.add(female);

        JLabel emaillbl = new JLabel("Email Address: ");
        emaillbl.setBounds(75,265,200,50);
        emaillbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(emaillbl);

        emailtxt = new JTextField();
        emailtxt.setBounds(325,275,350,30);
        emailtxt.setFont(new Font("COMIC SANS MS",Font.PLAIN,18));
        add(emailtxt);

        JLabel paymentlbl = new JLabel("Mode of Payment: ");
        paymentlbl.setBounds(75,300,200,50);
        paymentlbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(paymentlbl);

        cash= new JRadioButton("Cash");
        cash.setBounds(340,310,100,30);
        cash.setFont(new Font("COMIC SANS MS",Font.BOLD,18));
        add(cash);

        upi= new JRadioButton("UPI");
        upi.setBounds(440,310,100,30);
        upi.setFont(new Font("COMIC SANS MS",Font.BOLD,18));
        add(upi);

        other= new JRadioButton("Others");
        other.setBounds(540,310,100,30);
        other.setFont(new Font("COMIC SANS MS",Font.BOLD,18));
        add(other);

        ButtonGroup modePayment=new ButtonGroup();
        modePayment.add(cash);
        modePayment.add(upi);
        modePayment.add(other);

        JLabel addresslbl = new JLabel("Address: ");
        addresslbl.setBounds(75,335,200,50);
        addresslbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(addresslbl);

        addresstxt = new JTextField();
        addresstxt.setBounds(325,345,350,30);
        addresstxt.setFont(new Font("COMIC SANS MS",Font.PLAIN,18));
        add(addresstxt);

        JLabel citylbl = new JLabel("City: ");
        citylbl.setBounds(75,370,200,50);
        citylbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(citylbl);

        citytxt = new JTextField();
        citytxt.setBounds(325,380,350,30);
        citytxt.setFont(new Font("COMIC SANS MS",Font.PLAIN,18));
        add(citytxt);

        JLabel statelbl = new JLabel("State: ");
        statelbl.setBounds(75,405,200,50);
        statelbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(statelbl);

        statetxt = new JTextField();
        statetxt.setBounds(325,415,350,30);
        statetxt.setFont(new Font("COMIC SANS MS",Font.PLAIN,18));
        add(statetxt);

        JLabel pinCodelbl = new JLabel("Pin Code: ");
        pinCodelbl.setBounds(75,440,200,50);
        pinCodelbl.setFont(new Font("COMIC SANS MS",Font.BOLD,20));
        add(pinCodelbl);

        pinCodetxt = new JTextField();
        pinCodetxt.setBounds(325,450,350,30);
        pinCodetxt.setFont(new Font("COMIC SANS MS",Font.PLAIN,18));
        add(pinCodetxt);

        next= new JButton("NEXT");
        next.setBounds(550,510,150,50);
        next.setFont(new Font("COMIC SANS MS",Font.BOLD,22));
        next.setBackground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){

            String form=""+formno;
            String name=nametxt.getText();
            String fname=fathertxt.getText();

            Date date=dobtxt.getDate();
            SimpleDateFormat sqlformat= new SimpleDateFormat("yyyy-MM-dd");
            String dob=sqlformat.format(date);

            String gen="";
            if(male.isSelected())
                gen="male";
            else if(female.isSelected())
                gen="female";

            String email=emailtxt.getText();

            String mop="";
            if(cash.isSelected())
                mop="cash";
            else if(upi.isSelected())
                mop="upi";
            else if(other.isSelected())
                mop="other";

            String address=addresstxt.getText();
            String city=citytxt.getText();
            String state=statetxt.getText();
            String pinCode=pinCodetxt.getText();

            boolean proceed=false;

            if(name.isEmpty()||fname.isEmpty()){
                JOptionPane.showMessageDialog(null,"Name & Father Name can't be empty");
                proceed=false;
            }
            else
                proceed=true;

            if(proceed){
                try{

                    Conn conn=new Conn();

                    String query="insert into student values('"+form+"','"+name+"','"+fname+"','"+dob+"','"+gen+"','"+email+"','"+mop+"','"+address+"','"+city+"','"+state+"','"+pinCode+"')";

                    PreparedStatement ps= conn.c.prepareStatement(query);
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null,"Successful Insertion");
                    dispose();

                    query="select * from student";

                    ps=conn.c.prepareStatement(query);
                    ResultSet rs=ps.executeQuery();

                    while(rs.next()){
                        System.out.println(rs.getString("formno")+rs.getString("name")+rs.getString("fname")+rs.getString("dob")+rs.getString("gender")+rs.getString("email")+rs.getString("mop"));
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Invalid input"+e);
                    e.printStackTrace();
                }
            }
        }
    }




    public static void main(String[] args) {
        new ApplicationForm1();
    }
}
