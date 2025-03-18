package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import vtiger.genericUtility.IPathConstant;

public class FetchDataFomDataBase {

	public static void main(String[] args) throws SQLException {
		//Create Object of DataBase Driver
		Driver dbdriver = new Driver();
		//Register Driver
		DriverManager.registerDriver(dbdriver);
		//Get Connection
		Connection connection = DriverManager.getConnection(IPathConstant.DB_URL, IPathConstant.DB_USERNAME, IPathConstant.DB_PASSWORD);
		//Write Querry
		ResultSet result = connection.createStatement().executeQuery("select * from lead;");
		//Print Result
		if(result.next()) {
			System.out.println(result.getString(2));
		}
		//close Data Base
		connection.close();

	}

}
