// Login page
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JTextField cardNoInput;
    JPasswordField pinNoInput;
    JButton signIN, reset, newUserSignUp;
 
    Login(){
        // header
        setTitle("Indusland Bank ATM");
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image im1 = ic1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon ic2 = new ImageIcon(im1);
        JLabel label = new JLabel(ic2);
        add(label);
        setSize(700,500);
        setVisible(true);
        setLocation(350,100);
        label.setBounds(70, 10, 70, 70);
        
        JLabel headTxt = new JLabel("Welcome To Indusland Bank");
        headTxt.setBounds(150, 35, 430, 25);
        headTxt.setFont(new Font("Roboto Slab",Font.BOLD,30));
        add(headTxt);
        
        JLabel CardTxt = new JLabel("Card No");
        CardTxt.setBounds(120, 130, 150, 20);
        CardTxt.setFont(new Font("Hind Siliguri",Font.BOLD,25));
        add(CardTxt);
        JLabel PinTxt = new JLabel("Pin");
        PinTxt.setBounds(120, 200, 200, 20);
        PinTxt.setFont(new Font("Hind Siliguri",Font.BOLD,25));
        add(PinTxt);
      
        cardNoInput = new JTextField();
        cardNoInput.setBounds(250,130,250,25);
        cardNoInput.setFocusable(true);
        cardNoInput.setBorder(BorderFactory.createLineBorder(Color.orange));
        cardNoInput.setFont(new Font("Hind Siliguri",Font.BOLD,16));
        add(cardNoInput);
       
        pinNoInput = new JPasswordField();
        pinNoInput.setBounds(250,200,250,25);
        pinNoInput.setBorder(BorderFactory.createLineBorder(Color.orange));
        pinNoInput.setFont(new Font("Hind Siliguri",Font.BOLD,16));
        add(pinNoInput);
        
        signIN = new JButton("SIGN IN");
        signIN.setBounds(250, 270, 110, 25);
        signIN.setBackground(Color.black);
        signIN.setForeground(Color.white);
        signIN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signIN.addActionListener(this);
        add(signIN);
        
        reset = new JButton("RESET");
        reset.setBounds(390, 270, 110, 25);
        reset.setBackground(Color.black);
        reset.setForeground(Color.white);
        reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        reset.addActionListener(this);
        add(reset);
        
        newUserSignUp = new JButton("New User? Sign Up");
        newUserSignUp.setBounds(250,320,250,25);
        newUserSignUp.setBackground(Color.orange);
        newUserSignUp.setForeground(Color.black);
        newUserSignUp.setFont(new Font("Hind Siliguri",Font.BOLD,15));
        newUserSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        newUserSignUp.addActionListener(this);
        add(newUserSignUp);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == reset){
            cardNoInput.setText("");
            pinNoInput.setText("");
            
        }else if(ae.getSource() == signIN){
            Conn co = new Conn();
            String cardNo = cardNoInput.getText();
            String pinNo = pinNoInput.getText();
            
            String query = "select*from login where card_no='"+ cardNo +"' and pin='"+ pinNo +"' ";
            try {
                ResultSet rs = co.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Banking(pinNo).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect card number or pin");
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        
        }else if(ae.getSource() == newUserSignUp){
        
            setVisible(false);
            // creating object of Login
            SignUpOne signUp1 = new SignUpOne();
            signUp1.setVisible(true);
            
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
}
