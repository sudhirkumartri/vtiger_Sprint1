package practice1.DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteSelectQuerryTest {
	public static void main(String[] args) throws Throwable {
		
		Connection conn=null;
		try {
		//step 1:-load /rgister the databasedriver
		Driver driverRef=new Driver();
		
		
		DriverManager.registerDriver(driverRef);
		
		//step 2:-connect the database
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
	System.out.println("==============Done========");
		
		//step 3:-create sql statement
	
	Statement stat=conn.createStatement();
	
		//step 4:-execute select querry and get result
	ResultSet  resultset=stat.executeQuery("select * from employee_details");
	while(resultset.next()) {
		System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3));
	}
		}catch(Exception e) {
			System.out.println("handle any type of exception");
			
		}finally {

			//step 5:-close the connection
			conn.close();
			System.err.println("===========close the connection=========");

		}
		
		
	}


}
