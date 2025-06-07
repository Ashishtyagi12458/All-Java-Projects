package hotal.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Dashboard extends JFrame implements ActionListener
{

	public Dashboard()
	{
		setBounds(0,0,880,580);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("123.jpg"));
		Image i2 = i1.getImage().getScaledInstance(880, 520,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image= new JLabel(i3);
		image.setBounds(0, 0, 880, 580);
		add(image);
		
		JLabel text=new JLabel("WELCOME TO OUR HOTEL");
		text.setBounds(100, 40, 550, 70);
		text.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,40));
		text.setForeground(Color.RED);
		image.add(text);
	
		
		JMenuBar ma=new JMenuBar();
		ma.setBounds(0, 0, 880, 30);
		image.add(ma);
		
		JMenu hotal=new JMenu("management");
		hotal.setForeground(Color.RED);
		hotal.setBorder(BorderFactory.createEtchedBorder());
		ma.add(hotal);
		

		JMenu me=new JMenu("Admin");
		me.setBounds(220, 0, 150, 30);
		me.setForeground(Color.RED);
		me.setBorder(BorderFactory.createEtchedBorder());
		ma.add(me);
		
		JMenuItem re=new JMenuItem("reception");
		re.addActionListener(this);
		hotal.add(re);
		
		JMenuItem em=new JMenuItem("Add Employee");
		em.addActionListener(this);
		me.add(em);
		
		JMenuItem ru=new JMenuItem("Add Room");
		ru.addActionListener(this);
		me.add(ru);
		
		JMenuItem dr=new JMenuItem("Add Driver");
		dr.addActionListener(this);
		me.add(dr);

		setVisible(true);
	}

	
	  public void actionPerformed(ActionEvent ac)
	  {
		  if(ac.getActionCommand().equals("Add Employee"))
		  {
			  new AddEmployee();
		  }else if(ac.getActionCommand().equals("Add Room")) {
			  new AddRoom();
		  }else if(ac.getActionCommand().equals("Add Driver")) {
			  new AddDriver();
		  }else if (ac.getActionCommand().equals("reception")) {
			  new Reception();
		  }
	  }
	public static void main(String[] args) 
	{
		new Dashboard();
	}

}
