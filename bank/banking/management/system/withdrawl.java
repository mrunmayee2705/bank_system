package banking.management.system;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.awt.Font;
import java.awt.Color;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.ColorUIResource; 

public class withdrawl extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton deposit;
    JButton cancel;

withdrawl(String pin)

{
this.pin=pin;

    ImageIcon img1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
    Image img2= img1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
    ImageIcon img3= new ImageIcon(img2);
    JLabel image=new JLabel(img3);
    image.setBounds(0,0,1550,830);
    add(image);

    //MAIN HEADING
    JLabel label1 = new JLabel("MAX WITHDRAWL IS RS.10,000");
    label1.setBounds(480, 180, 700, 35);
    label1.setFont(new Font("Systen", Font.BOLD, 16));
    label1.setForeground(Color.white);
    image.add(label1);

    JLabel label2 = new JLabel("ENTER YOUR AMOUNT");
    label2.setBounds(500, 220, 400, 35);
    label2.setFont(new Font("Systen", Font.BOLD, 16));
    label2.setForeground(Color.white);
    image.add(label2);

    textField=new TextField();
    textField.setBounds(490,260,250,25);
    textField.setFont(new Font("Raleway", Font.BOLD, 22));
    textField.setForeground(Color.BLACK);
    image.add(textField);


    //DEPOSIT BUTTON
    deposit = new JButton("WITHDRAWL");
    deposit.setBounds(700,362,150,35);
    deposit.setBackground(Color.GRAY);
    deposit.setForeground(Color.white);
    deposit.addActionListener(this);
    image.add(deposit);

    //CANCEL BUTTON
    cancel = new JButton("CANCEL");
    cancel.setBounds(700,412,150,35);
    cancel.setBackground(Color.GRAY);
    cancel.setForeground(Color.white);
    cancel.addActionListener(this);
    image.add(cancel);


    setLayout(null);
    setSize(1550, 830);
    setLocation(0, 0); //get frame in desired place
    setVisible(true);
    getContentPane().setBackground(Color.DARK_GRAY);
}

@Override
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==deposit)
    {
    try{
        String amount= textField.getText();
        Date date= new Date();
        if(textField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"PLEASE ENTER AMOUNT");
            }else
            {
                Con1 con = new Con1();
                ResultSet resultSet= con.statement.executeQuery("select * from deposit where pin ='"+pin+"'");
                int balance = 0;
                while(resultSet.next())
                {
                    if (resultSet.getString("type").equals("deposit")) 
                    {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }  
                    else
                    {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }           
                }

                if (balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }
                con.statement.executeUpdate("insert into deposit values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                setVisible(false);
                new main_Class(pin);
            }

    }catch(Exception E)
    {

    }
    // else if (e.getSource()==cancel) {
    //     setVisible(false);
    //     new main_Class(pin);
    // }
 }
}
    public static void main(String args[])
    {
        new withdrawl("");
    }
    
}
