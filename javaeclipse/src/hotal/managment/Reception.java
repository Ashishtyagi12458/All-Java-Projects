package hotal.managment;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Reception extends JFrame implements ActionListener
{
  JButton custform,room,depart,empl,custinfo,managinfo,check,upstatus,uproom,pick,serchroom,log;
  ImageIcon image;
	public Reception()
	{
		setBounds(50,50,880,550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		custform=new JButton("New Customer form");
		custform.setBounds(10, 20, 170, 30);
		custform.setBackground(Color.black);
		custform.setForeground(Color.white);
		custform.addActionListener(this);
		add(custform);
		
		room=new JButton("ROOM");
		room.setBounds(10, 60, 150, 30);
		room.setBackground(Color.black);
		room.setForeground(Color.white);
		room.addActionListener(this);
		add(room);
		
		depart=new JButton("Departement");
		depart.setBounds(10, 100, 150, 30);
		depart.setBackground(Color.black);
		depart.setForeground(Color.white);
		depart.addActionListener(this);
		add(depart);
		
		empl=new JButton("All Employess");
		empl.setBounds(10, 140, 150, 30);
		empl.setBackground(Color.black);
		empl.setForeground(Color.white);
		empl.addActionListener(this);
		add(empl);
		
		custinfo=new JButton("Custmor Infomation");
		custinfo.setBounds(10, 180, 150, 30);
		custinfo.setBackground(Color.black);
		custinfo.setForeground(Color.white);
		custinfo.addActionListener(this);
		add(custinfo);
		
		managinfo=new JButton("Manager information");
		managinfo.setBounds(10, 220, 155, 30);
		managinfo.setBackground(Color.black);
		managinfo.setForeground(Color.white);
		managinfo.addActionListener(this);
		add(managinfo);

		check=new JButton("Check Out");
		check.setBounds(10, 260, 155, 30);
		check.setBackground(Color.black);
		check.setForeground(Color.white);
		check.addActionListener(this);
		add(check);
		
		upstatus=new JButton("Update Status");
		upstatus.setBounds(10, 300, 155, 30);
		upstatus.setBackground(Color.black);
		upstatus.setForeground(Color.white);
		upstatus.addActionListener(this);
		add(upstatus);

		uproom=new JButton("Update Room Status");
		uproom.setBounds(10, 340, 155, 30);
		uproom.setBackground(Color.black);
		uproom.setForeground(Color.white);
		uproom.addActionListener(this);
		add(uproom);
		
		pick=new JButton("Pickup Servius ");
		pick.setBounds(10, 380, 155, 30);
		pick.setBackground(Color.black);
		pick.setForeground(Color.white);
		pick.addActionListener(this);
		add(pick);
		
		serchroom=new JButton("Search Room ");
		serchroom.setBounds(10, 420, 155, 30);
		serchroom.setBackground(Color.black);
		serchroom.setForeground(Color.white);
		serchroom.addActionListener(this);
		add(serchroom);


		log=new JButton("BACK ");
		log.setBounds(10, 460, 155, 30);
		log.setBackground(Color.black);
		log.setForeground(Color.white);
		log.addActionListener(this);
		add(log);
      
		ImageIcon x1=new ImageIcon(ClassLoader.getSystemResource("pic6.jpg"));
		Image x2=x1.getImage().getScaledInstance(800, 680, Image.SCALE_DEFAULT);
		ImageIcon x3=new ImageIcon(x2);
		JLabel image=new JLabel(x3);
		image.setBounds(180, 10, 750, 500);
		add(image);
		
	
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ac) {
		if(ac.getSource()==custform) {
			setVisible(false);
			new AddCustomer();
		}else if(ac.getSource()==room) {
			setVisible(false);
			new Room();	
		}else if(ac.getSource()==depart) {
			setVisible(false);
			new Departement();
		}else if(ac.getSource()==empl) {
			setVisible(false);
			new Employee();
		}else if(ac.getSource()==custinfo) {
			setVisible(false);
			new Customer();
		}else if(ac.getSource()==managinfo) {
			setVisible(false);
			new Manager();
		}else if(ac.getSource()==check) {
			setVisible(false);
			new CheckOut();
		}else if(ac.getSource()==upstatus) {
			setVisible(false);
			new UpdateStatus();
		}else if(ac.getSource()==uproom) {
			setVisible(false);
			new UpdateRoom();
		}else if(ac.getSource()==pick) {
			setVisible(false);
			new PickupService();
		}else if(ac.getSource()==serchroom) {
			setVisible(false);
			new SerchingRoom();

		}else {
			setVisible(false);
			new Dashboard();
		}
		
	}

	public static void main(String[] args)
	{
     new Reception();
	}

}
