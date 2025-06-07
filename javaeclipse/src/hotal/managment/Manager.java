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

public class Manager extends JFrame implements ActionListener
{
   JTable table;
   JLabel age, name,gend,job,sal,phon,emal;
   JButton back;
	public Manager() 
	{
	 setBounds(100,50,750,450);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 
	 table=new JTable();
	 table.setBounds(10, 50, 750, 350);
	 
	 try {
		 conn co=new conn();
		 ResultSet rs=co.st.executeQuery("select * from employee where job='manager'");
		 table.setModel(DbUtils.resultSetToTableModel(rs));
		 
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 
	 add(table);
	 
	 
	 name=new JLabel("Name");
	 	name.setBounds(20, 0, 100, 50);
	 	name.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	name.setForeground(Color.RED);
	 	add(name);
	 	
	 	age=new JLabel("AGE");
	 	age.setBounds(130, 0, 100, 50);
	 	age.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	age.setForeground(Color.RED);
	 	add(age);
	 	
	 	sal=new JLabel("Salary");
	 	sal.setBounds(230, 0, 100, 50);
	 	sal.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	sal.setForeground(Color.RED);
	 	add(sal);
	 	
	 	phon=new JLabel("Phone no");
	 	phon.setBounds(330, 0, 100, 50);
	 	phon.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	phon.setForeground(Color.RED);
	 	add(phon);
	 	
	 	emal=new JLabel("Email ide");
	 	emal.setBounds(440, 0, 100, 50);
	 	emal.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	emal.setForeground(Color.RED);
	 	add(emal);
	 	
	 	gend=new JLabel("Gender");
	 	gend.setBounds(550, 0, 100, 50);
	 	gend.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	gend.setForeground(Color.RED);
	 	add(gend);
	 	
	 	job=new JLabel("JOB");
	 	job.setBounds(650, 0, 100, 50);
	 	job.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	job.setForeground(Color.RED);
	 	add(job);
	 	
	 	back=new JButton("BACK");
	    back.setBounds(100, 310, 100, 50);
	    back.addActionListener(this);
	 	table.add(back);
	 	
	 
	 
	 
	 setVisible(true);
	 
		
	}

	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Reception();
	}
	public static void main(String[] args)
	{
      new Manager();
	}

}
