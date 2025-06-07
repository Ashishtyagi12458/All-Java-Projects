package hotal.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HotalManagmentSyatem extends JFrame implements ActionListener,Runnable
{
  JLabel text1;
  JButton next,next1;
  Thread tr;
	public HotalManagmentSyatem() 
	{
		 	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(0, 0, 1300, 570);
		 
		 
		  text1= new JLabel("Tyagi gi hotel");
		 text1.setBounds(350, 50, 500,50);
		 text1.setFont(new Font(Font.MONOSPACED,Font.BOLD,50));
		 text1.setForeground(Color.RED);
		 add(text1);
		 
		 
		  next=new JButton("Next");
		 next.setBounds(1100, 480, 100, 50);
		 next.setFont(new Font(Font.SANS_SERIF,Font.ROMAN_BASELINE,20));
		 next.setForeground(Color.blue);
		 next.setBackground(Color.gray);
		 next.addActionListener(this);
		 add(next);
		 
		  next1=new JButton("CANCEL");
		 next1.setBounds(930, 480, 120, 50);
		 next1.setFont(new Font(Font.SANS_SERIF,Font.ROMAN_BASELINE,20));
		 next1.setForeground(Color.blue);
		 next1.setBackground(Color.gray);
		 next1.addActionListener(this);
		 add(next1);
		 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("pic3.jpg"));
			Image i2 = i1.getImage().getScaledInstance(1300, 570,Image.SCALE_DEFAULT);
			ImageIcon i3 = new ImageIcon(i2);
			JLabel image= new JLabel(i3);
			image.setBounds(0, 0, 1300, 570);
			add(image);

		 
		 setLayout(null);
		 setVisible(true);
		 
		 tr=new Thread(this);
		 tr.start();
			 
	}
	 public void actionPerformed(ActionEvent ac)
	 {
		 if(ac.getSource()==next)
		 {
		  setVisible(false);
			new Login();
		 }else if(ac.getSource()==next1) {
			 setVisible(false);
		 }
		
}
	 public void run() {
		 try {
			 for(int i=1;i<5;i++) {
				 
			 Thread.sleep(7000);
			 }
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }

	public static void main(String[] args) 
	{
		new HotalManagmentSyatem();
	}

}
