package banking.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.ColorUIResource; 
import com.toedter.calendar.JDateChooser;



public class signup extends JFrame implements ActionListener

{
    JTextField textName;
    JTextField textDad;
    JDateChooser dateChooser; //add jar file in reference then import jdatechooser
    JRadioButton r1;
    JRadioButton r2;
    JTextField textMail;
    JTextField textAdd;
    JRadioButton r3;
    JRadioButton r4;
    JButton next;

//to get the random form numbers
    Random ran= new Random();
    long first3=(ran.nextLong()% 900L)+100L;

    String first= " "+Math.abs(first3); //application form+number
    signup()
    {   
        
        super("Application form");
        

        ImageIcon iii1= new ImageIcon(ClassLoader.getSystemResource("icon/banklogo.png"));
        Image iii2= iii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iii3= new ImageIcon(iii2);
        JLabel iimage=new JLabel(iii3);
        iimage.setBounds(25,10,100,100);
        add(iimage);
//application
        JLabel label1 = new JLabel("APPLICATION FORM:"+first);
        label1.setBounds(220,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        label1.setForeground(new ColorUIResource(122,2,80));
        add(label1);
//page no
        JLabel label2= new JLabel("PAGE 1");
        label2.setBounds(750, 710, 200, 30);
        label2.setFont(new Font("Raleway", Font.PLAIN, 20));
        label2.setForeground(Color.BLACK);
        add(label2);
//personal info
        JLabel label3 = new JLabel("PERSONAL INFORMATION");
        label3.setBounds(220, 80, 600, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 38));
        label3.setForeground(Color.BLACK);
        add(label3);
//Name
        JLabel labelName = new JLabel("Name:");
        labelName.setBounds(100, 190, 100,30);
        labelName.setFont(new Font("Arial", Font.PLAIN, 28));
        labelName.setForeground(Color.BLACK);
        add(labelName);

        textName= new JTextField();
        textName.setBounds(300, 190, 400,30);
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textName);

//Dad
        JLabel labelDad = new JLabel("Father's Name:");
        labelDad.setBounds(100, 260, 200,30);
        labelDad.setFont(new Font("Arial", Font.PLAIN, 28));
        labelDad.setForeground(Color.BLACK);
        add(labelDad);

        textDad= new JTextField();
        textDad.setBounds(300, 260, 400,30);
        textDad.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textDad);

//DOB
        JLabel labelDob = new JLabel("Date of Birth:");
        labelDob.setBounds(100, 340, 200,30);
        labelDob.setFont(new Font("Arial", Font.PLAIN, 28));
        labelDob.setForeground(Color.BLACK);
        add(labelDob);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(Color.GRAY);
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);
//Gender

        JLabel labelG= new JLabel("Gender:");
        labelG.setFont(new Font("Arial", Font.PLAIN, 28));
        labelG.setBounds(100, 420, 200,30);
        labelG.setForeground(Color.BLACK);
        add(labelG);

        r1= new JRadioButton("Female");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300, 420, 90,30);
        r1.setBackground(new ColorUIResource(240,223,201));
        add(r1);
        r2= new JRadioButton("Male"); 
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 420, 60,30);
        r2.setBackground(new ColorUIResource(240,223,201));
        add(r2);
//group button only one button can get selected
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

//email
        JLabel labelmail = new JLabel("E-mail ID:");
        labelmail.setBounds(100, 490, 200,30);
        labelmail.setFont(new Font("Arial", Font.PLAIN, 28));
        labelmail.setForeground(Color.BLACK);
        add(labelmail);

        textMail= new JTextField();
        textMail.setBounds(300, 490, 400,30);
        textMail.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textMail);

//address
        
        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setBounds(100, 560, 200,30);
        labelAdd.setFont(new Font("Arial", Font.PLAIN, 28));
        labelAdd.setForeground(Color.BLACK);
        add(labelAdd);

        textAdd= new JTextField();
        textAdd.setBounds(300, 560, 400,30);
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textAdd);

//Martial Status
        JLabel labelM = new JLabel("Martial status:");
        labelM.setBounds(100, 620, 200,30);
        labelM.setFont(new Font("Arial", Font.PLAIN, 28));
        labelM.setForeground(Color.BLACK);
        add(labelM);

        r3= new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(450, 620, 90,30);
        r3.setBackground(new ColorUIResource(240,223,201));
        add(r3);

        r4= new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBounds(300, 620, 110,30);
        r4.setBackground(new ColorUIResource(240,223,201));
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

//next button 
        next= new JButton("next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620, 660, 110,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new ColorUIResource(240,223,201));
        setLayout(null);
        setSize(850, 750);
        setLocation(450, 200);
        setVisible(true);
    }
    @Override
        public void actionPerformed (ActionEvent e)
        {
            String formno= first;
            String name= textName.getText();
            String fname=textDad.getText();
            String dob= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender= null;
            if(r1.isSelected())
            {
                gender= "male";
            }
            else if(r2.isSelected())
            {
                gender= "female";
            }
            String mail= textMail.getText();
             String add= textAdd.getText();
              String marry= null;
            if(r3.isSelected())
            {
                marry= "married";
            }
            else if(r4.isSelected())
            {
                marry= "unmarried";
            }

            try{

                if(textName.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Details Missing");

                }else{
                    Con1 con = new Con1();
                    String q= " insert into signup values('"+formno+"','"+name+"','"+fname+"', '"+dob+"','"+gender+"', '"+mail+"', '"+add+"',  '"+marry+"')";
                    con.statement.executeUpdate(q); //excute update is used to insert values into the table
                new signup2(formno);
                setVisible(false);
                }

            }catch (Exception E)
            {
                E.printStackTrace(); //for runtime error
            }

        }
    public static void main (String args[])
    {
        new signup();
    }
    
}
