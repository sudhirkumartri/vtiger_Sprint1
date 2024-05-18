package vtiger.leads_module;

import org.testng.Assert;
import org.testng.annotations.Test;

import vitiger.GenericUtility.BaseClass;
import vitiger.GenericUtility.IpathConstant;
import vtiger.pomRepo.CreatingNewLeadPage;
import vtiger.pomRepo.HomePage;
import vtiger.pomRepo.LeadInformationPage;
import vtiger.pomRepo.LeadsPage;

public class ToCreateALeadpage extends BaseClass {

	@Test
	public void toCreateALeadAndToVerifyTheLeadinformationTest() throws Exception {
		String leadSalutation = eUtils.fetchStringDataFromExcelSheet(IpathConstant.LEAD_SHEAT_NAME, 1, 0);
		String leadFirstName = eUtils.fetchStringDataFromExcelSheet(IpathConstant.LEAD_SHEAT_NAME, 1, 1);
		String leadLastName = eUtils.fetchStringDataFromExcelSheet(IpathConstant.LEAD_SHEAT_NAME, 1, 2);
		String leadCompanyName = eUtils.fetchStringDataFromExcelSheet(IpathConstant.LEAD_SHEAT_NAME, 1, 3);

		HomePage home = new HomePage(driver);
		LeadsPage leads = new LeadsPage(driver);
		CreatingNewLeadPage createLeads = new CreatingNewLeadPage(driver);
		LeadInformationPage leadInfo = new LeadInformationPage(driver);
		
		home.ClickOnLeadModule();
		leads.clickOnAddLeadButton();
		createLeads.selectFromSalutationDropdown(leadSalutation);
		createLeads.enterLeadFirstName(leadFirstName);
		createLeads.enterLeadLastName(leadLastName);
		createLeads.enterLeadCompanyName(leadCompanyName);
		createLeads.clickOnSaveButton();
		
		String actualLeadInfo = leadInfo.verifyLeadInformation(leadFirstName, leadLastName);
		
		Assert.assertTrue(actualLeadInfo.contains(leadLastName));
		System.out.println("Pass: the lead has been created");
		
	}

}
