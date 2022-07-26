package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Database_connection.DBAdapter;

public class loginDAO 
{
	public String check(loginpojo lpojo) throws SQLException
	{
		
		String username=lpojo.getUsername();
		String password=lpojo.getPassword();
		
		Connection con= new DBAdapter().dbconnect();
		
		String sql="select * from login where username=? and password=?";
		
		PreparedStatement pst=con.prepareStatement(sql);
		
		pst.setString(1, username);
		pst.setString(2, password);
		
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
		return "Sucess";
		}
		else
		{
			return "error";
		}
	}
}
