package com.Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame
{

	JButton view,add,upd,rem;
	public Home()
	{
		setBounds(50,50,770,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		
		ImageIcon x1=new ImageIcon(ClassLoader.getSystemResource("emp3.jpg"));
		Image x2=x1.getImage().getScaledInstance(770, 500, Image.SCALE_DEFAULT);
		ImageIcon x3=new ImageIcon(x2);
		JLabel image=new JLabel(x3);
		image.setBounds(0, 0, 770, 500);
		add(image);
		
		
		add=new JButton("ADD Employee");
		add.setBounds(30, 80, 170, 50);
		add.setFont(new Font(Font.SERIF,Font.ITALIC,20));
		add.setBackground(Color.BLACK);
		add.setForeground(Color.WHITE);
		image.add(add);
		
		upd=new JButton("Update Employee");
		upd.setBounds(30, 160, 170, 50);
		upd.setFont(new Font(Font.SERIF,Font.ITALIC,17));
		upd.setBackground(Color.BLACK);
		upd.setForeground(Color.WHITE);
		image.add(upd);
		
		view=new JButton("View Employee");
		view.setBounds(30, 240, 170, 50);
		view.setFont(new Font(Font.SERIF,Font.ITALIC,20));
		view.setBackground(Color.BLACK);
		view.setForeground(Color.WHITE);
		image.add(view);
		
		rem=new JButton("Remove Employee");
		rem.setBounds(30, 320, 170, 50);
		rem.setFont(new Font(Font.SERIF,Font.ITALIC,17));
		rem.setBackground(Color.BLACK);
		rem.setForeground(Color.WHITE);
		image.add(rem);
		
		JLabel mag=new JLabel("Managment System");
		mag.setBounds(250, 0, 350, 50);
		mag.setFont(new Font(Font.SERIF,Font.ITALIC,40));
		mag.setForeground(Color.BLUE);
		image.add(mag);

		
		
		setVisible(true);
		
		
	}

	public static void main(String[] args) 
	{

		new Home();
	}

}
