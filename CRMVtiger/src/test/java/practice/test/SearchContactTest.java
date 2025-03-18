package practice.test;

import org.testng.annotations.Test;

import com.cast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.basetest.BaseClass;

/**
 * test class Contact module
 * @author Sudhir
 * 
 */
public class SearchContactTest extends BaseClass {
	/**
	 * 
	 * scenario:login()==>navigateContct==>createcontact()==verify
	 */
	@Test
	public void searchcontactTest() {
		 /*step 1:login to app */
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp("url", "username","password");
	}
	

}
