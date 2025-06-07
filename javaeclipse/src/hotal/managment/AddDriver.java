package hotal.managment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddDriver extends JFrame implements ActionListener
{
   JLabel addriver,name,age,exp,car,image;
   JComboBox addriver1,exp1,car1;
   JTextField age1;
   JButton addbutton,cen;
	public AddDriver()
	{
		setBounds(100,50,770,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		addriver=new JLabel("ADD DRIVER");
		addriver.setBounds(250,5,250,50);
		addriver.setFont(new Font(Font.MONOSPACED,Font.LAYOUT_NO_START_CONTEXT,30));
		addriver.setForeground(Color.red);
		add(addriver);
		
		name=new JLabel("ADD DRIVER");
		name.setBounds(10,70,200,30);
		name.setFont(new Font(Font.MONOSPACED,Font.LAYOUT_NO_START_CONTEXT,20));
		add(name);
		
		String str1[]= {"select driver", "Ramash","Surash","Rajesh","rahul"};
		addriver1=new JComboBox(str1);
		addriver1.setBounds(170, 70, 150, 30);
		addriver.setBorder(BorderFactory.createEtchedBorder());
		add(addriver1);
		
		
		age=new JLabel("Driver Age");
		age.setBounds(10,130,200,30);
		age.setFont(new Font(Font.MONOSPACED,Font.LAYOUT_NO_START_CONTEXT,20));
		add(age);
		
		
		age1=new JTextField();
		age1.setBounds(170, 130, 150, 30);
		add(age1);
		
		exp=new JLabel("Experience");
		exp.setBounds(10,190,200,30);
		exp.setFont(new Font(Font.MONOSPACED,Font.LAYOUT_NO_START_CONTEXT,20));
		add(exp);
		
		String str2[]= {"Expericence Driver", "5 year","10 year","20 year","25 year"};
		exp1=new JComboBox(str2);
		exp1.setBounds(170, 190, 150, 30);
		exp1.setBorder(BorderFactory.createEtchedBorder());
		add(exp1);
		
		car=new JLabel("Car Type");
		car.setBounds(10,250,200,30);
		car.setFont(new Font(Font.MONOSPACED,Font.LAYOUT_NO_START_CONTEXT,20));
		add(car);
		
		String str3[]= {"Select car", "Wagnar","Swift","Alto800","Xuv300"};
		car1=new JComboBox(str3);
		car1.setBounds(170, 250, 150, 30);
		car1.setBorder(BorderFactory.createEtchedBorder());
		add(car1);
		
		addbutton=new JButton("ADD");
		addbutton.setBounds(70, 370, 100, 50);
		addbutton.addActionListener(this);
		add(addbutton);
		
		cen=new JButton("Cencel");
		cen.setBounds(200, 370, 100, 50);
		cen.addActionListener(this);
		add(cen);
		
		
		
		ImageIcon x1=new ImageIcon(ClassLoader.getSystemResource("pic5.jpg"));
		Image x2=x1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
		ImageIcon x3=new ImageIcon(x2);
		 image=new JLabel(x3);
		 image.setBounds(360, 60, 370, 300);
		 add(image);
		
		
		setVisible(true);
	}

	
	  public void actionPerformed(ActionEvent co)
	 {
		if(co.getSource()==addbutton) {
			
			String driver_name= (String)addriver1.getSelectedItem();
			String driver_age=age1.getText();
			try {
				int age1=Integer.parseInt(driver_age);
				if(age1<18) {
					JOptionPane.showMessageDialog(null, "sorry your age is not valide");
					return;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			String driver_experience=(String)exp1.getSelectedItem();
			String car_name=(String)car1.getSelectedItem();
			
			try {
				conn con=new conn();
				String str="insert into driver value('"+driver_name+"','"+driver_age+"','"+driver_experience+"','"+car_name+"')";
				con.st.executeUpdate(str);
				JOptionPane.showMessageDialog(null,"driver add succesfully");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else if(co.getSource()==cen) {
			setVisible(false);
			new Dashboard();
		}
	 }
	public static void main(String[] args)
	{
		new AddDriver();
		
	}

}
