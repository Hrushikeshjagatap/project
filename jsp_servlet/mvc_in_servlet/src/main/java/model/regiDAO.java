package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Database_connection.DBAdapter;

public class regiDAO
{
	public boolean insert(regipojo rpojo) throws SQLException
	{
		String name=rpojo.getName();
		String email=rpojo.getEmail();
		String password=rpojo.getPassword();
		String gender=rpojo.getGender();
		String country=rpojo.getCountry();
		long phno=rpojo.getPhno();
		
		Connection con=new DBAdapter().dbconnect();
		
		String sql="insert into register values(?,?,?,?,?,?)";
		
		PreparedStatement pst=con.prepareStatement(sql);
		
		pst.setString(1,name);
		pst.setString(2,email);
		pst.setString(3,password);
		pst.setString(4,gender );
		pst.setString(5, country);
		pst.setLong(6, phno);
		
		int i=pst.executeUpdate();
		
		PreparedStatement pst1=con.prepareStatement("insert into login values(?,?)");
		
		pst1.setString(1, email);
		
		pst1.setString(2, password);
		
		
		int j=pst1.executeUpdate();
		
		if(i>0 && j>0)
			return true;
		else
			return false;
	}
}
