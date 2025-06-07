package hotal.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddEmployee extends JFrame implements ActionListener
{
  JLabel emp,na,age,gen,jo,sal,pho,ema,aad;
  JButton sub,cen;
  JTextField na1,age1,sal1,pho1,ema1,aad1;
  JRadioButton ma,fem;
  JComboBox jo1;
  ButtonGroup ra;
  
  public AddEmployee() 
	{
		setBounds(200,100,700,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		emp=new JLabel("ADD EMPLOYEE");
		emp.setBounds(150, -13, 350, 50);
		emp.setFont(new Font(Font.SERIF,Font.ITALIC,40));
		emp.setForeground(Color.red);
		add(emp);
		
		
		
		na=new JLabel("Name");
		na.setBounds(30,50,100,50);
		na.setFont(new Font(Font.DIALOG_INPUT,Font.PLAIN,25));
		add(na);
		
		na1=new JTextField();
		na1.setBounds(170,50,150,40);
		na1.setBorder(BorderFactory.createEtchedBorder());
		add(na1);
		

		age=new JLabel("AGE");
		age.setBounds(30,100,100,50);
		age.setFont(new Font(Font.DIALOG_INPUT,Font.PLAIN,25));
		add(age);
		
		age1=new JTextField();
		age1.setBounds(170,100,150,40);
		age1.setBorder(BorderFactory.createEtchedBorder());
		add(age1);
		
		gen=new JLabel("GENDER");
		gen.setBounds(30,150,100,50);
		gen.setFont(new Font(Font.DIALOG_INPUT,Font.PLAIN,25));
		add(gen);
		
		
		ma=new JRadioButton("male");
		ma.setBounds(150, 150, 100, 40);
		ma.setFont(new Font(Font.SERIF,Font.PLAIN,25));
		add(ma);
		
		
		
		fem=new JRadioButton("Female");
		fem.setBounds(250, 150, 100, 40);
		fem.setFont(new Font(Font.SERIF,Font.PLAIN,25));
		add(fem);
		
	    ra=new ButtonGroup();
		ra.add(ma);
		ra.add(fem);
		
		
		jo=new JLabel("JOB");
		jo.setBounds(30,200,100,50);
		jo.setFont(new Font(Font.DIALOG_INPUT,Font.PLAIN,25));
		add(jo);
		
		String str[]= {"Select your field","manager","masia","managent","Accucant","Room Clener"};
		jo1=new JComboBox(str);
		jo1.setBounds(170, 205, 150, 40);
		add(jo1);
		
		sal=new JLabel("Salary");
		sal.setBounds(30,250,100,50);
		sal.setFont(new Font(Font.DIALOG_INPUT,Font.PLAIN,25));
		add(sal);
		
		sal1=new JTextField();
		sal1.setBounds(170,260,150,40);
		sal1.setBorder(BorderFactory.createEtchedBorder());
		add(sal1);
		
		pho=new JLabel("Phone NO:");
		pho.setBounds(15,300,150,50);
		pho.setFont(new Font(Font.DIALOG_INPUT,Font.PLAIN,25));
		add(pho);
		
		pho1=new JTextField();
		pho1.setBounds(170,310,150,40);
		pho1.setBorder(BorderFactory.createEtchedBorder());
		add(pho1);
		
		ema=new JLabel("Email ide:");
		ema.setBounds(15,350,200,50);
		ema.setFont(new Font(Font.DIALOG_INPUT,Font.PLAIN,25));
		add(ema);
		
		ema1=new JTextField();
		ema1.setBounds(170,360,150,40);
		ema1.setBorder(BorderFactory.createEtchedBorder());
		add(ema1);
		
		sub=new JButton("Submit");
		sub.setBounds(550, 380, 100, 50);
		sub.addActionListener(this);
		add(sub);
		
		cen=new JButton("Cencel");
		cen.setBounds(440, 380, 100, 50);
		cen.addActionListener(this);
		add(cen);
		
		
		setVisible(true);	
	}
  
    public void actionPerformed(ActionEvent ac)
    {
    	if(ac.getSource()==sub) {
    	String name=na1.getText();
    	String age=age1.getText();
    	String salary=sal1.getText();
    	String phone=pho1.getText();
    	if(!phone.matches("^[789][\\d]{9}")) {
    		JOptionPane.showMessageDialog(null, "your number is not valid");
    		return;
    	}
    	String email=ema1.getText();
    	if(!email.matches("^[a-zA-Z0-9.+-_%]+@gmail\\.com$")) {
    		JOptionPane.showMessageDialog(null, "sorry your email is not valid");
    		return;
    	}
    	String gender=null;
    	if(ma.isSelected()) {
    		gender="male";
    	}else if(fem.isSelected()) {
    		gender="female";
    		
    	}
    	
    	if(name.equals("")) {
    		JOptionPane.showMessageDialog(null, "Please enter the name");
    		return ;
    	}
    	try {
    		int age1=Integer.parseInt(age);
    		if(age1<18) {
    			JOptionPane.showMessageDialog(null, "sorry your age is not valide");
    			return;
    		}
  
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	String job= (String)jo1.getSelectedItem();
    	
    	try {
    		conn co=new conn();
    		String quary="insert into employee value('"+name+"','"+age+"','"+salary+"','"+phone+"','"+email+"','"+gender+"','"+job+"')";
             co.st.executeUpdate(quary);
             JOptionPane.showMessageDialog(null, "Employee add successfuly");
             setVisible(false);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    		
    	}else if(ac.getSource()==cen) {
    		setVisible(false);
    		new Dashboard();
    	}
    }

	public static void main(String[] args)
	{

		new AddEmployee();
	}

}
