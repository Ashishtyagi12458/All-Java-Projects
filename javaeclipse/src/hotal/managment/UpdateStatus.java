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

public class UpdateStatus extends JFrame implements ActionListener
{

	JLabel upd,id,room,name,checkin,amou,pand,image;
	Choice num;
	JTextField room1,name1,checkin1,amou1,pand1;
	JButton updat,chek,back;
	public UpdateStatus()
	{
	
		setBounds(50,50,780,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		upd=new JLabel("Update Status");
		upd.setBounds(200, 0, 300, 50);
		upd.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,30));
		upd.setForeground(Color.BLUE);
		add(upd);
		
		id=new JLabel("Customer ide");
		id.setBounds(10, 50, 150, 50);
		id.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
		add(id);
		
		num=new Choice();
		num.setBounds(200, 70, 150, 60);
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
		
		room=new JLabel("Room No");
		room.setBounds(10, 100, 150, 50);
		room.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
		add(room);
		
		room1=new JTextField();
		room1.setBounds(200, 110, 150, 30);
        add(room1);	
        

		name=new JLabel("Name");
		name.setBounds(10, 150, 150, 50);
		name.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
		add(name);
		
		name1=new JTextField();
		name1.setBounds(200, 160, 150, 30);
        add(name1);	
        
		checkin=new JLabel("Check_in");
		checkin.setBounds(10, 200, 150, 50);
		checkin.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
		add(checkin);
		
		checkin1=new JTextField();
		checkin1.setBounds(200, 210, 150, 30);
        add(checkin1);	
        
        amou=new JLabel("Amount Paid");
        amou.setBounds(10, 250, 150, 50);
        amou.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
		add(amou);
		
		amou1=new JTextField();
		amou1.setBounds(200, 260, 150, 30);
        add(amou1);	
        
        pand=new JLabel("Pending Amount");
        pand.setBounds(10, 300, 200, 50);
        pand.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,20));
		add(pand);
		
		pand1=new JTextField();
		pand1.setBounds(200, 310, 150, 30);
        add(pand1);	
        
        updat=new JButton("Update");
        updat.setBounds(220, 400, 80, 50);
        updat.setBackground(Color.BLACK);
        updat.setForeground(Color.WHITE);
        updat.addActionListener(this);
        add(updat);

        chek=new JButton("Check");
        chek.setBounds(120, 400, 80, 50);
        chek.setBackground(Color.BLACK);
        chek.setForeground(Color.WHITE);
        chek.addActionListener(this);
        add(chek);

        back=new JButton("Back");
        back.setBounds(20, 400, 80, 50);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon x1=new ImageIcon(ClassLoader.getSystemResource("pic9.jpg"));
        Image x2=x1.getImage().getScaledInstance(350, 380, Image.SCALE_DEFAULT);
        ImageIcon x3=new ImageIcon(x2);
        image=new JLabel(x3);
        image.setBounds(380, 20, 400, 400);
        add(image);
       
		
		
		
		
		setVisible(true);	
	}

	public void actionPerformed(ActionEvent ac) {
		if(ac.getSource()==chek) {
		String id=num.getSelectedItem();
		String query1="select * from customer where NUMBER='"+id+"'";
		
		try {
			conn co=new conn();
			ResultSet rs=co.st.executeQuery(query1);
			while(rs.next()) {
				room1.setText(rs.getString("custmer_room"));
				name1.setText(rs.getString("custmer_name"));
				checkin1.setText(rs.getString("in_time"));
				amou1.setText(rs.getString("Deposite"));
				
			}
			
			ResultSet rs2=co.st.executeQuery("select * from room where roomnumber='"+room1.getText()+"'");
			while(rs2.next()) {
				String price=rs2.getString("price");
				int amountpade=Integer.parseInt(price)-Integer.parseInt(amou1.getText());
				pand1.setText(""+amountpade);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		}else if(ac.getSource()==updat) {
			
			String Number=num.getSelectedItem();
			String room=room1.getText();
			String name=name1.getText();
			String Check=checkin1.getText();
			String diposite=amou1.getText();
			
			try {
			conn con=new conn();
			con.st.executeUpdate("Update customer set custmer_room='"+room+"',custmer_name='"+name+"',in_time='"+Check+"',Deposite='"+diposite+"'");
			JOptionPane.showMessageDialog(null, "recoard add seccussfuly");
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
	public static void main(String[] args)
	{

		new UpdateStatus();
	}

}
