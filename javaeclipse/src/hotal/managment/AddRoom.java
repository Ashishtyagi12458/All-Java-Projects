package hotal.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AddRoom extends JFrame implements ActionListener
{
	JLabel ad,num,cel,ava,pri,type;
	JComboBox add1,ava1,cel1,pri1,type1;
	JButton room,cen;

	public AddRoom()
	{
	 setBounds(100,50,800,570);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 
	 ad=new JLabel("ADD ROOM");
	 ad.setBounds(200, 5, 300, 50);
	 ad.setForeground(Color.RED);
	ad.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,50));
	 add(ad);
	 
	 
	 
	 num=new JLabel("Room Number");
	 num.setBounds(10, 95, 150, 50);
	 num.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
	 add(num);
	 
	 String str[]= {"select room number","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
	 add1=new JComboBox(str);
	 add1.setBounds(170,100,150,30);
	 add(add1);
	 
	 ava=new JLabel("Available");
	 ava.setBounds(10, 150, 150, 30);
	 ava.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
	 add(ava);
	 
	 String str1[]= {"Aviable","NotAviable"};
	 ava1=new JComboBox(str1);
	 ava1.setBounds(170,150,150,30);
	 add(ava1);
	 
	 cel=new JLabel("Clean Status");
	 cel.setBounds(6, 200, 200, 30);
	 cel.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
	 add(cel);
	 
	 String str2[]= {"Cleaned","Not Cleaned"};
	 cel1=new JComboBox(str2);
	 cel1.setBounds(170,200,150,30);
	 add(cel1);
	 
	 pri=new JLabel("Room price");
	 pri.setBounds(6, 250, 150, 30);
	 pri.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
	 add(pri);
	 
	 String str3[]= {"770","1000","1500"};
	 pri1=new JComboBox(str3);
	 pri1.setBounds(170,250,150,30);
	 add(pri1);
	 
	 type=new JLabel("Bed Type");
	 type.setBounds(6, 300, 150, 30);
	 type.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
	 add(type);
	 
	 String str4[]= {"Single Bed","Duble Bed"};
	 type1=new JComboBox(str4);
	 type1.setBounds(170,300,150,30);
	 add(type1);
	 
	 room=new JButton("ADD");
	 room.setBounds(10, 450, 120, 50);
	 room.addActionListener(this);
	 add(room);
	 
	 cen=new JButton("Cencel");
	 cen.setBounds(150, 450, 120, 50);
	 cen.addActionListener(this);
	 add(cen);
	 
	 ImageIcon x1= new ImageIcon(ClassLoader.getSystemResource("pic4.jpg"));
	 Image x2=x1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
	 ImageIcon x3=new ImageIcon(x2);
	 JLabel image=new JLabel(x3);
	 image.setBounds(300,10,500,500);
	 add(image);

	
	 setVisible(true);		
		
	}
	public void actionPerformed(ActionEvent ac)
	{
		if(ac.getSource()==room) {
			
			String roomnumber= (String) add1.getSelectedItem();
			String avability=(String) ava1.getSelectedItem();
			String cleaning= (String)cel1.getSelectedItem();
			String price=(String)pri1.getSelectedItem();
			String bedtype=(String)type1.getSelectedItem();

			try {
				conn con=new conn();
				String str="insert into room value('"+roomnumber+"','"+avability+"','"+cleaning+"','"+price+"','"+bedtype+"')";
				con.st.executeUpdate(str);
				JOptionPane.showMessageDialog(null,"room add succesfully");

				
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
		new AddRoom();
	}

}
