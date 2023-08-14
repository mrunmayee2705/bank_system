package banking.management.system;

import javax.swing.plaf.ColorUIResource;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener 
{
    String pin;
    JButton button;
mini(String pin )
{

    this.pin=pin;

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,250);
        add(label1);

        JLabel label2 = new JLabel("DUMPSIE BUMPSIE");
        label2.setFont(new Font("Arial", Font.BOLD,15));
        label2.setBounds(130,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,430,300,20);
        add(label4);


        try{
            Con1 con = new Con1();
            ResultSet resultSet = con.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number:  "+ resultSet.getString("card_no").substring(0,4) + "XXXXXXXX"+ resultSet.getString("card_no").substring(12));
            }

        }catch (Exception e ){
            e.printStackTrace();
        }

        try{
            int balance =0;
            Con1 con = new Con1();
            ResultSet resultSet = con.statement.executeQuery("select * from deposit where pin = '"+pin+"'");
            while (resultSet.next()){

                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><html>");

                if (resultSet.getString("type").equals("deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs "+balance);
            
        }catch (Exception e){
            e.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.white);
        button.setForeground(Color.black);
        add(button);

        // setVisible(true);
    
    setLayout(null);
    setSize(400, 600);
    setVisible(true);
    setLocation(450, 200);
    getContentPane().setBackground(new ColorUIResource(240, 206, 245));

}

@Override
public void actionPerformed(ActionEvent e)
{

    setVisible(false);
}

    public static void main(String[] args) {
        new mini(" ");
    }
    
}
