
// MiniStatement page
package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class MiniStatement extends JFrame implements ActionListener{
    
    JButton backButton,printButton;
    JTable dataTable;
    String pinNo;
    
    public MiniStatement(String pinNo) {
        this.pinNo = pinNo;
        
        setLayout(null);
        setSize(350,550);
        setLocation(500, 70);
        setTitle("Mini Statement");
        setVisible(true);
        getContentPane().setBackground(Color.white);
        
        JLabel bankLabel = new JLabel("Indusland Bank");
        bankLabel.setBounds(90, 15, 200, 25);
        bankLabel.setFont(new Font("Hind Siliguri",Font.BOLD,20));
        add(bankLabel);
        
        JLabel accName = new JLabel();
        accName.setBounds(10, 55, 200, 20);
        accName.setFont(new Font("Hind Siliguri",Font.BOLD,12));
        add(accName);
        
        JLabel cardNo = new JLabel();
        cardNo.setBounds(10, 80, 270, 20);
        cardNo.setFont(new Font("Hind Siliguri",Font.BOLD,12));
        add(cardNo);
        
        JLabel dateLabel = new JLabel("Date");
        dateLabel.setBounds(10,120, 60, 20);
        dateLabel.setFont(new Font("Hind Siliguri",Font.BOLD,14));
        add(dateLabel);
        
        JLabel trnsactionLabel = new JLabel("Transactions");
        trnsactionLabel.setBounds(130, 122, 90, 20);
        trnsactionLabel.setFont(new Font("Hind Siliguri",Font.BOLD,14));
        add(trnsactionLabel);
        
        JLabel amountLabel = new JLabel("Amount");
        amountLabel.setBounds(260, 120, 90, 20);
        amountLabel.setFont(new Font("Hind Siliguri",Font.BOLD,14));
        add(amountLabel);
        
        JLabel miniStatement = new JLabel();
        miniStatement.setFont(new Font("Hind Siliguri",Font.BOLD,12));
        miniStatement.setBounds(10, 130, 500, 300);
        add(miniStatement);
       
        dataTable = new JTable();
        dataTable.setBounds(10, 150, 500, 300);
        dataTable.setFont(new Font("Hind Siliguri",Font.PLAIN,13));
        dataTable.setRowHeight(25);       
        dataTable.setShowGrid(false);
        add(dataTable);
        
        backButton = new JButton("Back");
        backButton.setBounds(110, 470, 100,28);
        backButton.setBackground(Color.black);
        backButton.setForeground(Color.white);
        backButton.addActionListener(this);
        add(backButton);
        
        printButton = new JButton("Print");
        printButton.setBounds(220, 470, 100,28);
        printButton.setBackground(Color.orange);
        printButton.addActionListener(this);
        add(printButton);
        
        try {
            Conn co = new Conn();
            ResultSet rs = co.s.executeQuery("select * from login where pin = '"+ pinNo +"'");
            while (rs.next()) {
                accName.setText("Name : "+rs.getString("name"));
                cardNo.setText("Card Number : "+rs.getString("card_no").substring(0,4)+"XXXXXXXX"+rs.getString("card_no").substring(12)); 
                
            }
                   
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Conn co = new Conn();
            ResultSet rs = co.s.executeQuery("select * from bank where pin='"+ pinNo +"'");
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel)dataTable.getModel();
            int cols = rsmd.getColumnCount();
            String colNames[] = new String[cols];
            for(int i=1;i<cols;i++){
                colNames[i] = rsmd.getCatalogName(i);
                
            }
            model.setColumnIdentifiers(colNames);
                
            String date, transaction, amount;
            ;
            int i=0;
            while(rs.next()){
                date = rs.getString(2).substring(0,16);
                transaction = rs.getString(3);
                amount = "" +rs.getInt(4);
                String rowData[] = {date,transaction,amount};
                model.addRow(rowData);
                
                if(i==9){
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== backButton){
            setVisible(false);
            new Banking(pinNo).setVisible(true);
        }else if(e.getSource() == printButton){
            setVisible(false);
            new Banking(pinNo).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new MiniStatement("");
    }

    
}
