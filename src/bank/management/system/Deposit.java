
// Deposite money page
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Deposit extends JFrame implements ActionListener{
    JTextField depositeAmountField;
    JButton depositButton, backButton;
    String pinNo;

    public Deposit(String pinNo) {
        this.pinNo = pinNo;
        setLayout(null);
        setSize(700,700);
        setLocation(350, 20);
        setTitle("Deposit Money");
        setVisible(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);
        
        JLabel depositJLabel = new JLabel("Enter Amount To Deposit");
        depositJLabel.setBounds(165, 235,250,25);
        depositJLabel.setFont(new Font("Roboto Slab",Font.BOLD,16));
        depositJLabel.setForeground(Color.white);
        image.add(depositJLabel);
        
        depositeAmountField = new JTextField();
        depositeAmountField.setBounds(175, 290,170,25);
        depositeAmountField.setFont(new Font("Roboto Slab",Font.BOLD,16));
        image.add(depositeAmountField);
        
        depositButton = new JButton("Deposit");
        depositButton.setBounds(290,360,100,28);
        depositButton.addActionListener(this);
        image.add(depositButton);
        
        backButton = new JButton("Back");
        backButton.setBounds(290,395,100,28);
        backButton.addActionListener(this);
        image.add(backButton);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == depositButton){
            int amount =  Integer.parseInt(depositeAmountField.getText());
            Date date = new Date();
            if(amount <= 0){
                JOptionPane.showMessageDialog(null, "Please enter an amount");
            }else{
                try {
                    Conn co = new Conn();
                    String query = "insert into bank values('"+ pinNo +"','"+ date +"','Deposit','"+ amount +"')";
                    co.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+amount+" deposited successfully.");
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
