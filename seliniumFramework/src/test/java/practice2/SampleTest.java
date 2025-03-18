package practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;



public class SampleTest {

	public static void main(String[] args) throws Throwable {
		//step 1:-load /rgister the databasedriver
		Driver driverRef=new Driver();
		
		
		DriverManager.registerDriver(driverRef);
		
		//step 2:-connect the database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
	System.out.println("==============Done========");
		
		//step 3:-create sql statement
	
	Statement stat=conn.createStatement();
	
	
		//step 4:-execute select querry and get result
	ResultSet  resultset=stat.executeQuery("select * from employee_details");
	while(resultset.next()) {
		System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3));
	}
		//step 5:-close the connection
		conn.close();

	}

}
