package practice1.DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class SmpleUnitTestCheckprojectInBackEnd {// BackEnd nothing bt database
	
	@Test
	public void projectCheckTest() throws SQLException {
		
		String expectedfirst_Name="sudhir";
		boolean flag=false;
		//step 1:-load /rgister the databasedriver
				Driver driverRef=new Driver();
				
				
				DriverManager.registerDriver(driverRef);
				
				//step 2:-connect the database
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
				
			System.out.println("==============Done========");
				
				//step 3:-create sql statement
			
			Statement stat=conn.createStatement();
			
			
				//step 4:-execute select querry and get result
			ResultSet  resultset=stat.executeQuery("select * from employee_details;");
			while(resultset.next()) {
				
				String actualFirst_Name = resultset.getString(2);
				if(expectedfirst_Name.equals(actualFirst_Name)) {
					flag=true;
					System.out.println(expectedfirst_Name +"is avilable==PASS");
				}
				System.out.println(actualFirst_Name);
			}
			
			if(flag==false) {
				System.out.println(expectedfirst_Name + " is Not avilable==FAIL");
				Assert.fail();
			}
				//step 5:-close the connection
				conn.close();

			}

	}


