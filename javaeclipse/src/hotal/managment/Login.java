package hotal.managment;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener
{
	JLabel user,pass,i1;
	JTextField user1;
	JButton log,can;
	JPasswordField pass1; 

	public Login()
	{
		setBounds(0,0,880,550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		user=new JLabel("Username");
		user.setBounds(50, 50, 150, 50);
		user.setFont(new Font(Font.DIALOG,Font.ROMAN_BASELINE,30));
		user.setForeground(Color.orange);
		add(user);
		
		
		user1=new JTextField();
		user1.setBounds(250, 50, 150, 50);
		user1.addActionListener(this);
		add(user1);
				
		
		pass=new JLabel("Password");
		pass.setBounds(50, 250, 150, 50);
		pass.setFont(new Font(Font.DIALOG,Font.ROMAN_BASELINE,30));
		pass.setForeground(Color.orange);
		add(pass);
		
		pass1=new JPasswordField();
		pass1.setBounds(250, 250, 150, 50);
		pass1.addActionListener(this);

		add(pass1);
		
		log=new JButton("Login");
		log.setBounds(200, 450, 100, 50);
		add(log);
		log.addActionListener(this);

		can=new JButton("Cancel");
		can.setBounds(70, 450, 100, 50);
		add(can);
		can.addActionListener(this);
		
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("pic2.jpg"));
		i1=new JLabel(image);
		i1.setBounds(500,50,300,300);
		 add (i1);

		
		
		setVisible(true);
		
		
	}
      
	
	 public void actionPerformed(ActionEvent ac)
	 {
		 if(ac.getSource()==log) {
			String user=user1.getText();
			String pass=String.valueOf(pass1.getPassword());
			try {
				conn c=new conn();
				String query="select * from login where username='"+user+"'and password='"+pass+"'";
				ResultSet rs= c.st.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Dashboard();					
				}else {
					JOptionPane.showMessageDialog(null,"invalid password and user name");
					setVisible(false);
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			 
		 }else if(ac.getSource()==can) {
			 setVisible(false);
		 }
	 }
	public static void main(String[] args)
	{
      new Login();
	}

}
