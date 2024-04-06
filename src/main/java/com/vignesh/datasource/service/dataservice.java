package com.vignesh.datasource.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dataservice {
	
	@Autowired
	private DataSource data;
	
	public boolean performance() throws SQLException {
		String s="select * from management";
		Connection con=data.getConnection();
		PreparedStatement ps=con.prepareStatement(s);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String dept=rs.getString("dept");
			
			System.out.println(id+" "+name+" "+dept);
		}
		
		
		
		return true;
		
	}

}
