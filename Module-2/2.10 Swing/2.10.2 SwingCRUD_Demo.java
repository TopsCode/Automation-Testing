package com.fundamentals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCRUD_Demo implements ActionListener {
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4,b5;
	

public SwingCRUD_Demo() {
	f=new JFrame("Student Registration");
	f.setSize(400, 400);
	f.setVisible(true);
	f.setLayout(null);
	
	l1=new JLabel("SID");
	l2=new JLabel("FIRST NAME");
	l3=new JLabel("LAST NAME");
	l4=new JLabel("EMAIL");
	l5=new JLabel("ADDRESS");
	
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	
	b1=new JButton("Insert");
	b2=new JButton("Search");
	b3=new JButton("Update");
	b4=new JButton("Delete");
	b5=new JButton("Reset");
	
	
	
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(l5);
	
	
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);
	f.add(t5);
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	
	
	l1.setBounds(50, 50, 120, 20);
	l2.setBounds(50, 80, 120, 20);
	l3.setBounds(50, 110, 120, 20);
	l4.setBounds(50, 140, 120, 20);
	l5.setBounds(50, 170, 120, 20);
	
	t1.setBounds(120, 50, 120, 20);
	t2.setBounds(120, 80, 120, 20);
	t3.setBounds(120, 110, 120, 20);
	t4.setBounds(120, 140, 120, 20);
	t5.setBounds(120, 170, 120, 20);
	
	b1.setBounds(50, 200, 120, 20);
	b2.setBounds(200, 200, 120, 20);
	b3.setBounds(50, 230, 120, 20);
	b4.setBounds(200, 230, 120, 20);
	b5.setBounds(120,260,120,20);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	
}
	public static void main(String[] args) {
	new SwingCRUD_Demo();//anonymous object
	

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String url="jdbc:mysql://localhost:3306/weekend_22sep";
		String username="root";
		String password=null;
		
		if(e.getSource()==b1)
		{
			System.out.println("Insert button clicked");
			try 
			{
				//load the driver for mysql
				Class.forName("com.mysql.jdbc.Driver");
				
				//make a connection with database
				Connection con=DriverManager.getConnection(url, username, password);
				
				//write a querry
				String qur="insert into student(fname,lname,email,address)values(?,?,?,?)";
				
				//Statement in jdbc
				PreparedStatement ps=con.prepareStatement(qur);
				
				ps.setString(1, t2.getText());
				ps.setString(2, t3.getText());
				ps.setString(3, t4.getText());
				ps.setString(4, t5.getText());
				
				ps.executeUpdate();
				System.out.println("Record inserted successfully");
			} 
			catch (Exception ex) {
				
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b2)
		{
			System.out.println("Search button clicked");
			int id=Integer.parseInt(t1.getText());
			
			try
			{
				//load the driver for mysql
				Class.forName("com.mysql.jdbc.Driver");
				
				//make a connection with database
				Connection con=DriverManager.getConnection(url, username, password);
				
				//write query
				String qur="select *from student where sid=?";
				
				//Statement
				PreparedStatement ps=con.prepareStatement(qur);
				ps.setInt(1, id);
				
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					t2.setText(rs.getString(2));
					t3.setText(rs.getString(3));
					t4.setText(rs.getString(4));
					t5.setText(rs.getString(5));
				}
				
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
		else if(e.getSource()==b3)
		{
			System.out.println("Update button cliked");
			int id=Integer.parseInt(t1.getText());
			try
			{
				//load the driver for mysql
				Class.forName("com.mysql.jdbc.Driver");
				
				//make a connection with database
				Connection con=DriverManager.getConnection(url, username, password);
				
				//write query
				String qur="update student set fname=?,lname=?,email=?,address=? where sid=?";
				
				//Statement
				PreparedStatement ps=con.prepareStatement(qur);
				ps.setString(1, t2.getText());
				ps.setString(2, t3.getText());
				ps.setString(3, t4.getText());
				ps.setString(4, t5.getText());
				ps.setInt(5, id);
				
				ps.executeUpdate();
				System.out.println("Record updated successfully");
				
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			
			
		}
		else if(e.getSource()==b4)
		{
			System.out.println("Delete button clicked");
			int id=Integer.parseInt(t1.getText());
			try
			{
				//load the driver for mysql
				Class.forName("com.mysql.jdbc.Driver");
				
				//make a connection with database
				Connection con=DriverManager.getConnection(url, username, password);
				
				//write query
				String qur="delete from student where sid=?";
				
				//Statement
				PreparedStatement ps=con.prepareStatement(qur);
				ps.setInt(1, id);
				
				ps.executeUpdate();
				System.out.println("Record deleted successfully");
				
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b5)
		{
			System.out.println("Reset button cliked");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
		}
	
	}

}
