
// Withdraw money page
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;
public class Withdraw extends JFrame implements ActionListener{
    JTextField withdrawAmountField;
    JButton withdrawButton, backButton;
    String pinNo;

    public Withdraw(String pinNo) {
        this.pinNo = pinNo;
        setLayout(null);
        setSize(700,700);
        setLocation(350, 20);
        setTitle("Withdraw Money");
        setVisible(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);
        
        JLabel depositJLabel = new JLabel("Enter Amount To Withdraw");
        depositJLabel.setBounds(165, 235,250,25);
        depositJLabel.setFont(new Font("Roboto Slab",Font.BOLD,16));
        depositJLabel.setForeground(Color.white);
        image.add(depositJLabel);
        
        withdrawAmountField = new JTextField();
        withdrawAmountField.setBounds(175, 290,170,25);
        withdrawAmountField.setFont(new Font("Roboto Slab",Font.BOLD,16));
        image.add(withdrawAmountField);
        
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(290,360,100,28);
        withdrawButton.addActionListener(this);
        image.add(withdrawButton);
        
        backButton = new JButton("Back");
        backButton.setBounds(290,395,100,28);
        backButton.addActionListener(this);
        image.add(backButton);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == withdrawButton){
            int amount =  Integer.parseInt(withdrawAmountField.getText());
            Date date = new Date();
            if(amount <= 0){
                JOptionPane.showMessageDialog(null, "Please enter an amount");
            }else{
                try {
                    Conn co = new Conn();
                    ResultSet rs = co.s.executeQuery("select*from bank where pin = '"+ pinNo +"'");
                    int balance = 0;

                while (rs.next()) {
                    if(rs.getString("transaction_type").equals("Deposit")){
                        balance += rs.getInt("amount");
                    }else{
                        balance -= rs.getInt("amount");
                    }
                    
                }
                if(e.getSource() != backButton && balance < amount){
                    JOptionPane.showMessageDialog(null, "Insufficient balance");
                    return;
                }
                    
                    String query = "insert into bank values('"+ pinNo +"','"+ date +"','Withdrawl','"+ amount +"')";
                    co.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+amount+" withdrawl successfully.");
                    setVisible(false);
                    new Banking(pinNo).setVisible(true);
                 
                } catch (Exception x) {
                    System.out.println(x);
                }
                
            }
            
        }else if(e.getSource() == backButton){
            setVisible(false);
            new Banking(pinNo).setVisible(true);
        }
    }
    
    
    public static void main(String[] args) {
        new Deposit("");
    }
    
}

