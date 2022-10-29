
// FastCash page
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    JButton backButton,rs100,rs500,rs1000,rs5000;
    String pinNo;

    public FastCash(String pinNo){
        this.pinNo = pinNo;
        setLayout(null);
        setSize(700,700);
        setLocation(350, 20);
        setTitle("Fast Cash");
        setVisible(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);
        
        JLabel fastCashLabel = new JLabel("Enter Amount To Withdraw");
        fastCashLabel.setBounds(165, 235,250,25);
        fastCashLabel.setFont(new Font("Roboto Slab",Font.BOLD,16));
        fastCashLabel.setForeground(Color.white);
        image.add(fastCashLabel);
        
        rs100 = new JButton("Rs 100");
        rs100.setBounds(125,300,130,30);
        rs100.addActionListener(this);
        image.add(rs100);
        
        rs500 = new JButton("Rs 500");
        rs500.setBounds(265,300,130,30);
        rs500.addActionListener(this);
        image.add(rs500);
        
        rs1000 = new JButton("Rs 1000");
        rs1000.setBounds(125,340,130,30);
        rs1000.addActionListener(this);
        image.add(rs1000);
        
        rs5000 = new JButton("Rs 5000");
        rs5000.setBounds(265,340,130,30);
        rs5000.addActionListener(this);
        image.add(rs5000);
 
        
        backButton = new JButton("Back");
        backButton.setBounds(265,380,130,30);   
        backButton.addActionListener(this);
        image.add(backButton);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            setVisible(false);
            new Banking(pinNo).setVisible(true);       
        }else{
            int amount = Integer.parseInt(((JButton)e.getSource()).getText().substring(3));
            try {
                Conn co = new Conn();
                ResultSet rs = co.s.executeQuery("select*from bank where pin = '"+ pinNo +"'");
                int balance = 0;
                while (rs.next()) {
                    if(rs.getString("transaction_type").equals("Deposit")){
                    balance += rs.getInt("amount");
                        System.out.println(balance);
                    }else{
                        balance -= rs.getInt("amount");
                        System.out.println(balance);
                    }
                    
                }
                if(e.getSource() != backButton && balance < amount){
                    JOptionPane.showMessageDialog(null, "Insufficient balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinNo+"','"+date+"','withdrawl','"+amount+"')";
                co.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" withdraw successfully");
                
                setVisible(false);
                new Banking(pinNo).setVisible(true);
                
            } catch (Exception x) {
                System.out.println(x);
            }
        }
    }
    
    
    public static void main(String[] args) {
        new FastCash("");
        
    }
}
