package com.swingpro;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingTesting 
{
	SwingTesting()
	{
		JFrame jf=new JFrame("WELCOME");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(800,400);
		jf.setLayout(null);
		

		JLabel s1=new JLabel("ASHISH TYAGI");
		s1.setBounds(150,50,150,50);
		jf.add(s1);
		
		jf.setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		new SwingTesting();
	}

}
