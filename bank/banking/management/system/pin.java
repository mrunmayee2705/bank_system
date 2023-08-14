package banking.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
   
    pin(String pin){
        this.pin =pin;

        ImageIcon img1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image img2= img1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon img3= new ImageIcon(img2);
        JLabel image=new JLabel(img3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setBounds(430, 180, 400, 35);
        label1.setFont(new Font("Systen", Font.BOLD, 16));
        label1.setForeground(Color.white);
        image.add(label1);

        JLabel label2 = new JLabel("NEW PIN");
        label2.setBounds(430,220,150,35);
        label2.setFont(new Font("Systen", Font.BOLD, 16));
        label2.setForeground(Color.white);
        image.add(label2);


        p1= new JPasswordField();
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        p1.setForeground(Color.BLACK);
        image.add(p1);

        JLabel label3 = new JLabel("RE-ENTER NEW PIN");
        label3.setBounds(430,250,400,35);
        label3.setFont(new Font("Systen", Font.BOLD, 16));
        label3.setForeground(Color.white);
        image.add(label3);

        p2= new JPasswordField();
        p2.setBounds(600,255,180,25);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        p2.setForeground(Color.BLACK);
        image.add(p2);

        b1 = new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("CANCEL");
        b2.setBounds(700,412,150,35);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        image.add(b2);

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

            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if (e.getSource()==b1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Con1 con = new Con1();
                String q1 = "update deposit set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                con.statement.executeUpdate(q1);
                con.statement.executeUpdate(q2);
                con.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);
                new main_Class(pin);

            } else if (e.getSource()==b2) {
                new main_Class(pin);
                setVisible(false);
            }


        } catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new pin(" ");
    }
}