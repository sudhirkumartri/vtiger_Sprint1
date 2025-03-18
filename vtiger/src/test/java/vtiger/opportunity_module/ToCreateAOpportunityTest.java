package vtiger.opportunity_module;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vtiger.genericUtility.BaseClass;
import vtiger.genericUtility.IPathConstant;
import vtiger.pomRepo.CampaignInformationPage;
import vtiger.pomRepo.CampaignsPage;
import vtiger.pomRepo.CreatingNewCampaignPage;
import vtiger.pomRepo.CreatingNewOrganizationPage;
import vtiger.pomRepo.CreatingOpportunityPage;
import vtiger.pomRepo.HomePage;
import vtiger.pomRepo.OpportunitiesPage;
import vtiger.pomRepo.OpportunityInformationPage;
import vtiger.pomRepo.OrganizationInformationPage;
import vtiger.pomRepo.OrganizationsPage;
@Listeners(vtiger.genericUtility.ItestListenrsImplementationClass.class)
public class ToCreateAOpportunityTest extends BaseClass{
	
	@Test(retryAnalyzer = vtiger.genericUtility.IRetryAnalyzerImplementationClass.class)
	public void createOpportunityAndVerifyOpportunity() throws EncryptedDocumentException, IOException {
		String organizationName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.ORGANIZATION_SHEET_NAME, 1, 0);
		String campaignName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.CAMPAIGN_SHEET_NAME, 1, 0);
		String opportunityName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.OPPROTUNITY_SHEET_NAME, 1, 0);
		String organizationLookUpPageTitle = eUtils.fetchStringDataFromExcelSheet(IPathConstant.OPPROTUNITY_SHEET_NAME, 1, 1);
		String campaignLookUpPageTitle = eUtils.fetchStringDataFromExcelSheet(IPathConstant.OPPROTUNITY_SHEET_NAME, 1, 2);;
		
		HomePage home = new HomePage(driver);
		OrganizationsPage organization = new OrganizationsPage(driver);
		CreatingNewOrganizationPage createOrganization = new CreatingNewOrganizationPage(driver);
		OrganizationInformationPage organizationInfo = new OrganizationInformationPage(driver);
		
		CampaignsPage campaign = new CampaignsPage(driver);
		CreatingNewCampaignPage createCampaign = new CreatingNewCampaignPage(driver);
		CampaignInformationPage campaignInfo = new CampaignInformationPage(driver);
		
		OpportunitiesPage opportunity = new OpportunitiesPage(driver);
		CreatingOpportunityPage createOpportunity = new CreatingOpportunityPage(driver);
		OpportunityInformationPage opportunityInfo = new OpportunityInformationPage(driver);
		
		home.clickOnOrganizationsModule();
		organization.clickOnAddOrganiaationButton();
		createOrganization.enterOrganizationName(organizationName);
		createOrganization.clickOnSaveButton();
		String actualOrganization = organizationInfo.verifyOrganizationInformation(organizationName);
		
		Assert.assertTrue(actualOrganization.contains(organizationName));
		System.out.println("Pass: The organization has been created");
		
		home.clickOnCampaignModule();
		campaign.clickOnAddCampaignButton();
		createCampaign.enterCampaignName(campaignName);
		createCampaign.clickOnSaveButton();
		String actualCampaign = campaignInfo.verifyCampaignInformation(campaignName);
		
		Assert.assertTrue(actualCampaign.contains(campaignName));
		System.out.println("Pass: The campaign has been created");
		
		home.clickOnOpportunitiesModule();
		opportunity.clickOnAddOpportunitiesButton();
		createOpportunity.enterOpportunityName(opportunityName);
		createOpportunity.selectOrganizationNameFromOrganizationLookUpPage(organizationLookUpPageTitle, organizationName);
		createOpportunity.selectCampaignNameFromCampaignLookUpPage(campaignLookUpPageTitle, campaignName);
		createOpportunity.clickOnSaveButton();
		String actualOpportunity = opportunityInfo.verifyOpportunityInformation(opportunityName);
		
		Assert.assertTrue(actualOpportunity.contains(opportunityName));
		System.out.println("Pass: The opportunity has been created");
	}

}
