// SignUpOne page
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{
    JTextField nameTextField,fatherTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JDateChooser dobChooser;
    JRadioButton male, female, married, unmarried, other;
    JButton nextButton;
    Random ran;
    int RandomForm;

    public SignUpOne(){
        setLayout(null);
        setTitle("Application Form");
        getContentPane().setBackground(Color.white);
        setSize(700,700);
        setLocation(350, 20);
        setVisible(true);
      
        JLabel headTitle = new JLabel("Application Form");
        headTitle.setBounds(230, 10, 300, 35);
        headTitle.setFont(new Font("Roboto Slab",Font.BOLD,28));
        add(headTitle);
        
        ran = new Random();
        RandomForm = Math.abs((ran.nextInt() % 9000)+1000);
        
        JLabel formNo = new JLabel("Form No: " + RandomForm);
        formNo.setBounds(550, 65, 100, 20);
        formNo.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(formNo);
        
        JLabel pageTile = new JLabel("Page 1 : Personal Details");
        pageTile.setBounds(230, 75, 300, 35);
        pageTile.setFont(new Font("Roboto Slab",Font.BOLD,20));
        add(pageTile);
        
        //form attributes
        JLabel name = new JLabel("Name:");
        name.setBounds(130,130,200,25);
        name.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(name);
        
        JLabel father = new JLabel("Father's Name:");
        father.setBounds(130,175,200,25);
        father.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(father);
        
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setBounds(130,220,200,25);
        dob.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(dob);
        
        JLabel email = new JLabel("Email:");
        email.setBounds(130,265,200,25);
        email.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(email);
        
        JLabel gender = new JLabel("Gender:");
        gender.setBounds(130,310,200,25);
        gender.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(gender);
        
        JLabel matiral = new JLabel("Marital Status:");
        matiral.setBounds(130,355,200,25);
        matiral.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(matiral);
        
        JLabel address = new JLabel("Address:");
        address.setBounds(130,400,200,25);
        address.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(address);
        
        JLabel city = new JLabel("City:");
        city.setBounds(130,445,200,25);
        city.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(city);
        
        JLabel state = new JLabel("State:");
        state.setBounds(130,490,200,25);
        state.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(state);
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setBounds(130,535,200,25);
        pincode.setFont(new Font("Roboto Slab",Font.BOLD,16));
        add(pincode);
       
        // input fields
        nameTextField = new JTextField();
        nameTextField.setBounds(330,130,280,28);
        nameTextField.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(nameTextField);
        
        fatherTextField = new JTextField();
        fatherTextField.setBounds(330,175,280,28);
        fatherTextField.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(fatherTextField);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(330,265,280,28);
        emailTextField.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(emailTextField);
        
         // gender radio buttons
        male = new JRadioButton("Male");
        male.setBounds(330, 310, 100, 28);
        male.setFont(new Font("Roboto Slab", Font.BOLD, 14));
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(430, 310, 100, 28);
        female.setFont(new Font("Roboto Slab", Font.BOLD, 14));
        female.setBackground(Color.white);
        add(female);

        ButtonGroup gendeButtonGroup = new ButtonGroup();
        gendeButtonGroup.add(male);
        gendeButtonGroup.add(female);

        // marital status radio buttons
        married = new JRadioButton("Married");
        married.setBounds(330, 355, 100, 28);
        married.setFont(new Font("Roboto Slab", Font.BOLD, 14));
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(430, 355, 100, 28);
        unmarried.setFont(new Font("Roboto Slab", Font.BOLD, 14));
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(540, 355, 100, 28);
        other.setFont(new Font("Roboto Slab", Font.BOLD, 14));
        other.setBackground(Color.white);
        add(other);

        ButtonGroup maritalButtonGroup = new ButtonGroup();
        maritalButtonGroup.add(married);
        maritalButtonGroup.add(unmarried);
        maritalButtonGroup.add(other);

        addressTextField = new JTextField();
        addressTextField.setBounds(330,400,280,28);
        addressTextField.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(addressTextField);
        
        cityTextField = new JTextField();
        cityTextField.setBounds(330,445,280,28);
        cityTextField.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(cityTextField);
        
        stateTextField = new JTextField();
        stateTextField.setBounds(330,490,280,28);
        stateTextField.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(stateTextField);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(330,535,280,28);
        pincodeTextField.setFont(new Font("Roboto Slab",Font.BOLD,14));
        add(pincodeTextField);
        
        dobChooser = new JDateChooser();
        dobChooser.setBounds(330,220,280,28);
        add(dobChooser);
        
        nextButton = new JButton("Next");
        nextButton.setBounds(520, 580, 100, 30);
        nextButton.setFont(new Font("Roboto Slab", Font.BOLD, 14));
        nextButton.setBackground(Color.orange);
        nextButton.setForeground(Color.black);
        nextButton.addActionListener(this);
        add(nextButton);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String formNo = "" + RandomForm;// dobble cotts with concatination convert integer into string
        String name = nameTextField.getText();// getText() is used to get the value from Textfield
        String fName = fatherTextField.getText();
        String dob = ((JTextField) dobChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){ // isSelected() method is used to know that element is selected od not
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pinCode = pincodeTextField.getText();
        
        
        //validation
        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }else if(fName.equals("")){
                JOptionPane.showMessageDialog(null, "Father name is required");
            }
            else if(gender.equals("")){
                JOptionPane.showMessageDialog(null, "Select the gender");
            }else if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is required");
            }else if(marital.equals("")){
                JOptionPane.showMessageDialog(null, "Select marital status");
            }else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is required");
            }else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "Enter the city name");
            }else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "Enter the state name");
        }else if(pinCode.equals("")){
                JOptionPane.showMessageDialog(null, "Enter the pin code name");
            }else{
                Conn co = new Conn();
                String query = "insert into signUp values('" + formNo + "' , '" + name + "','" + fName + "','" + dob + "',"+ "'" + email + "','" + gender + "','" + marital + "','" + address + "','" + city + "',"+ "'" + state + "','" + pinCode + "')";
                co.s.executeUpdate(query);
                
                setVisible(false);
                // creating signupTwo object 
                SignUpTwo signUp2 = new SignUpTwo(formNo, name);
                signUp2.setVisible(true);
                
                
            }
     
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new SignUpOne();
    }
}
