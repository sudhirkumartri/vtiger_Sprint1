package com.comcast.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	
	Connection con;// we declare the connection globaly so that in other method i can close the connection 
	
	public void getDbconnection(String url, String username, String password) throws SQLException {
		try {
		Driver driver=new Driver();
		
		DriverManager.registerDriver(driver);
		
		con=DriverManager.getConnection(url,username,password);
		} catch(Exception e) {
			
		}
	}
	 
	// here hardcode the url, username, password which is ExecutenonSelectQuery class
	public void getDbconnection() throws SQLException {
		try {
		Driver driver=new Driver();
		
		DriverManager.registerDriver(driver);
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		} catch(Exception e) {
			
		}
	}
	
	public void closeDbconnection() throws SQLException {
		try {
		con.close();
		} catch(Exception e) {
			
		}
	}
	
	
	public ResultSet executeConSelectQuerry(String querry) throws SQLException {
		ResultSet result=null;
		try {
		 Statement stat = con.createStatement();
		 result = stat.executeQuery(querry);
		} catch(Exception e) {
			
		}
		 return result;
	}
	
	public int executeNonselectQuery(String query) {
		int result=0;
		try {
			 Statement stat = con.createStatement();
			 result = stat.executeUpdate(query);
			} catch(Exception e) {
				
			}
		return result;
		
	}
}
