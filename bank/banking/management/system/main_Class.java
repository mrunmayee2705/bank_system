package banking.management.system;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource; 

public class main_Class extends JFrame implements ActionListener
 {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class (String pin )
    { 
        this.pin=pin;


        ImageIcon img1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image img2= img1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon img3= new ImageIcon(img2);
        JLabel image=new JLabel(img3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("SELECT YOUR TRANSACTION");
        label1.setBounds(500, 190, 400, 25);
        label1.setFont(new Font("Systen", Font.BOLD, 20));
        label1.setForeground(Color.white);
        image.add(label1);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.GRAY);
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.GRAY);
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.GRAY);
        b3.setBounds(410,318,150,35);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.GRAY);
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
       image.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.gray);
        b5.setBounds(410,362,150,35);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.GRAY);
        b6.setBounds(700,362,150,35);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.gray);
        b7.setBounds(700,406,150,35);
        b7.addActionListener(this);
        image.add(b7);

        setLayout(null);
        setSize(1550, 830);
        setLocation(0, 0); 
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new deposit(pin);
            setVisible(false);
        }
        else if (e.getSource()==b7)
        {
            System.exit(0); //closes full program
        }else if(e.getSource()==b2)
        {
            new withdrawl(pin);
            setVisible(false);
        }else if (e.getSource()==b6)
        {
            new balanceEnquiry(pin);
            setVisible(false);
        }else if(e.getSource()==b3)
        {
            new fastcash(pin);
            setVisible(false);
        }else if(e.getSource()==b5)
        {
            new pin(pin);
            setVisible(false);
        }else if (e.getSource()==b4)
        {
            new mini(pin);
            setVisible(false);
        }

    }
    public static void main(String args[])
    {
        new main_Class("");
    }
}
