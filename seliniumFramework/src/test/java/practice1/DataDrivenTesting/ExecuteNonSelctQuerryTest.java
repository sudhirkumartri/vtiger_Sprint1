package practice1.DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteNonSelctQuerryTest {
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
	
	int result = stat.executeUpdate("insert into employee_details values('12','sudhir','tripathi',28,'test','150000.00','2025-06-12');");
	System.out.println(result);
	
		//step 5:-close the connection
		conn.close();

	}


}
