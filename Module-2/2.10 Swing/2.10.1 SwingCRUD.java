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

public class SwingCRUD implements ActionListener{
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	

	public SwingCRUD() {
		f=new JFrame("Student Registration");
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(null);
		
		l1=new JLabel("First Name");
		l2=new JLabel("Last Name");
		l3=new JLabel("Email");
		l4=new JLabel("Address");
		l5=new JLabel("Search Eid");
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		
		b1=new JButton("Insert");
		b2=new JButton("Serach");
		b3=new JButton("Update");
		b4=new JButton("Delete");
		
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
		
		b1.setBounds(50, 210, 120, 20);
		b2.setBounds(180, 210, 120, 20);
		b3.setBounds(50, 240, 120, 20);
		b4.setBounds(180, 240, 120, 20);	
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	    b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
	new SwingCRUD();//anonymous object
    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String url="jdbc:mysql://localhost:3306/weekend_20june";
		String username="root";
		String password=null;
	
		if(e.getSource()==b1)
		{
			try
			{
			System.out.println("Insert button is clicked");
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Create connection object
			Connection con=DriverManager.getConnection(url, username, password);
			
			//Write a query to insert data into table
			String qur="insert into emp(fname,lname,email,address)values(?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(qur);
			ps.setString(1, t1.getText());
			ps.setString(2, t2.getText());
			ps.setString(3, t3.getText());
			ps.setString(4, t4.getText());
			
			ps.executeUpdate();
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
			System.out.println("Record inserted successfully");
			
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b2)
		{
			int id=Integer.parseInt(t5.getText());
			try
			{
			System.out.println("Search button is clicked");
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Make a connection
			Connection con=DriverManager.getConnection(url, username, password);
			
			//Write a query
			String qur="select * from emp where eid=?";
			
			//Create a statement
			PreparedStatement ps=con.prepareStatement(qur);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				t1.setText(rs.getString(2));
				t2.setText(rs.getString(3));
				t3.setText(rs.getString(4));
				t4.setText(rs.getString(5));
				
			}
			
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b3)
		{
			int id=Integer.parseInt(t5.getText());
			try
			{
			System.out.println("Update button is clicked");
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Create connection
			Connection con=DriverManager.getConnection(url, username, password);
			
			//write query
			String qur="update emp set fname=?,lname=?,email=?,address=? where eid=?";
			
			//wite a statement
			PreparedStatement ps=con.prepareStatement(qur);
			ps.setString(1, t1.getText());
			ps.setString(2, t2.getText());
			ps.setString(3, t3.getText());
			ps.setString(4, t4.getText());
			ps.setInt(5, id);	
			
			ps.executeUpdate();
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
			System.out.println("Record updated successfully");

			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b4)
		{
			try
			{
			System.out.println("Delete button is clicked");
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
	}

}
