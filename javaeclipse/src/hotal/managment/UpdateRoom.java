package hotal.managment;

import java.awt.Choice;
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

public class UpdateRoom extends JFrame implements ActionListener
{
    Choice num;
	JLabel sts,id,room,ava,cle,image;
	JTextField room1,ava1,cle1;
	JButton updat,chek,back;
	public UpdateRoom()
	
	{
	 setBounds(50,50,770,450);	
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 
	 sts=new JLabel("Update Room Status");
	 sts.setBounds(150, 0, 400, 50);
	 sts.setForeground(Color.RED);
	 sts.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,30));

	 add(sts);
	 
	 id=new JLabel("Ide_Number");
	 id.setBounds(20,60,150,50);
	 id.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
     add(id);	
     
     
     num=new Choice();
     num.setBounds(180, 80, 150, 50);
     
     try {
    	 conn co=new conn();
    	 ResultSet rs=co.st.executeQuery("select * from customer");
    	 while(rs.next()) {
    		 num.add(rs.getString("NUMBER"));
    	 }
    	 
     }catch(Exception e) {
    	 e.printStackTrace();
     }
     
     
     add(num);
     
     
     room=new JLabel("Room NO");
	 room.setBounds(20,115,150,50);
	 room.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
     add(room);
     
     room1=new JTextField();
     room1.setBounds(180,125,150,30);
     add(room1);
     
     
     ava=new JLabel("Avability");
	 ava.setBounds(20,170,150,50);
	 ava.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
     add(ava);
     
     ava1=new JTextField();
     ava1.setBounds(180,185,150,30);
     add(ava1);
     
     
     cle=new JLabel(" Clean Status");
	 cle.setBounds(5,225,200,50);
	 cle.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
     add(cle);
     
     cle1=new JTextField();
     cle1.setBounds(180,235,150,30);
     add(cle1);
     
     
     updat=new JButton("Update");
     updat.setBounds(220, 350, 80, 50);
     updat.setBackground(Color.BLACK);
     updat.setForeground(Color.WHITE);
     updat.addActionListener(this);
     add(updat);

     chek=new JButton("Check");
     chek.setBounds(120, 350, 80, 50);
     chek.setBackground(Color.BLACK);
     chek.setForeground(Color.WHITE);
     chek.addActionListener(this);
     add(chek);

     back=new JButton("Back");
     back.setBounds(20, 350, 80, 50);
     back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
     back.addActionListener(this);
     add(back);

     ImageIcon x1=new ImageIcon(ClassLoader.getSystemResource("pic10.jpg"));
     Image x2=x1.getImage().getScaledInstance(380, 380, Image.SCALE_DEFAULT);
     ImageIcon x3=new ImageIcon(x2);
     image=new JLabel(x3);
     image.setBounds(330, 40, 430, 370);
     add(image);
    
		
     
	 
	 setVisible(true);
	 
	}

	public void actionPerformed(ActionEvent ac) {
		if(ac.getSource()==chek) {
			String id=num.getSelectedItem();
			String query1="select * from customer where NUMBER='"+id+"'";
			
			try {
				conn con=new conn();
				ResultSet rs=con.st.executeQuery(query1);
				while(rs.next()) {
					room1.setText(rs.getString("custmer_room"));
				}
				ResultSet rs1=con.st.executeQuery("select * from room where roomnumber='"+room1.getText()+"' ");
				while(rs1.next()) {
					ava1.setText(rs1.getNString("avability"));
					cle1.setText(rs1.getString("cleaning"));
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(ac.getSource()==updat) {
			String number=num.getSelectedItem();
			String room_no=room1.getText();
			String avabile=ava1.getText();
			String cleaning=cle1.getText();
			 
			try {
				conn co=new conn();
				co.st.executeUpdate("Update room set avability='"+avabile+"', cleaning='"+cleaning+"' where roomnumber='"+room_no+"'");
				JOptionPane.showMessageDialog(null, "data update successfully");
			
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else {
			setVisible(false);
			new Reception();
		}
		
	}
	public static void main(String[] args) 
	{

		new UpdateRoom();
	}

}
