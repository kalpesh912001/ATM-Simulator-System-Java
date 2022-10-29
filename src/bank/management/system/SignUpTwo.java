
// SignUpTwo page
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class SignUpTwo extends JFrame implements ActionListener{
    JComboBox religionComboBox, categoryComboBox,incomeComboBox,qualificationComboBox, occupationComboBox;
    JTextField panNoTextField, adhaarTextField;
    JRadioButton yes1,yes2, no1, no2;
    JButton nextButton;
    String formNo;
    String userName;
    public SignUpTwo(String formNo, String userName) {
        this.formNo = formNo;
        this.userName = userName;
        setLayout(null);
        setTitle("Application Form");
        getContentPane().setBackground(Color.white);
        setSize(700,700);
        setLocation(350, 20);
        setVisible(true);
        
        JLabel pageTile = new JLabel("Page 2 : Additional Details");
        pageTile.setBounds(230, 20, 300, 35);
        pageTile.setFont(new Font("Roboto Slab",Font.BOLD,22));
        add(pageTile);
        
         //form attributes
        JLabel religion = new JLabel("Religion:");
        religion.setBounds(130,80,200,25);
        religion.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(religion);
        
        JLabel category = new JLabel("Category:");
        category.setBounds(130,125,200,25);
        category.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(category);
        
        JLabel income = new JLabel("Income:");
        income.setBounds(130,170,200,25);
        income.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(income);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setBounds(130,215,200,25);
        qualification.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(qualification);
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setBounds(130,260,200,25);
        occupation.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(occupation);
        
        JLabel panNo = new JLabel("Pan No:");
        panNo.setBounds(130,305,200,25);
        panNo.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(panNo);
        
        JLabel adhaar = new JLabel("Adhaar No:");
        adhaar.setBounds(130,350,200,25);
        adhaar.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(adhaar);
        
        JLabel SrCitizen = new JLabel("Sr. Citezen:");
        SrCitizen.setBounds(130,395,200,25);
        SrCitizen.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(SrCitizen);
        
        JLabel ExistingAcc = new JLabel("Existing Account:");
        ExistingAcc.setBounds(130,440,200,25);
        ExistingAcc.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(ExistingAcc);
        
        // input fields
        String religionVal[] = {"Hindu", "Muslim","Cristian", "Jain", "Other"};
        religionComboBox = new JComboBox(religionVal);
        religionComboBox.setBounds(330,80,280,28);
        religionComboBox.setFont(new Font("Roboto Slab",Font.BOLD,14));
        religionComboBox.setBackground(Color.white);
        add(religionComboBox);
        
        String categoryVal[] = {"ST", "OBC","SBC", "MINOR", "Other"};
        categoryComboBox = new JComboBox(categoryVal);
        categoryComboBox.setBounds(330,125,280,28);
        categoryComboBox.setFont(new Font("Roboto Slab",Font.BOLD,14));
        categoryComboBox.setBackground(Color.white);
        add(categoryComboBox);
        
        String incomeVal[] = {"10,00000 - 5,00000", "5,00000 - 1,00000","< 1,00000"};
        incomeComboBox = new JComboBox(incomeVal);
        incomeComboBox.setBounds(330,170,280,28);
        incomeComboBox.setFont(new Font("Roboto Slab",Font.BOLD,14));
        incomeComboBox.setBackground(Color.white);
        add(incomeComboBox);
        
        String qualificationVal[] = {"Post Graduate", "Graduate", "12th", "10th","Other"};
        qualificationComboBox = new JComboBox(qualificationVal);
        qualificationComboBox.setBounds(330,215,280,28);
        qualificationComboBox.setFont(new Font("Roboto Slab",Font.BOLD,14));
        qualificationComboBox.setBackground(Color.white);
        add(qualificationComboBox);
        
        String occupationVal[] = {"Employee","Teacher","Doctor","Farmer","Worker","Other"};
        occupationComboBox = new JComboBox(occupationVal);
        occupationComboBox.setBounds(330,260,280,28);
        occupationComboBox.setFont(new Font("Roboto Slab",Font.BOLD,14));
        occupationComboBox.setBackground(Color.white);
        add(occupationComboBox);
        
        panNoTextField = new JTextField();
        panNoTextField.setBounds(330,305,280,28);
        panNoTextField.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(panNoTextField);
        
        adhaarTextField = new JTextField();
        adhaarTextField.setBounds(330,350,280,28);
        adhaarTextField.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(adhaarTextField);
        
        // sr. Citizen redio buttons
        yes1 = new JRadioButton("Yes");
        yes1.setBounds(330,395,100,28);
        yes1.setFont(new Font("Roboto Slab",Font.BOLD,14));
        yes1.setBackground(Color.white);
        add(yes1);
        
        no1 = new JRadioButton("No");
        no1.setBounds(430,395,100,28);
        no1.setFont(new Font("Roboto Slab",Font.BOLD,14));
        no1.setBackground(Color.white);
        add(no1);
        
        ButtonGroup citizenButtonGroup = new ButtonGroup();
        citizenButtonGroup.add(yes1);
        citizenButtonGroup.add(no1);
        
        // Existing account radio buttons
        yes2 = new JRadioButton("Yes");
        yes2.setBounds(330,440,100,28);
        yes2.setFont(new Font("Roboto Slab",Font.BOLD,14));
        yes2.setBackground(Color.white);
        add(yes2);
        
        no2 = new JRadioButton("No");
        no2.setBounds(430,440,100,28);
        no2.setFont(new Font("Roboto Slab",Font.BOLD,14));
        no2.setBackground(Color.white);
        add(no2);
        
        ButtonGroup exiAccButtonGroup = new ButtonGroup();
        exiAccButtonGroup.add(yes2);
        exiAccButtonGroup.add(no2);
        
        nextButton = new JButton("Next");
        nextButton.setBounds(520, 580, 100, 30);
        nextButton.setFont(new Font("Roboto Slab", Font.BOLD, 14));
        nextButton.setBackground(Color.orange);
        nextButton.setForeground(Color.black);
        nextButton.addActionListener(this);
        add(nextButton);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String getFormNo = (String) formNo;
        // getSelectedItem() function is used to get the value selected in comboBox
        String getReligion = (String) religionComboBox.getSelectedItem();
        String getCategory = (String) categoryComboBox.getSelectedItem();
        String getIncome = (String) incomeComboBox.getSelectedItem();
        String getQualification = (String) qualificationComboBox.getSelectedItem();
        String getOccupation = (String) occupationComboBox.getSelectedItem();
        String getPanNo = panNoTextField.getText();
        String getAdhaar = adhaarTextField.getText();
        
        String srCitizen = null;
        if(yes1.isSelected()){
            srCitizen = "Yes";
        }else if(no1.isSelected()){
            srCitizen = "No";
        }
        
        String existingAcc = null;
        if(yes2.isSelected()){
            existingAcc = "Yes";
        }else if(no2.isSelected()){
            existingAcc = "No";
        }
        
        try {
            if(getPanNo.length() != 10){
                JOptionPane.showMessageDialog(null, "Enter correct pan no");
            }else if(getAdhaar.length() != 12){
                JOptionPane.showMessageDialog(null, "Enter correct adhaar no");
            }else if(srCitizen == null){
                JOptionPane.showMessageDialog(null, "Choose the sr. citizen yes or no");
            }else if(existingAcc == null){
                JOptionPane.showMessageDialog(null, "Choose the existing account yes or no");
            }else{
                Conn co = new Conn();
                String query = "insert into signuptwo values('" + getFormNo + "' , '" + getReligion + "','" + getCategory + "','" + getIncome + "',"
                        + ""+ "'" + getQualification + "','" + getOccupation + "','" + getPanNo + "','" + getAdhaar + "',"
                        + "'" + srCitizen + "',"+ "'" + existingAcc + "')";
                co.s.executeUpdate(query);
                
                // creating signUpThree object
                setVisible(false);
                SignUpThree signUp3 = new SignUpThree(formNo, userName);
                signUp3.setVisible(true);
            }
        } catch(Exception x) {
            System.out.println(x);
        }
     }
    
    public static void main(String[] args) {
        new SignUpTwo("","");
    }

    
}
