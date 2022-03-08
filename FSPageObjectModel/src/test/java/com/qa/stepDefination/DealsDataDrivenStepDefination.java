package com.qa.stepDefination;

import com.qa.page.DealsDataDriverPage;
import com.qa.page.DealsPage;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class DealsDataDrivenStepDefination  extends TestBase{
	

	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	DealsDataDriverPage dealsDDPages;
	

//@Then("^click on deals link$")
//public void click_on_deals_link() throws Throwable {
//	
//	    Thread.sleep(3000);
//	    homepage = new HomePage();
//	    homepage.moveToLeftMenu();
//	    Thread.sleep(2000);
//	    dealspage = new DealsPage();
//	    dealsDDPages = new DealsDataDriverPage();
//		dealspage.clickOnDealsLink();
//	   // dealsDDPages.clickOnDealsLink();
//    
//}

@Then("^create new datadriven deals$")
public void create_new_datadriven_deals(DataTable data) throws Throwable {

    Thread.sleep(2000);
    dealspage.clickOnCreateBtn();
    Thread.sleep(2000);
    dealsDDPages.enterTextBoxValue(data);
    Thread.sleep(2000);
    dealsDDPages.enterAmount();
    Thread.sleep(2000);
    dealsDDPages.selectValueFromStageDropdown();
    Thread.sleep(2000);
    dealsDDPages.selectValueFromStatusDropdown();
    Thread.sleep(2000);
    dealsDDPages.scrollDown();
    Thread.sleep(2000);
    dealsDDPages.selectValueFromTypeDdopdown();
    Thread.sleep(2000);
    dealsDDPages.enterIdentifierTextBoxValue();
    Thread.sleep(2000);
    dealsDDPages.scrollUp();
//    Thread.sleep(2000);
//    dealsDDPages.searchvalueFromCompanyDropdown();
    Thread.sleep(2000);
    dealsDDPages.searchValueFromContactDropdown();
//    Thread.sleep(2000);
//    dealsDDPages.searchValueFromTagSearchBox();
    
    
    Thread.sleep(2000);
    dealsDDPages.enterProbability();
    Thread.sleep(2000);
    dealsDDPages.enterCommision();
    Thread.sleep(2000);
    dealsDDPages.clickOnClosedBtn();
    Thread.sleep(2000);
    dealsDDPages.scrollDown();
    Thread.sleep(2000);
    dealsDDPages.enterNextStepsTextBoxValue();
    Thread.sleep(2000);
    dealsDDPages.selectValueFromSourceDropdown();
    
   // dealsDDPages.clickOnSaveBtn();
    
    
    
    
   
}



}
