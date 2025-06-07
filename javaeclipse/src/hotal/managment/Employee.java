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

public class Employee extends JFrame implements ActionListener
{
 JTable table;
 JLabel age, name,gend,job,sal,phon,emal,emp;
 JButton back;
	public Employee()
	{
	 	setBounds(50,50,750,450);
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	setLayout(null);
	 	
	 	table=new JTable();
	 	table.setBounds(0, 100, 750, 380);
	 	
	 	try {
	 		conn co=new conn();
	 		ResultSet rs=co.st.executeQuery("select * from employee");
	 		table.setModel(DbUtils.resultSetToTableModel(rs));
	 		
	 		
	 	}catch(Exception e) {
	 		e.printStackTrace();
	 	}
	 	
	 	add(table);
	 	
	 	name=new JLabel("Name");
	 	name.setBounds(5, 65, 100, 50);
	 	name.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	name.setForeground(Color.RED);
	 	add(name);
	 	
	 	age=new JLabel("AGE");
	 	age.setBounds(120, 65, 100, 50);
	 	age.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	age.setForeground(Color.RED);
	 	add(age);
	 	
	 	sal=new JLabel("Salary");
	 	sal.setBounds(220, 65, 100, 50);
	 	sal.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	sal.setForeground(Color.RED);
	 	add(sal);
	 	
	 	phon=new JLabel("Phone no");
	 	phon.setBounds(320, 65, 100, 50);
	 	phon.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	phon.setForeground(Color.RED);
	 	add(phon);
	 	
	 	emal=new JLabel("Email ide");
	 	emal.setBounds(430, 65, 100, 50);
	 	emal.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	emal.setForeground(Color.RED);
	 	add(emal);
	 	
	 	gend=new JLabel("Gender");
	 	gend.setBounds(540, 65, 100, 50);
	 	gend.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	gend.setForeground(Color.RED);
	 	add(gend);
	 	
	 	job=new JLabel("JOB");
	 	job.setBounds(640, 65, 100, 50);
	 	job.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
	 	job.setForeground(Color.RED);
	 	add(job);
	 	
	 	emp=new JLabel("ALL Employee Data");
	 	emp.setBounds(100, 0, 300, 50);
	 	emp.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,30));
	 	emp.setForeground(Color.BLUE);
	 	add(emp);
	 	
	 	back=new JButton("BACK");
	    back.setBounds(100, 260, 100, 50);
	    back.addActionListener(this);
	 	table.add(back);
	 	
	 	setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ac)
	{
	
		setVisible(false);
		new Reception();
	}

	public static void main(String[] args) {

		new Employee();
	}

}
