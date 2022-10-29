
// SignUpThree page
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JPasswordField userPin;
    JButton submitButton, cancelButton;
    String fontVal = "Fuzzy Bubbles";
    String formNo,userName;
    

    public SignUpThree(String formNo, String userName) {
        this.formNo = formNo;
        this.userName = userName;
        setLayout(null);
        setTitle("Application Form");
        getContentPane().setBackground(Color.white);
        setSize(700,700);
        setLocation(350, 20);
        setVisible(true);
        
        JLabel pageTile = new JLabel("Page 3 : Account Details");
        pageTile.setBounds(230, 20, 300, 35);
        pageTile.setFont(new Font("Roboto Slab",Font.BOLD,22));
        add(pageTile);
        
        JLabel accountType = new JLabel("Account Type");
        accountType.setBounds(120, 80, 200, 35);
        accountType.setFont(new Font("Roboto Slab",Font.BOLD,18));
        add(accountType);
        
        r1 = new JRadioButton("Savings account");
        r1.setBounds(120, 120, 150, 25);
        r1.setFont(new Font("Roboto Slab",Font.BOLD,14));
        r1.setBackground(Color.white);
        add(r1);
        
        r2 = new JRadioButton("Current account");
        r2.setBounds(120, 150, 150, 25);
        r2.setFont(new Font("Roboto Slab",Font.BOLD,14));
        r2.setBackground(Color.white);
        add(r2);
        
        r3 = new JRadioButton("Fixed Deposite account");
        r3.setBounds(300, 120, 250, 25);
        r3.setFont(new Font("Roboto Slab",Font.BOLD,14));
        r3.setBackground(Color.white);
        add(r3);
        
        
        r4 = new JRadioButton("Reccuring Deposite account");
        r4.setBounds(300, 150, 250, 25);
        r4.setFont(new Font("Roboto Slab",Font.BOLD,14));
        r4.setBackground(Color.white);
        add(r4);
        
        ButtonGroup accButtonGroup = new ButtonGroup();
        accButtonGroup.add(r1);
        accButtonGroup.add(r2);
        accButtonGroup.add(r3);
        accButtonGroup.add(r4);
   
        JLabel cardNo = new JLabel("Card Number");
        cardNo.setBounds(120, 200, 200, 35);
        cardNo.setFont(new Font("Roboto Slab",Font.BOLD,18));
        add(cardNo);
        
        JLabel cardNote = new JLabel("Your 16 digit card number");
        cardNote.setBounds(120, 230, 200, 20);
        cardNote.setFont(new Font("Roboto Slab",Font.BOLD,12));
        add(cardNote);
        
        JLabel demoCardNo = new JLabel("XXXX-XXXX-XXXX-3410");
        demoCardNo.setBounds(300, 200, 300, 35);
        demoCardNo.setFont(new Font("Roboto Slab",Font.BOLD,18));
        add(demoCardNo);
        
        JLabel pinLabel = new JLabel("Pin Number");
        pinLabel.setBounds(120, 280, 200, 35);
        pinLabel.setFont(new Font("Roboto Slab",Font.BOLD,18));
        add(pinLabel);
        
        userPin = new JPasswordField();
        userPin.setBounds(300, 280, 240, 35);
        userPin.setFont(new Font("Roboto Slab",Font.BOLD,18));
        add(userPin);
        
        JLabel pinNote = new JLabel("create your 4 digit pin");
        pinNote.setBounds(120, 310, 200, 20);
        pinNote.setFont(new Font("Roboto Slab",Font.BOLD,12));
        add(pinNote);
        
       
        JLabel serviceLabel = new JLabel("Services Required");
        serviceLabel.setBounds(120, 360, 200, 35);
        serviceLabel.setFont(new Font("Roboto Slab",Font.BOLD,18));
        add(serviceLabel);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBounds(120, 400, 200, 25);
        c1.setFont(new Font("Roboto Slab",Font.BOLD,14));
        c1.setBackground(Color.white);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(320, 400, 200, 25);
        c2.setFont(new Font("Roboto Slab",Font.BOLD,14));
        c2.setBackground(Color.white);
        add(c2);
     
        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(120, 440, 200, 25);
        c3.setFont(new Font("Roboto Slab",Font.BOLD,14));
        c3.setBackground(Color.white);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBounds(320, 440, 200, 25);
        c4.setFont(new Font("Roboto Slab",Font.BOLD,14));
        c4.setBackground(Color.white);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(120, 480, 200, 25);
        c5.setFont(new Font("Roboto Slab",Font.BOLD,14));
        c5.setBackground(Color.white);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBounds(320, 480, 200, 25);
        c6.setFont(new Font("Roboto Slab",Font.BOLD,14));
        c6.setBackground(Color.white);
        add(c6);
        
        c7 = new JCheckBox("I hearby declares that the above entered details are correct to the best of my knowledge.");
        c7.setBounds(120, 540, 520, 25);
        c7.setFont(new Font("Roboto Slab",Font.BOLD,11));
        c7.setBackground(Color.white);
        add(c7);
        
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(420, 600,100,30);
        cancelButton.setFont(new Font("Roboto Slab", Font.BOLD, 14));
        cancelButton.setBackground(Color.black);
        cancelButton.setForeground(Color.white);
        cancelButton.addActionListener(this);
        add(cancelButton);
        
        submitButton = new JButton("Submit");
        submitButton.setBounds(540, 600, 100, 30);
        submitButton.setFont(new Font("Roboto Slab", Font.BOLD, 14));
        submitButton.setBackground(Color.orange);
        submitButton.setForeground(Color.black);
        submitButton.addActionListener(this);
        add(submitButton);
       
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String getFormNo = (String)formNo;
            String accType = "";
            if(r1.isSelected()){
                accType = "Savings Account";
            }else if(r2.isSelected()){
                accType = "Current Account";
            }else if(r3.isSelected()){
                accType = "Fixed Deposite Account";
            }else if(r4.isSelected()){
                accType = "Reccuring Deposite Account";
            }
            
            Random random = new Random();
            String cardNo = "" + Math.abs((random.nextLong() % 90000000L)) + 82903041L;
           
            String password = userPin.getText();
            
            String facility = "";
            if(c1.isShowing()){
                facility = facility + "ATM Card";
            }else if(c2.isSelected()){
                facility = facility + "Internet Banking";
            }else if(c3.isSelected()){
                facility = facility + "Mobile Banking";
            }else if(c4.isSelected()){
                facility = facility + "E-mail & SMS Alert";
            }else if(c5.isSelected()){
                facility = facility + "Cheque Book";
            }else if(c6.isSelected()){
                facility = facility + "E-statement";
            }
            
            boolean acceptCheckBox = false;
            if(c7.isSelected()){
                acceptCheckBox = true;
            }
            
            try {
                if(accType.equals("")){
                    JOptionPane.showMessageDialog(null, "Please select Account type");
                }else if(password.equals("") || password.length() != 4){
                    JOptionPane.showMessageDialog(null, "Please enter the correct password");
                }else if(acceptCheckBox == false){
                    JOptionPane.showMessageDialog(null, "Please check your declaration");
                }else{
                    Conn co = new Conn();
                    String query1 = "insert into signUpThree values('" + getFormNo + "' ,'" + accType + "' ,'" + cardNo + "' ,'" + password + "' ,'" + facility + "')";
                    String query2 = "insert into login values('" + getFormNo + "' ,'" + userName + "' ,'" + cardNo + "' ,'" + password + "')";
                    co.s.executeUpdate(query1);
                    co.s.executeUpdate(query2);
                    
                    
                    JOptionPane.showMessageDialog(null, "Hello, "+ userName +" your account created successfully.\nCard No: "+cardNo);
                    setVisible(false);
                    new Login();
                  
                }
            } catch (Exception o) {
                System.out.println(o);
            }
            
        }else if(e.getSource() == cancelButton){
            setVisible(false);
            Login login1 = new Login();
            login1.setVisible(true);
        }
       
    }
  
    public static void main(String[] args) {
        new SignUpThree("","");
    }
    
}
