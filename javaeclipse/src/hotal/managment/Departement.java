package hotal.managment;

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

public class Departement extends JFrame implements ActionListener
{
  JTable table;
  JLabel dep,bug,depat;
  JButton back;
	public Departement() 
	{
	 setBounds(100,50,600,450);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 
	 table=new JTable();
	 table.setBounds(10, 120, 600, 450);
	 
	 try {
		 conn co=new conn();
		 ResultSet rs=co.st.executeQuery("   select * from departement");
		 table.setModel(DbUtils.resultSetToTableModel(rs));
		 
	 }catch(Exception e) {
		e.printStackTrace(); 
	 }
	 
	 
	 add(table);
	 dep=new JLabel("Departement");
	 dep.setBounds(5, 75, 250, 50);
	 dep.setForeground(Color.RED);
	 dep.setBackground(Color.BLACK);
	 dep.setFont(new Font(Font.DIALOG_INPUT,Font.HANGING_BASELINE,30));
	 add(dep);
	 
	 bug=new JLabel("Buget");
	 bug.setBounds(330, 75, 250, 50);
	 bug.setForeground(Color.RED);
	 bug.setBackground(Color.BLACK);
	 bug.setFont(new Font(Font.DIALOG_INPUT,Font.HANGING_BASELINE,30));
	 add(bug);
	 
	 back=new JButton("Back");
	 back.setBounds(100, 240, 130, 50);
	 back.setFont(new Font(Font.DIALOG_INPUT,Font.HANGING_BASELINE,30));
	 back.setBackground(Color.black);
	 back.setForeground(Color.WHITE);
	 back.addActionListener(this);
	 table.add(back);
	 
	 depat=new JLabel("ALL Department");
	 depat.setBounds(150, 0, 250, 50);
	 depat.setFont(new Font(Font.SERIF,Font.ITALIC,30));
	 depat.setForeground(Color.BLUE);
	 add(depat);

	 setVisible(true);
	}
  
	public void actionPerformed(ActionEvent ac) {

		setVisible(false);
		new Reception();
	}
	public static void main(String[] args)
	{
		new Departement();
	}

}
