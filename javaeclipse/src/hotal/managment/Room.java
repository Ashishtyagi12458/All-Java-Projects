package hotal.managment;

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
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class Room extends JFrame implements ActionListener
{
  JTable table;
  JButton back;
  JLabel room,avil,sta,pri,type,alrooom;
	public Room()
	{
		setBounds(100,50,700,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		

		ImageIcon x1= new ImageIcon(ClassLoader.getSystemResource("pic8.jpg"));
		 Image x2=x1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		 ImageIcon x3=new ImageIcon(x2);
		 JLabel image=new JLabel(x3);
		 image.setBounds(280,10,510,300);
		 add(image);		

		 table=new JTable();
		 table.setBounds(0, 100, 370, 400);
		 add(table);
	 
		 try {
			 conn con=new conn();
			 ResultSet rs=con.st.executeQuery("select * from room");
			 
			 table.setModel(DbUtils.resultSetToTableModel(rs));
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		 back=new JButton("BACK");
		 back.setBounds(50, 400, 150, 50);
		 back.setBackground(Color.BLACK);
		 back.setForeground(Color.WHITE);
		 add(back);
		
		 room=new JLabel("Room No");
		 room.setBounds(10, 65, 80, 50);
		 add(room);
		 
		 avil=new JLabel("Availibility");
		 avil.setBounds(80, 65, 80, 50);
		 add(avil);
		 
		 
		 sta=new JLabel("Status");
		 sta.setBounds(160, 65, 80, 50);
		 add(sta);
		 

		 pri=new JLabel("Price");
		 pri.setBounds(230, 65, 80, 50);
		 add(pri);
		 

		 type=new JLabel("bed Type");
		 type.setBounds(300, 65, 80, 50);
		 add(type);
		 
		 back=new JButton("BACK");
		 back.setBounds(100, 260, 100, 50);
		 back.setBackground(Color.BLACK);
		 back.setForeground(Color.WHITE);
		 back.setFont(new Font(Font.DIALOG,Font.LAYOUT_NO_START_CONTEXT,20));
		 back.addActionListener(this);
		table. add(back);
		
		alrooom=new JLabel("ALL Room Information");
		alrooom.setBounds(30, 0, 350, 50);
		alrooom.setFont(new Font (Font.SANS_SERIF,Font.PLAIN,30));
		alrooom.setForeground(Color.BLUE);
		add(alrooom);
		


		 
		
		setVisible(true);
		
			}

	
	public void actionPerformed(ActionEvent ac) {
		setVisible(false);
		new Reception();
		
	}
	public static void main(String[] args) 
	{
      new Room();
	}

}
