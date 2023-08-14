package banking.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class login extends JFrame implements ActionListener
{

    JLabel  label1;
    JLabel  label2;
    JLabel  label3;

      JTextField textField2;
      JPasswordField passwordField3;

      JButton button1;
      JButton button2;
      JButton button3;


    login()
    {
        super("People's Bank");

//to get the image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/banklogo.png")); //we got system from memory
        Image i2= i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel( i3); //image added with help of jlabel
        image.setBounds(370, 10, 100,100); //gives location
        add(image); //jlabel image


//Heading
        label1= new JLabel("PEOPLE'S BANK");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Arial", Font.BOLD, 38));
        label1.setBounds(250, 125, 450, 40); //the x axis and y axis is counted from the frame of awt
        add(label1);

//card number l2
         label2= new JLabel("Card Number");
         label2.setForeground(Color.white);
         label2.setFont(new Font("AvantGarde", Font.BOLD, 20));
         label2.setBounds(150, 190, 375, 30);
         add(label2);

//textfeild 2
        textField2= new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14) );
        add(textField2);

//pin number L3
         label3= new JLabel("Pin Number");
         label3.setForeground(Color.white);
         label3.setFont(new Font("AvantGarde", Font.BOLD, 20));
         label3.setBounds(150, 250, 375, 30);
         add(label3);

//textPassword 3
        passwordField3= new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14) );
        add(passwordField3);

 //button 1
        button1= new JButton("Sign IN");
        button1.setForeground(Color.BLUE);
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

//button2
        button2= new JButton("Clear");
        button2.setForeground(Color.BLUE);
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setBounds(450, 300, 100, 30); //x l-r //y t-b //space
        button2.addActionListener(this);
        add(button2);

//button3
        button3= new JButton("Sign Up");
        button3.setForeground(Color.BLUE);
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setBounds(310, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);

//to get background 
        ImageIcon ii1= new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image ii2= ii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0, 0, 850,450);
        add(iimage);


        setLayout(null);
        setSize(850, 450);
        setLocation(450, 200); //of frame on the screen 
        // setUndecorated(true); to remove minimised cross option
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) //tells which button is clciked
    {
try{

    if(e.getSource()==button1) //getsource for input
    {
        Con1 con = new Con1();
        String cardno = textField2.getText();
        String pin = passwordField3.getText();
        String q = "select * from login where card_no = '"+cardno+"' and  pin = '"+pin+"'";
        ResultSet resultSet= con.statement.executeQuery(q);
        if(resultSet.next())
        {
            setVisible(false);
            new main_Class(pin);
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
        }

    }
    else if(e.getSource()==button2)
    {
        textField2.setText("");
        passwordField3.setText(""); //no gap bc it will not return blank

    }else if (e.getSource()==button3){
        new signup();
        setVisible(false);

    }

} catch (Exception E)
{
    E.printStackTrace();
}
    }
    public static void main(String[] args) {
        new login();
    }
}
