package hotal.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class SerchingRoom extends JFrame implements ActionListener
{
	JTable table;
	JLabel room,num,cel,ava,pri,type,ty;
	JComboBox type1;
	JCheckBox av;
	JButton sub,cen;


	public SerchingRoom()
	{
		setBounds(50,50,850,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		table=new JTable();
		table.setBounds(5, 150, 850, 400);

		try {
			conn co=new conn();
			ResultSet rs=co.st.executeQuery("select * from room");
			table.setModel(DbUtils.resultSetToTableModel(rs));
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		add(table);
		
		room=new JLabel("SEARCH ROOM");
		room.setBounds(300, -10, 200, 50);
		room.setFont(new Font (Font.DIALOG_INPUT,Font.ROMAN_BASELINE,30));
		room.setForeground(Color.BLUE);
		add(room);
		
		ty=new JLabel("BED_TYPE");
		ty.setBounds(10, 40, 200, 50);
		ty.setFont(new Font (Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
		ty.setForeground(Color.BLUE);
		add(ty);
		

		 String str1[]= {"select bed","Single Bed","Duble Bed"};
		 type1=new JComboBox(str1);
		 type1.setBounds(140,50,150,30);
		 add(type1);
		 
		 av=new JCheckBox("AVAILIBLE ROOM");
		 av.setBounds(500, 40, 250, 50);
		 av.setFont(new Font (Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
	     av.setForeground(Color.BLUE);

		 add(av);

		 
				 
		 num=new JLabel("Room Number");
		 num.setBounds(10, 110, 200, 50);
		 num.setForeground(Color.RED);
		 num.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
		 add(num);
		
		 ava=new JLabel("Available");
		 ava.setBounds(190, 110, 150, 50);
		 ava.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
		 ava.setForeground(Color.RED);
		 add(ava);
		 
		 cel=new JLabel("Clean Status");
		 cel.setBounds(350, 110, 200, 50);
		 cel.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
		 cel.setForeground(Color.RED);
		 add(cel);
		 
		 pri=new JLabel("Room price");
		 pri.setBounds(520, 110, 150, 50);
		 pri.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
		 pri.setForeground(Color.RED);
		 add(pri);
		 
		 type=new JLabel("Bed Type");
		 type.setBounds(690, 120, 150, 30);
		 type.setFont(new Font(Font.DIALOG_INPUT,Font.ROMAN_BASELINE,20));
		 type.setForeground(Color.RED);
		 add(type);
		 
		 sub=new JButton("Submit");
		 sub.setBounds(200, 260, 100, 50);
		 sub.addActionListener(this);
		table.add(sub);
		
		cen=new JButton("Cencel");
		 cen.setBounds(80, 260, 100, 50);
		 cen.addActionListener(this);
		table.add(cen);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ac) {
		if(ac.getSource()==sub) {
		
		try {
			String query1="select * from room where bedtype='"+type1.getSelectedItem()+"'";
			String query2="select *from room where avability='Aviable'and bedtype='"+type1.getSelectedItem()+"'";
		conn con=new conn();
		ResultSet rs;
		if(av.isSelected()) {
			rs=con.st.executeQuery(query2);
		}else  {
			rs=con.st.executeQuery(query1);
		}
		table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e) {
			e.printStackTrace();
		}
		}else if(ac.getSource()==cen) {
			setVisible(false);
			new Reception();
		}
		
	}

	public static void main(String[] args) {

		new SerchingRoom();
	}

}
