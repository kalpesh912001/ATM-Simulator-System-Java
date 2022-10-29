
// CheckBalance page
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class CheckBalance extends JFrame implements ActionListener{
    JButton backButton;
    String pinNo;

    public CheckBalance(String pinNo){
        this.pinNo = pinNo;
        setLayout(null);
        setSize(700,700);
        setLocation(350, 20);
        setTitle("Check Balance");
        setVisible(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);
        
        int balance = 0;
        try {
                Conn co = new Conn();
                ResultSet rs = co.s.executeQuery("select*from bank where pin = '"+ pinNo +"'");
                
                while (rs.next()) {
                    if(rs.getString("transaction_type").equals("Deposit")){
                    balance += rs.getInt("amount");
                    }else{
                        balance -= rs.getInt("amount");
                    }
                    
                }
        }catch(Exception x){
            System.out.println(x);
            
        }
        JLabel fastCashLabel = new JLabel("Your account balance is: Rs "+ balance);
        fastCashLabel.setBounds(135, 260,280,40);
        fastCashLabel.setFont(new Font("Roboto Slab",Font.BOLD,14));
        fastCashLabel.setForeground(Color.white);
        image.add(fastCashLabel);
        
        backButton = new JButton("Back");
        backButton.setBounds(265,380,130,30);   
        backButton.addActionListener(this);
        image.add(backButton);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            setVisible(false);
            new Banking(pinNo);
        }
    }

    public static void main(String[] args) {
         new CheckBalance("");
         
    }
    
}
