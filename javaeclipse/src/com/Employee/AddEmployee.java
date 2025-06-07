package com.Employee;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class AddEmployee extends JFrame
{

	JLabel addem,name,date;
	JTextField name1;
	JDateChooser date1;
	public AddEmployee()
	{
		setBounds(80,60,800,550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		addem=new JLabel("ADD Employee");
		addem.setBounds(200, 0, 300, 50);
		addem.setFont(new Font(Font.MONOSPACED,Font.HANGING_BASELINE,30));
		addem.setForeground(Color.BLUE);
		add(addem);
		
		name=new JLabel("name");
		name.setBounds(20, 60, 100, 50);
		name.setFont(new Font(Font.MONOSPACED,Font.HANGING_BASELINE,30));
		add(name);
		
		name1=new JTextField();
		name1.setBounds(120, 65, 150, 40);
		add(name1);
		
		date=new JLabel("Date");
		date.setBounds(20,120,100,50);
		date.setFont(new Font(Font.MONOSPACED,Font.HANGING_BASELINE,30));
		add(date);
		
		date1=new JDateChooser();
		date1.setBounds(120, 125, 150, 50);
		add(date1);

		
		
		
		
		setVisible(true);
	}

	public static void main(String[] args)
	{

		new AddEmployee();
	}

}
