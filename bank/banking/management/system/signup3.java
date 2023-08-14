package banking.management.system;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.plaf.ColorUIResource;

public class signup3 extends JFrame implements ActionListener {

   JComboBox acc;
   JCheckBox c1 , c2, c3, c4, c5, c6;
   JCheckBox c7;
   JButton submit;
   JButton cancel;

//    String formno;

    signup3( )
    {
         super("Application form");
        // this.formno=formno;
        // super("Application form");
        //IMAGE
        ImageIcon iiii1= new ImageIcon(ClassLoader.getSystemResource("icon/banklogo.png"));
        Image iiii2= iiii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iiii3= new ImageIcon(iiii2);
        JLabel iimage=new JLabel(iiii3);
        iimage.setBounds(25,10,100,100);
        add(iimage);

        //FORM
        JLabel label2 = new JLabel("APPLICATION FORM:");
        label2.setBounds(220,20,600,40);
        label2.setFont(new Font("Raleway", Font.BOLD, 38));
        label2.setForeground(new ColorUIResource(122,2,80));
        add(label2);

        //SUB HEADING
        JLabel label3 = new JLabel("ACCOUNT DETAILS");
        label3.setBounds(230, 80, 600, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 38));
        label3.setForeground(Color.BLACK);
        add(label3);

        //ACC TYPE
        JLabel label1 = new JLabel("Account Type:");
        label1.setBounds(100, 190, 300,30);
        label1.setFont(new Font("Arial", Font.PLAIN, 28));
        label1.setForeground(Color.BLACK);
        add(label1);

        String income[]={"Current Account", "Fixed Deposit Account", "Recurring Account", "Savings Account"};
        acc= new JComboBox(income);
        acc.setFont(new Font("Raleway", Font.BOLD, 14));
        acc.setBackground(Color.WHITE);
        acc.setBounds(300, 190, 320, 30);
        add(acc);

        //CARD NUMBER
         JLabel label4 = new JLabel("Card Number:");
        label4.setBounds(100, 280, 200,30);
        label4.setFont(new Font("Arial", Font.PLAIN, 28));
        label4.setForeground(Color.BLACK);
        add(label4);
        
        JLabel label5 = new JLabel("(your 16 digit card number)");
        label5.setBounds(80, 300, 350,30);
        label5.setFont(new Font("Arial", Font.PLAIN, 18));
        label5.setForeground(Color.black);
        add(label5);

        JLabel label6 = new JLabel("XXXX-XXXX-XXXX-1127");
        label6.setBounds(380, 280, 400,30);
        label6.setFont(new Font("Arial", Font.PLAIN, 28));
        label6.setForeground(Color.black);
        add(label6);

        JLabel label7 = new JLabel("(Will appear on ATM Card, Cheque Book and Statement)");
        label7.setBounds(320, 300, 500,30);
        label7.setFont(new Font("Arial", Font.PLAIN, 18));
        label7.setForeground(Color.black);
        add(label7);

        //PASSWORD
        JLabel label8 = new JLabel("Password:");
        label8.setBounds(100, 380, 200,30);
        label8.setFont(new Font("Arial", Font.PLAIN, 28));
        label8.setForeground(Color.BLACK);
        add(label8);

        JLabel label10 = new JLabel("XXXX");
        label10.setBounds(380, 380, 500,30);
        label10.setFont(new Font("Arial", Font.PLAIN, 28));
        label10.setForeground(Color.black);
        add(label10);

         JLabel label11 = new JLabel("(4-digit Password)");
        label11.setBounds(100, 400, 350,30);
        label11.setFont(new Font("Arial", Font.PLAIN, 18));
        label11.setForeground(Color.black);
        add(label11);

        //SERVICES REQUIRED
         JLabel label12 = new JLabel("Services Required:");
        label12.setBounds(100, 450, 350,30);
        label12.setFont(new Font("Arial", Font.PLAIN, 28));
        label12.setForeground(Color.BLACK);
        add(label12);

        c1= new JCheckBox("ATM CARD");
        c1.setBackground(new ColorUIResource(180, 237, 164));
        c1.setBounds(380, 450, 150, 30);
        c1.setFont(new Font("Raleway", Font.BOLD, 20));
        add(c1);
  
        c2= new JCheckBox("Internet Banking");
        c2.setBackground(new ColorUIResource(180, 237, 164));
        c2.setBounds( 580, 450, 200, 30);
        c2.setFont(new Font("Raleway", Font.BOLD, 20));
        add(c2);

        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(new ColorUIResource(180, 237, 164));
        c3.setBounds(380, 490, 180, 30);
        c3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(c3);

        c4= new JCheckBox("EMAIL Alerts");
        c4.setBackground(new ColorUIResource(180, 237, 164));
        c4.setBounds( 580, 490, 200, 30);
        c4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(c4);
  
        c5= new JCheckBox("Cheque Book");
        c5.setBackground(new ColorUIResource(180, 237, 164));
        c5.setBounds(380, 530, 180, 30);
        c5.setFont(new Font("Raleway", Font.BOLD, 20));
        add(c5);

        c6= new JCheckBox("E-Statement");
        c6.setBackground(new ColorUIResource(180, 237, 164));
        c6.setBounds( 580, 530, 200, 30);
        c6.setFont(new Font("Raleway", Font.BOLD, 20));
        add(c6);

        //Declare
        c7= new JCheckBox("I hereby declare that the above mentioned details are accurate", true);
        c7.setBackground(new ColorUIResource(180, 237, 164));
        c7.setBounds( 100, 600, 800, 21);
        c7.setFont(new Font("Raleway", Font.BOLD, 18));
        add(c7);

        //next and cancel
        submit= new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.setBounds(100, 660, 110,30);
        submit.addActionListener(this);
        add(submit);

        cancel= new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        cancel.setBounds(580, 660, 110,30);
        submit.addActionListener(this);
        add(cancel);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 200); //get frame in desired place
        setVisible(true);
        getContentPane().setBackground(new ColorUIResource(180, 237, 164));

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String acctype= (String) acc.getSelectedItem();

        Random ran= new Random();
    long first7=(ran.nextLong()% 90000000L)+1127035000000000L;
    String cardno= ""+Math.abs(first7);

   
    long first3=(ran.nextLong()% 9000L)+1000L;
    String pin= ""+Math.abs(first3);

    String fac = "";
    if(c1.isSelected())
    {
        fac= fac+"ATM CARD";
    }else if(c2.isSelected())
    {
        fac= fac+"Internet Banking";
    }else if(c3.isSelected())
    {
        fac= fac+"Mobile Banking";
    }else if (c4.isSelected())
    {
        fac=fac+"EMAIL Alerts";
    }else if(c5.isSelected())
    {
        fac=fac+"Cheque Book";
    }else if (c6.isSelected())
    {
        fac=fac+"E-Statement";
    }
     try{

        if (e.getSource()==submit){
            if (acctype.equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");

              }else{
                  Con1 con = new Con1();
                  String q= " insert into signupthree values('"+acctype+"','"+cardno+"','"+pin+"', '"+fac+"')";
                  String q2= " insert into login values('"+cardno+"','"+pin+"')";
                  con.statement.executeUpdate(q); //excute update is used to insert values into the table
                  con.statement.executeUpdate(q2);
                  JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );

                  new deposit (pin);
              setVisible(false);
              }
            } else if (e.getSource()==cancel) {
                System.exit(0);
            }
          }catch (Exception E)
          {
              E.printStackTrace(); //for runtime error
          }


    }
    public static void main(String args[])
    {
        new signup3();
    }
    
}
