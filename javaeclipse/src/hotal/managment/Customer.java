package hotal.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class Customer extends JFrame implements ActionListener 
{
  JTable table;
  JLabel id,num,name,gend,state,room,time,desp,cust;
  JButton bak;

	public Customer()
	{
		setBounds(50,50,780,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		table=new JTable();
		table.setBounds(5,100,750,400);
		
		try {
			conn co=new conn();
			ResultSet rs=co.st.executeQuery("select * from customer");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		add(table);
		
		id=new JLabel("IDE");
		id.setBounds(8, 65, 100, 50);
		id.setForeground(Color.RED);
		id.setFont(new Font(Font.DIALOG_INPUT,Font.LAYOUT_RIGHT_TO_LEFT,20));
		add(id);
		
		num=new JLabel("NUMBER");
	    num.setBounds(100, 65, 100, 50);
		num.setForeground(Color.RED);
		num.setFont(new Font(Font.DIALOG_INPUT,Font.LAYOUT_RIGHT_TO_LEFT,20));
		add(num);
		
		name=new JLabel("NAME");
		name.setBounds(200, 65, 100, 50);
		name.setForeground(Color.RED);
		name.setFont(new Font(Font.DIALOG_INPUT,Font.LAYOUT_RIGHT_TO_LEFT,20));
		add(name);
		
		gend=new JLabel("GENDER");
		gend.setBounds(290, 65, 100, 50);
		gend.setForeground(Color.RED);
		gend.setFont(new Font(Font.DIALOG_INPUT,Font.LAYOUT_RIGHT_TO_LEFT,20));
		add(gend);
		
		state=new JLabel("STATE");
		state.setBounds(390, 65, 100, 50);
		state.setForeground(Color.RED);
		state.setFont(new Font(Font.DIALOG_INPUT,Font.LAYOUT_RIGHT_TO_LEFT,20));
		add(state);
		
		room=new JLabel("ROOM");
		room.setBounds(490, 65, 100, 50);
		room.setForeground(Color.RED);
		room.setFont(new Font(Font.DIALOG_INPUT,Font.LAYOUT_RIGHT_TO_LEFT,20));
		add(room);
		
		time=new JLabel("time");
		time.setBounds(580, 65, 100, 50);
		time.setForeground(Color.RED);
		time.setFont(new Font(Font.DIALOG_INPUT,Font.LAYOUT_RIGHT_TO_LEFT,20));
		add(time);

		desp=new JLabel("DEPOSITE");
		desp.setBounds(665, 65, 100, 50);
		desp.setForeground(Color.RED);
		desp.setFont(new Font(Font.DIALOG_INPUT,Font.LAYOUT_RIGHT_TO_LEFT,20));
		add(desp);


		cust=new JLabel("ALL Customer Data");
		cust.setBounds(100, 0, 400, 50);
		cust.setForeground(Color.BLUE);
		cust.setFont(new Font(Font.DIALOG_INPUT,Font.LAYOUT_RIGHT_TO_LEFT,30));
		add(cust);
		
		bak=new JButton("Back");
		bak.setBounds(30, 250, 100, 50);
		bak.addActionListener(this);
		table.add(bak);
		
		
		
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Reception();
	}

	public static void main(String[] args) {
     new Customer();
	}

}
