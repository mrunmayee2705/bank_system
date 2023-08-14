package banking.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class signup2 extends JFrame implements ActionListener {

JComboBox comboBox;
JComboBox comboBox2;
JComboBox comboBox3;
JTextField education;
JComboBox comboBox4;
JTextField panno;
JTextField adno;
JRadioButton r1;
JRadioButton r2;
JButton next;


String formno;

    signup2(String formno)
    {
        
        super("Application form");

        this.formno=formno;

        //IMAGE
        ImageIcon iiii1= new ImageIcon(ClassLoader.getSystemResource("icon/banklogo.png"));
        Image iiii2= iiii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iiii3= new ImageIcon(iiii2);
        JLabel iimage=new JLabel(iiii3);
        iimage.setBounds(25,10,100,100);
        add(iimage);

        JLabel label1= new JLabel(formno);
        label1.setBounds(600, 20, 200, 40);
        label1.setFont(new Font("Raleway", Font.PLAIN, 38));
        add(label1);

        //FORM
        JLabel label2 = new JLabel("APPLICATION FORM:");
        label2.setBounds(220,20,600,40);
        label2.setFont(new Font("Raleway", Font.BOLD, 38));
        label2.setForeground(new ColorUIResource(122,2,80));
        add(label2);

        //SUB HEADING
        JLabel label3 = new JLabel("ADDITIONAL DETAILS");
        label3.setBounds(220, 80, 600, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 38));
        label3.setForeground(Color.BLACK);
        add(label3);

        //RELIGION
        JLabel label4 = new JLabel("Religion:");
        label4.setBounds(100, 190, 150,30);
        label4.setFont(new Font("Arial", Font.PLAIN, 28));
        label4.setForeground(Color.BLACK);
        add(label4);

        String religion[]= {"Hindu", "Muslim", "Christian", "Sikh", "other"};
        comboBox= new JComboBox(religion);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBackground(Color.WHITE);
        comboBox.setBounds(300, 190, 320, 30);
        add(comboBox);

        //CATEGORY
       JLabel label5= new JLabel("Category:");
       label5.setBounds(100, 250, 200,30);
       label5.setFont(new Font("Raleway", Font.PLAIN, 28));
       label5.setForeground(Color.BLACK);
       add(label5);

       String category[]={"Open", "SC", "ST", "VJNT", "OBC","Other"};
       comboBox2= new JComboBox(category);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setBounds(300, 250, 320, 30);
        add(comboBox2);

        //INCOME
        JLabel label6= new JLabel("Income:");
       label6.setBounds(100, 320, 200,30);
       label6.setFont(new Font("Raleway", Font.PLAIN, 28));
       label6.setForeground(Color.BLACK);
       add(label6);

       String income[]={"Null", "<1,50,000", "<2,50,000", "<5,00,000", "more than 10,00,000"};
       comboBox3= new JComboBox(income);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setBounds(300, 320, 320, 30);
        add(comboBox3);

        //EDUCATION
         JLabel label7= new JLabel("Education:");
       label7.setBounds(100, 380, 200,30);
       label7.setFont(new Font("Raleway", Font.PLAIN, 28));
       label7.setForeground(Color.BLACK);
       add(label7);

       education= new JTextField();
        education.setFont(new Font("Raleway", Font.BOLD, 14));
        education.setBackground(Color.WHITE);
       education.setBounds(300, 380, 320, 30);
        add(education);

        //OCCUPATION
        JLabel label8= new JLabel("Occupation:");
       label8.setBounds(100, 450, 200,30);
       label8.setFont(new Font("Raleway", Font.PLAIN, 28));
       label8.setForeground(Color.BLACK);
       add(label8);

       String occupation[]={"Salaried", "Self-Employed", "Student", "Retired", "Other"};
       comboBox4= new JComboBox(occupation);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setBounds(300, 450, 320, 30);
        add(comboBox4);

        //PAN
         JLabel label9= new JLabel("PAN Number:");
       label9.setBounds(100, 520, 200,30);
       label9.setFont(new Font("Raleway", Font.PLAIN, 28));
       label9.setForeground(Color.BLACK);
       add(label9);

       panno= new JTextField();
        panno.setFont(new Font("Raleway", Font.BOLD, 14));
        panno.setBackground(Color.WHITE);
       panno.setBounds(300, 520, 320, 30);
        add(panno);

        //ADHAAR
         JLabel label10= new JLabel("ADHAAR No:");
       label10.setBounds(100, 570, 250,30);
       label10.setFont(new Font("Raleway", Font.PLAIN, 28));
       label10.setForeground(Color.BLACK);
       add(label10);

       adno= new JTextField();
        adno.setFont(new Font("Raleway", Font.BOLD, 14));
        adno.setBackground(Color.WHITE);
       adno.setBounds(300, 570, 320, 30);
        add(adno);

        //Senior Citizen
        JLabel label11= new JLabel("Senior Citizen:");
       label11.setBounds(100, 640, 250,30);
       label11.setFont(new Font("Raleway", Font.PLAIN, 28));
       label11.setForeground(Color.BLACK);
       add(label11);

       r1= new JRadioButton("yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 20));
        r1.setBounds(300, 640, 90,30);
        r1.setBackground(new ColorUIResource(180, 230, 240));
        add(r1);
        r2= new JRadioButton("no"); 
        r2.setFont(new Font("Raleway", Font.BOLD, 20));
        r2.setBounds(450, 640, 60,30);
        r2.setBackground(new ColorUIResource(180, 230, 240));
        add(r2);
//group button only one button can get selected
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        //next
        next= new JButton("next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620, 660, 110,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850, 750);
        setLocation(450, 200); //get frame in desired place
        setVisible(true);
        getContentPane().setBackground(new ColorUIResource(180, 230, 240));
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

      String rel= (String) comboBox.getSelectedItem();
      String cat= (String) comboBox2.getSelectedItem();
      String income= (String) comboBox3.getSelectedItem();
      String edu= education.getText();
      String occup= (String) comboBox4.getSelectedItem();
      String pan= panno.getText();
      String adhaar= adno.getText();
      String citizen= null;
            if(r1.isSelected())
            {
                citizen= "yes";
            }
            else if(r2.isSelected())
            {
                citizen= "no";
            }
            try{

              if(panno.getText().equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Details Missing");

              }else{
                  Con1 con = new Con1();
                  String q= " insert into signuptwo values('"+rel+"','"+cat+"','"+income+"', '"+edu+"','"+occup+"', '"+pan+"', '"+adhaar+"',  '"+citizen+"')";
                  con.statement.executeUpdate(q); //excute update is used to insert values into the table
              new signup3();
              setVisible(false);
              }

          }catch (Exception E)
          {
              E.printStackTrace(); //for runtime error
          }


    }

    public static void main(String args[])
    {
        new signup2("");
    }
    
}
