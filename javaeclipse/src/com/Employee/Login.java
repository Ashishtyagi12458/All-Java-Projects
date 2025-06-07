package com.Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener
{

	JLabel user,pass,image;
	JTextField user1,pass1;
	JButton lo;
	public Login()
	{
		setBounds(50,50,650,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		user=new JLabel("Username");
		user.setBounds(20, 80, 150, 50);
		user.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,30));
		add(user);
		
		
		user1=new JTextField();
		user1.setBounds(190, 80, 150, 50);
		add(user1);
		
		pass=new JLabel("Password");
		pass.setBounds(20, 200, 150, 50);
		pass.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,30));
		add(pass);
		
		pass1=new JTextField();
		pass1.setBounds(190, 200, 150, 50);
		add(pass1);

		lo=new JButton("Login");
		lo.setBounds(80, 300, 120, 50);
		lo.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,30));
        lo.setForeground(Color.WHITE);
		lo.setBackground(Color.BLACK);
		lo.addActionListener(this);
		add(lo);
		
		ImageIcon x1=new ImageIcon(ClassLoader.getSystemResource("emp2.jpg"));
		Image x2=x1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		ImageIcon x3=new ImageIcon(x2);
		JLabel image=new JLabel(x3);
		image.setBounds(380, 0, 300, 400);
		add(image);
			
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ac) {
	
		String username=user1.getText();
		String password=pass1.getText();
		try {
			Conn con=new Conn();
			String query="select * from login where username='"+username+"'and PASSWORD='"+password+"'";
			ResultSet rs=con.st.executeQuery(query);
			if(rs.next()) {
				setVisible(false);
			}else {
					JOptionPane.showMessageDialog(null, "your username and password is worng");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
 
		new Login();
	}

}
