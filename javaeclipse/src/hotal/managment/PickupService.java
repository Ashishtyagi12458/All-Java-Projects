package hotal.managment;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class PickupService extends JFrame implements ActionListener
{
 JTable table;
 JLabel ser,type,name,age,exp,car;
 Choice cartype;
 JButton sub,cen;
	public PickupService()
	{
		setBounds(50,50,750,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		table=new JTable();
		table.setBounds(5, 150, 730, 350);
		table.setBorder(BorderFactory.createEtchedBorder());
		
		try {
			conn co= new conn();
			String query="select * from driver";
			ResultSet rs;
			rs=co.st.executeQuery(query);
		    table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		add(table);
		
		ser=new JLabel("Pickup Service");
		ser.setBounds(200, -10, 300, 50);
		ser.setFont(new Font(Font.MONOSPACED,Font.ROMAN_BASELINE,30));
		ser.setForeground(Color.BLUE);
		add(ser);
		
		type=new JLabel("Type of car ");
		type.setBounds(10, 50, 150, 50);
		type.setFont(new Font(Font.MONOSPACED,Font.ROMAN_BASELINE,20));
		type.setForeground(Color.BLUE);
		add(type);
		
		cartype=new Choice();
		cartype.setBounds(170, 70, 150, 50);
		try {
			conn con=new conn();
			ResultSet rs1=con.st.executeQuery("select * from driver ");
			while(rs1.next()) {
				cartype.add(rs1.getString("car_name"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		add(cartype);
		
		name=new JLabel("Driver name");
		name.setBounds(10, 100, 200, 50);
		name.setFont(new Font(Font.MONOSPACED,Font.ROMAN_BASELINE,25));
		name.setForeground(Color.RED);
		add(name);
		
		age=new JLabel("Driver Age");
		age.setBounds(200, 100, 200, 50);
		age.setFont(new Font(Font.MONOSPACED,Font.ROMAN_BASELINE,25));
		age.setForeground(Color.RED);
		add(age);
		
		exp=new JLabel("Experience");
		exp.setBounds(380, 100, 200, 50);
		exp.setFont(new Font(Font.MONOSPACED,Font.ROMAN_BASELINE,25));
		exp.setForeground(Color.RED);
		add(exp);
		
		car=new JLabel("Car Type");
		car.setBounds(560, 100, 200, 50);
		car.setFont(new Font(Font.MONOSPACED,Font.ROMAN_BASELINE,25));
		car.setForeground(Color.RED);
		add(car);
		
		sub=new JButton("Submit");
		sub.setBounds(30, 210, 100, 50);
		sub.setBackground(Color.BLACK);
		sub.setForeground(Color.WHITE);
		sub.addActionListener(this);
		table.add(sub);
		
		cen=new JButton("Cencel");
		cen.setBounds(150, 210, 100, 50);
		cen.setBackground(Color.BLACK);
		cen.setForeground(Color.WHITE);
		cen.addActionListener(this);
		table.add(cen);
		
		
		setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==sub) {
			try {
			String query="select * from driver where car_name='"+cartype.getSelectedItem()+"'";
			
			conn c=new conn();
			ResultSet rs2;
		    rs2=c.st.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs2));
			setVisible(false);
			new Reception();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			setVisible(false);
			new Reception();
		}
	}

	public static void main(String[] args) {

		new PickupService();
		
	}

}
