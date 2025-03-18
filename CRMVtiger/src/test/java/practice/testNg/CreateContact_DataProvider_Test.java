package practice.testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DataProvider_Test {

	@Test(dataProvider="getData")
	
	public void createcontacttest(String firstname,String lastName) {
		
		System.out.println("Firstname:"+ firstname +", LastName:"+ lastName);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] objectArr=new Object[3][2];
			
		objectArr[0][0]="deepak";
		objectArr[0][1]="hr";
		
		objectArr[1][0]="sam";
		objectArr[1][1]="sh";
		
		
		objectArr[2][0]="jhon";
		objectArr[2][1]="smith";
		
		return objectArr;
		
	}
}
