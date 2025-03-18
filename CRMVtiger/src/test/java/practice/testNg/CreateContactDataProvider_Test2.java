package practice.testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContactDataProvider_Test2 {
	
	

	@Test(dataProvider="getData")
	
	public void createcontacttest(String firstname,String lastName, Long phoneNumber) {
		
		System.out.println("Firstname:"+ firstname +", LastName:"+ lastName+", phoneNumber:"+phoneNumber);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] objectArr=new Object[3][3];
			
		objectArr[0][0]="deepak";
		objectArr[0][1]="hr";
		objectArr[0][2]=8969669799l;
		
		objectArr[1][0]="sam";
		objectArr[1][1]="sh";
		objectArr[1][2]=7969669695l;
		
		objectArr[2][0]="jhon";
		objectArr[2][1]="smith";
		objectArr[2][2]=6969669693l;
		return objectArr;
		
	}
	

}
