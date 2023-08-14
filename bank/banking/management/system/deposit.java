package banking.management.system;

import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.ColorUIResource;


public class deposit extends JFrame implements ActionListener {

    String pin;
    TextField textField;
    JButton deposit;
    JButton cancel;

    deposit(String pin)
    {
        this.pin=pin;

        ImageIcon img1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image img2= img1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon img3= new ImageIcon(img2);
        JLabel image=new JLabel(img3);
        image.setBounds(0,0,1550,830);
        add(image);

        //MAIN HEADING
        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setBounds(460, 180, 400, 35);
        label1.setFont(new Font("Systen", Font.BOLD, 16));
        label1.setForeground(Color.white);
        image.add(label1);

        textField=new TextField();
        textField.setBounds(490,230,250,25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        textField.setForeground(Color.BLACK);
        image.add(textField);

        deposit = new JButton("DEPOSIT");
        deposit.setBounds(700,362,150,35);
        deposit.setBackground(Color.GRAY);
        deposit.setForeground(Color.white);
        deposit.addActionListener(this);
        image.add(deposit);

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
        try{

        String amount= textField.getText();
        Date date= new Date();
        if(e.getSource()==deposit)
        {
            if(textField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"PLEASE ENTER AMOUNT");
            }else
            {
                Con1 con = new Con1();
                con.statement.executeUpdate("insert into deposit values('"+pin+"', '"+date+"','deposit', '"+amount+"')");
              JOptionPane.showMessageDialog(null,"Rs." +amount+ " Deposit Done");
              setVisible(false);
              new main_Class(pin);
            }
        }
        else if (e.getSource()==cancel)
        {
             setVisible(false);
             new main_Class(pin);
        }
    }catch(Exception E)
    {
        E.printStackTrace();
    }
}
    public static void main(String args[])
    {
        new deposit("");
    }
    
}
