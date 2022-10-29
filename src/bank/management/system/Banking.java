
// Banking page
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Banking extends JFrame implements ActionListener{
    JButton depositbButton,withdrawbButton,fastCashbButton,miniStatement,checkBalance,exitButton;
    String pinNo;
    
    Banking(String pinNo){
        this.pinNo = pinNo;
        setLayout(null);
        setSize(700,700);
        setLocation(350, 20);
        setTitle("Banking");
        setVisible(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);
        
        JLabel transactionJLabel = new JLabel("Select Your Transaction");
        transactionJLabel.setBounds(165, 235,250,25);
        transactionJLabel.setFont(new Font("Roboto Slab",Font.BOLD,16));
        transactionJLabel.setForeground(Color.white);
        image.add(transactionJLabel);
        
        depositbButton = new JButton("Deposit");
        depositbButton.setBounds(125,300,130,30);
        depositbButton.addActionListener(this);
        image.add(depositbButton);
        
        withdrawbButton = new JButton("Cash Withdraw");
        withdrawbButton.setBounds(265,300,130,30);
        withdrawbButton.addActionListener(this);
        image.add(withdrawbButton);
        
        fastCashbButton = new JButton("Fast Cash");
        fastCashbButton.setBounds(125,340,130,30);
        fastCashbButton.addActionListener(this);
        image.add(fastCashbButton);
        
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(265,340,130,30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
        checkBalance = new JButton("Check Balance");
        checkBalance.setBounds(125,380,130,30);
        checkBalance.addActionListener(this);
        image.add(checkBalance);
        
        exitButton = new JButton("Exit");
        exitButton.setBounds(265,380,130,30);
        exitButton.addActionListener(this);
        image.add(exitButton);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
            System.exit(0);
            
        }else if(e.getSource() == depositbButton){
            setVisible(false);
            new Deposit(pinNo).setVisible(true);
        }else if(e.getSource() == withdrawbButton){
            setVisible(false);
            new Withdraw(pinNo).setVisible(true);
        }else if(e.getSource() == fastCashbButton){
            setVisible(false);
            new FastCash(pinNo);
        }else if(e.getSource() == checkBalance){
            setVisible(false);
            new CheckBalance(pinNo).setVisible(true);
        }else if(e.getSource() == miniStatement){
            setVisible(false);
            new MiniStatement(pinNo).setVisible(true);
        }
     
    }
    
    public static void main(String[] args) {
        new Banking("");
    }

    
}
