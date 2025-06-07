package hotal.managment;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CheckOut extends JFrame implements ActionListener
{
	JLabel chek,num,ava,in,out;
	Choice ide;
	JTextField ava1,in1,out1;
	JButton sub,cen;

	public CheckOut()
	{
		setBounds(50,50,750,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		chek=new JLabel("CheckOut");
		chek.setBounds(200, 0, 200, 50);
		chek.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,30));
		chek.setForeground(Color.BLUE);
		add(chek);
		
		
		num=new JLabel("IdeNumber");
		num.setBounds(10, 50, 150, 50);
		num.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(num);
		
		ide=new Choice();
		ide.setBounds(150, 70, 150, 50);
		
        add(ide);
		
        ava=new JLabel("Room NO");
		ava.setBounds(10, 120, 200, 50);
        ava.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
		add(ava);
		
		ava1=new JTextField();
		ava1.setBounds(150,130,150,30);
		add(ava1);
		
		 in=new JLabel("Check_In");
			in.setBounds(10, 190, 150, 50);
	        in.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
			add(in);
			
			in1=new JTextField();
			in1.setBounds(150,205,180,30);
			add(in1);
			
			 out=new JLabel("Check_Out");
				out.setBounds(10, 270, 150, 50);
		        out.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
				add(out);
				
				Date date=new Date();
				out1=new JTextField(""+date);
				out1.setBounds(150,285,170,30);
				add(out1);
				
				sub=new JButton("Submit");
				sub.setBounds(20, 350, 100, 50);
				sub.setBackground(Color.BLACK);
				sub.setForeground(Color.WHITE);
				sub.addActionListener(this);
				sub.setBorder(BorderFactory.createRaisedBevelBorder());
				add(sub);

				cen=new JButton("Cencel");
				cen.setBounds(150, 350, 100, 50);
				cen.setBackground(Color.BLACK);
				cen.setForeground(Color.WHITE);
				cen.addActionListener(this);
				cen.setBorder(BorderFactory.createRaisedBevelBorder());
				add(cen);
				
				try {
					conn co=new conn();
					ResultSet rs=co.st.executeQuery("select * from customer");
					while(rs.next()) {
						ide.add(rs.getString("NUMBER"));
						ava1.setText(rs.getString("custmer_room"));
						in1.setText(rs.getString("in_time"));
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
		
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==sub) {
			String query1="delete from customer where NUMBER='"+ide.getSelectedItem()+"'";
			String query2="Update room set avability='Aviable' where roomnumber='"+ava1.getText()+"'";
			
			try {
				conn con=new conn();
				con.st.executeQuery(query1);
				con.st.executeQuery(query2);
				JOptionPane.showMessageDialog(null, "Check Out done");

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

		new CheckOut();
	}

}
