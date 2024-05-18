package vtiger.opportunity_module;

import org.testng.Assert;
import org.testng.annotations.Test;

import vitiger.GenericUtility.BaseClass;
import vitiger.GenericUtility.IpathConstant;
import vtiger.pomRepo.CampaignInformationPage;
import vtiger.pomRepo.CampaignPage;
import vtiger.pomRepo.CreatingNewCampaignPage;
import vtiger.pomRepo.CreatingNewOpoortunity;
import vtiger.pomRepo.CreatingNewOrganizationPage;
import vtiger.pomRepo.HomePage;
import vtiger.pomRepo.OpotunityInformationPage;
import vtiger.pomRepo.OpotunityPage;
import vtiger.pomRepo.OrganizationInformationPage;
import vtiger.pomRepo.OrganizationPage;

public class ToCreateOpportunityTest extends BaseClass {

	@Test(retryAnalyzer = vitiger.GenericUtility.IRetryAnalyzerImplementationClass.class)
	public void createOpportunityAndVerifyOpportunity() throws Exception {

		String organizationName = eUtils.fetchStringDataFromExcelSheet(IpathConstant.ORGANIZATION_SHEAT_NAME, 1, 0);
		String campaignName = eUtils.fetchStringDataFromExcelSheet(IpathConstant.CAMPAIGN_SHEAT_NAME, 1, 0);
		String opportunityName = eUtils.fetchStringDataFromExcelSheet(IpathConstant.OPPORTUNITY_SHEAT_NAME, 1, 0);
		String organizationLookUpPageTitle = eUtils.fetchStringDataFromExcelSheet(IpathConstant.OPPORTUNITY_SHEAT_NAME,
				1, 1);
		String campaignLookUpPageTitle = eUtils.fetchStringDataFromExcelSheet(IpathConstant.OPPORTUNITY_SHEAT_NAME, 1,
				2);

		HomePage home = new HomePage(driver);
		OrganizationPage organization = new OrganizationPage(driver);
		CreatingNewOrganizationPage createOrganization = new CreatingNewOrganizationPage(driver);
		OrganizationInformationPage organizationInfo = new OrganizationInformationPage(driver);
		
		
		CampaignPage campaign = new CampaignPage(driver);
		CreatingNewCampaignPage createCampaign = new CreatingNewCampaignPage(driver);
		CampaignInformationPage campagnInfo = new CampaignInformationPage(driver);

		OpotunityPage opportunity = new OpotunityPage(driver);
		CreatingNewOpoortunity createOpportunity = new CreatingNewOpoortunity(driver);
		OpotunityInformationPage opportunityInfo = new OpotunityInformationPage(driver);

		home.ClickOnOrganisationsModule();
		organization.clickOnAddOrganizationButton();
		createOrganization.enterOrganizationName(organizationName);
		createOrganization.clickOnSaveButton();
		String actualOrganization = organizationInfo.verifyOrganizationInformation(organizationName);

		Assert.assertTrue(actualOrganization.contains(organizationName));
		System.out.println("Pass: organization has been created");

		home.clickOnCampaignModule();
		campaign.clickOnAddCampagnButton();
		createCampaign.enterCampaignName(campaignName);
		createCampaign.clickOnSaveButton();
		String actualCampaignName = campagnInfo.verifyCampaignInformation(campaignName);

		Assert.assertTrue(actualCampaignName.contains(campaignName));
		System.out.println("Pass: campaign has been created");

		home.clickOnOpportunitiesModule();
		opportunity.clickOnAddOpportunityButton();
		createOpportunity.enterOpportunityName(opportunityName);
		createOpportunity.selectOrganizationNameFromOrganizationLookUpPage(organizationLookUpPageTitle,
				organizationName);
		createOpportunity.selectCampagnNameFromCampaignLookUpPage(campaignLookUpPageTitle, campaignName);
		createOpportunity.clickOnSaveButton();

		String actualOpportunityName = opportunityInfo.verifyOpportunityInformation(opportunityName);

		Assert.assertTrue(actualOpportunityName.contains(opportunityName));
		System.out.println("Pass: opportunity has been created");

	}

	
}
