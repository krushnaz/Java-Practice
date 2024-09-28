import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class signupTwo extends JFrame implements ActionListener {
    long random; 
    JTextField txtname,txtfname,txtemail,txtadress,txtcity,txtstate,txtpincode;
    // JDateChooser date;
    JRadioButton male,female,married,unmarried;
    JButton button;
signupTwo(){
	
	
	JLabel personaldetails = new JLabel("Page No.1: Personal Details ");
	personaldetails.setBounds(230,100,600,50);
	personaldetails.setFont(new Font("Raleway",Font.BOLD, 20));
	add(personaldetails);
	
	JLabel name = new JLabel("Name:");
	name.setBounds(100,150,200,70);
	name.setFont(new Font("Raleway",Font.BOLD, 20));
	add(name);
	
	 txtname = new JTextField();
	txtname.setFont(new Font("Raleway",Font.BOLD, 18));
	txtname.setBounds(340,170,350,30);
	add(txtname);
	
	
	JLabel fname = new JLabel("Father's Name:");
	fname.setBounds(100,200,200,70);
	fname.setFont(new Font("Raleway",Font.BOLD, 20));
	add(fname);
	
	
	txtfname = new JTextField();
	txtfname.setFont(new Font("Raleway",Font.BOLD, 18));
	txtfname.setBounds(340,220,350,30);
	add(txtfname);
	
	
	JLabel dob = new JLabel("Date Of Birth:");
	dob.setBounds(100,250,200,70);
	dob.setFont(new Font("Raleway",Font.BOLD, 20));
	add(dob);
	
	//  date = new JDateChooser();
	// date.setFont(new Font("Raleway",Font.BOLD, 15));
	// date.setBounds(340,270,350,32);
	// add(date);
	
	JLabel gender = new JLabel("Gender:");
	gender.setBounds(100,300,200,70);
	gender.setFont(new Font("Raleway",Font.BOLD, 20));
	add(gender);
	
	 male = new JRadioButton("Male");
	male.setFont(new Font("Raleway", Font.BOLD,18));
	male.setBackground(Color.white);
	male.setBounds(340,315,120,40);
	add(male);
	
    female = new JRadioButton("female");
	female.setFont(new Font("Raleway", Font.BOLD,18));
	female.setBackground(Color.white);
	female.setBounds(490,315,100,40);
	add(female);
	
	ButtonGroup gendergroup = new ButtonGroup();
	gendergroup.add(male);
	gendergroup.add(female);
	
	
	JLabel email = new JLabel("Email Address:");
	email.setBounds(100,350,200,70);
	email.setFont(new Font("Raleway",Font.BOLD, 20));
	add(email);
	
    txtemail= new JTextField();
	txtemail.setFont(new Font("Raleway",Font.BOLD, 18));
	txtemail.setBounds(340,370,350,30);
	add(txtemail);

	
	
	JLabel marital = new JLabel("Marital Status:");
	marital.setBounds(100,400,200,70);
	marital.setFont(new Font("Raleway",Font.BOLD, 20));
	add(marital);
	
	married = new JRadioButton("Married");
	married.setFont(new Font("Raleway", Font.BOLD,18));
	married.setBackground(Color.white);
	married.setBounds(340,415,120,40);
	add(married);
	
    unmarried = new JRadioButton("Unmarried");
	unmarried.setFont(new Font("Raleway", Font.BOLD,18));
	unmarried.setBackground(Color.white);
	unmarried.setBounds(490,415,150,40);
	add(unmarried);
	
	ButtonGroup maritalgroup = new ButtonGroup();
	maritalgroup.add(married);
	maritalgroup.add(unmarried);
	
	JLabel address = new JLabel("Address:");
	address.setBounds(100,450,200,70);
	address.setFont(new Font("Raleway",Font.BOLD, 20));
	add(address);
	
	txtadress= new JTextField();
	txtadress.setFont(new Font("Raleway",Font.BOLD, 18));
	txtadress.setBounds(340,470,350,30);
	add(txtadress);
	
	JLabel city = new JLabel("City:");
	city.setBounds(100,500,200,70);
	city.setFont(new Font("Raleway",Font.BOLD, 20));
	add(city);

    txtcity= new JTextField();
	txtcity.setFont(new Font("Raleway",Font.BOLD, 18));
	txtcity.setBounds(340,520,350,30);
	add(txtcity);
	

	JLabel state = new JLabel("State:");
	state.setBounds(100,550,200,70);
	state.setFont(new Font("Raleway",Font.BOLD, 20));
	add(state);
	
    txtstate= new JTextField();
	txtstate.setFont(new Font("Raleway",Font.BOLD, 18));
	txtstate.setBounds(340,570,350,30);
	add(txtstate);
	
	
	JLabel pincode = new JLabel("Pin Code:");
	pincode.setBounds(100,600,200,70);
	pincode.setFont(new Font("Raleway",Font.BOLD, 20));
	add(pincode);
	
	txtpincode= new JTextField();
	txtpincode.setFont(new Font("Raleway",Font.BOLD, 18));
	txtpincode.setBounds(340,620,350,30);
	add(txtpincode);
	
	JButton button = new JButton("Next");
	button.setBackground(Color.black);
	button.setForeground(Color.white);
	button.setFont(new Font("Raleway", Font.BOLD, 18));
	button.setBounds(570,680,120,35);
	add(button);
	
	button.addActionListener(this);
	
	
	setTitle("SIGN UP PAGE");
	getContentPane().setBackground(Color.white);
	setLocation(480, 150);
	setLayout(null);
	setSize(800,800);
	setVisible(true);
}

public void actionPerformed(ActionEvent ae) {
	// String formno = ""+random;
	String name = txtname.getText();
	String fname = txtfname.getText();
	// String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
	String gender = null;
	if(male.isSelected()) {
		gender = "male";
	}
	else if(female.isSelected()) {
		gender = "female";
	}
	String email = txtemail.getText();
	String marital = null;
	if(married.isSelected()) {
		marital = "Married";
	}
	else if(unmarried.isSelected()) {
		marital = "Unmarried";
	}
	
	String address = txtadress.getText();
	String city = txtcity.getText();
	String state = txtstate.getText();
	String pin = txtpincode.getText();
	
	// try {
	// 	if(name.isEmpty() || fname.isEmpty() || dob.isEmpty() || gender.isEmpty() || email.isEmpty() || marital.isEmpty() || address.isEmpty() || city.isEmpty() || pin.isEmpty() || state.isEmpty()) {
	// 		JOptionPane.showMessageDialog(null, "you have to fill all the fields*");
	// 	}
	// 	else {
	// 		database db = new database();
	// 		String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
	// 		db.st.executeUpdate(query);
	// 	}
		
	// }catch(Exception e) {
	// 	System.out.println(e);
	// }
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
    new signupTwo();
}

}