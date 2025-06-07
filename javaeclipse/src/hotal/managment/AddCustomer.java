package hotal.managment;

import java.awt.Choice;
import java.util.Date;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddCustomer extends JFrame implements ActionListener
{
 JLabel cust, id,num,name,gend,state,room,time,desp,time1;
 JComboBox id1;
 JTextField num1,name1,state1,desp1;
 JRadioButton gend1,gend2;
 ButtonGroup ga;
 Choice  room1;
 JButton next,cen;
 
	public AddCustomer()
	{
		setBounds(100,60,760,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		cust=new JLabel("ADD NEW CUSTOMER");
		cust.setBounds(180,-15,350,50);
		cust.setFont(new Font(Font.SERIF,Font.ROMAN_BASELINE,30));
		cust.setForeground(Color.RED);
		add(cust);
		
		
		id=new JLabel("Customer id");
		id.setBounds(10, 50, 150, 30);
		id.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(id);
		
		String str1[]= {"Select ide","Addharcard","PanCard","VoterCard","Driving laycence"};
		id1=new JComboBox(str1);
		id1.setBounds(180, 50, 150, 30);
		add(id1);
		
		num=new JLabel(" ID Number");
		num.setBounds(10, 100, 150, 30);
		num.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(num);
		
		num1=new JTextField();
		num1.setBounds(180, 100, 150, 30);
		add(num1);
		
		name=new JLabel("Customer Name");
		name.setBounds(05, 150, 150, 30);
		name.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(name);
		
		name1=new JTextField();
		name1.setBounds(180, 150, 150, 30);
		add(name1);

		gend=new JLabel("Gender");
		gend.setBounds(05, 200, 100, 30);
		gend.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(gend);
		
		gend1=new JRadioButton("Male");
		gend1.setBounds(150, 200, 100, 30);
		gend1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(gend1);
		
		gend2=new JRadioButton("Female");
		gend2.setBounds(250, 200, 100, 30);
		gend2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(gend2);
		
		ga=new ButtonGroup();
		ga.add(gend1);
		ga.add(gend2);
		
		state=new JLabel("States");
		state.setBounds(10, 250, 100, 30);
		state.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(state);
		
		state1=new JTextField();
		state1.setBounds(180, 250, 150, 30);
		add(state1);

		room=new JLabel("Allocate RoomNO");
		room.setBounds(05, 300, 170, 30);
		room.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(room);
		
		room1=new Choice();
		try {
			conn co=new conn();
			String quary="select * from room";
			ResultSet rs=co.st.executeQuery(quary);
			while(rs.next())
			{
				room1.add(rs.getString("roomnumber"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		room1.setBounds(180, 300, 150, 30);
		add(room1);
		
		
		
		time=new JLabel("Check In Time");
		time.setBounds(05, 350, 170, 30);
		time.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(time);

		Date date=new Date();
		
		time1=new JLabel(""+date);
		time1.setBounds(160, 350, 200, 30);
		time1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(time1);
		
		desp=new JLabel("Deposit");
		desp.setBounds(05, 400, 150, 30);
		desp.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(desp);
		
		desp1=new JTextField();
		desp1.setBounds(180, 400, 150, 30);
		add(desp1);

		next=new JButton("Next");
		next.setBounds(630,388,100,50);
		next.addActionListener(this);
		add(next);
		
		cen=new JButton("Cencel");
		cen.setBounds(500,388,100,50);
		cen.addActionListener(this);
		add(cen);

		ImageIcon x1= new ImageIcon(ClassLoader.getSystemResource("pic7.jpg"));
		 Image x2=x1.getImage().getScaledInstance(370, 340, Image.SCALE_DEFAULT);
		 ImageIcon x3=new ImageIcon(x2);
		 JLabel image=new JLabel(x3);
		 image.setBounds(300,10,500,400);
		 add(image);		
		
		
		setVisible(true);
		
		
			}

	public void actionPerformed(ActionEvent ac)
	{
		if(ac.getSource()==next) {
			
			String customer_ide=(String)id1.getSelectedItem();
			String number=num1.getText();
			String custmer_name=name1.getText();
			String gender=null;
			if(gend1.isSelected()) {
				gender="Male";
			}else if(gend2.isSelected()) {
				gender="Female";
			}
			
			String State=state1.getText();
			String custmer_room=room1.getSelectedItem();
			String in_time= time1.getText();
			String Deposite=desp1.getText();
			
			try {
				conn con=new conn();
				String query="insert into customer value('"+customer_ide+"','"+number+"','"+custmer_name+"','"+gender+"','"+State+"','"+custmer_room+"','"+in_time+"','"+Deposite+"') ";
				String query2="Update room set avability='Occupied'where roomnumber='"+custmer_room+"'";
				con.st.executeUpdate(query);
				con.st.executeUpdate(query2);
				JOptionPane.showMessageDialog(null, "customer add successuly");
				setVisible(false);
				new Reception();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else if(ac.getSource()==cen) {
			setVisible(false);
			new Reception();
			
		}
		
		
	}
	public static void main(String[] args)
	{
		new AddCustomer();	}

}
