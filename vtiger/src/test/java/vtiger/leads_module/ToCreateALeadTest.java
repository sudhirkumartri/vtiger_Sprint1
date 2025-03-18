package vtiger.leads_module;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vtiger.genericUtility.BaseClass;
import vtiger.genericUtility.IPathConstant;
import vtiger.pomRepo.CreatingNewLeadPage;
import vtiger.pomRepo.HomePage;
import vtiger.pomRepo.LeadInformationPage;
import vtiger.pomRepo.LeadsPage;
@Listeners(vtiger.genericUtility.ItestListenrsImplementationClass.class)
public class ToCreateALeadTest extends BaseClass {
	
	@Test(retryAnalyzer = vtiger.genericUtility.IRetryAnalyzerImplementationClass.class)
	public void toCreateALeadAndVerifyTheLeadInformationTest() throws EncryptedDocumentException, IOException {
		String leadSalutation = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME, 1, 0);
		String leadFirstName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME, 1, 1);
		String leadLastName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME, 1, 2);
		String leadCompanyName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEET_NAME, 1, 3);
		
		HomePage home = new HomePage(driver);
		LeadsPage leads = new LeadsPage(driver);
		CreatingNewLeadPage createLeads = new CreatingNewLeadPage(driver);
		LeadInformationPage leadInfo = new LeadInformationPage(driver);
		
		home.ClickOnLeadModule();
		leads.clickOnAddLeadButton();
		createLeads.selectFromLeadSalutationDropDown(leadSalutation);
		createLeads.enterLeadFirstName(leadFirstName);
		createLeads.enterleadLastName(leadLastName);
		createLeads.enterLeadCompanyName(leadCompanyName);
		createLeads.clickOnSaveButton();
		Assert.fail();
		String actualLeadInfo = leadInfo.verifyLeadInformation(leadFirstName, leadLastName);
		
		Assert.assertTrue(actualLeadInfo.contains(leadLastName));
		System.out.println("Pass: The lead has been created");

		
		
	}

}
