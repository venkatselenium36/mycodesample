package com.qa.stepDefination;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.testng.Assert;

import com.qa.page.DealsPage;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DealsStepDefination extends TestBase{
	
	
	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	

@Then("^click on deals link$")
public void click_on_deals_link() throws Throwable {
	
	    Thread.sleep(3000);
	    homepage = new HomePage();
	    homepage.moveToLeftMenu();
	    Thread.sleep(2000);
	    dealspage = new DealsPage();
		dealspage.clickOnDealsLink();
    
}

@Then("^create new deals$")
public void create_new_deals() throws Throwable {
		
    Thread.sleep(2000);
    dealspage.clickOnCreateBtn();
    Thread.sleep(2000);
    dealspage.enterTextBoxValue();
    Thread.sleep(2000);
    dealspage.enterAmount();
    Thread.sleep(2000);
    dealspage.selectValueFromStageDropdown();
    Thread.sleep(2000);
    dealspage.selectValueFromStatusDropdown();
    Thread.sleep(2000);
    dealspage.scrollDown();
    Thread.sleep(2000);
    dealspage.selectValueFromTypeDdopdown();
    Thread.sleep(2000);
    dealspage.enterIdentifierTextBoxValue();
    Thread.sleep(2000);
    dealspage.scrollUp();
//    Thread.sleep(2000);
//    dealspage.searchvalueFromCompanyDropdown();
    Thread.sleep(2000);
    dealspage.searchValueFromContactDropdown();
//    Thread.sleep(2000);
//    dealspage.searchValueFromTagSearchBox();
    
    
    Thread.sleep(2000);
    dealspage.enterProbability();
    Thread.sleep(2000);
    dealspage.enterCommision();
    Thread.sleep(2000);
    dealspage.clickOnClosedBtn();
    Thread.sleep(2000);
    dealspage.scrollDown();
    Thread.sleep(2000);
    dealspage.enterNextStepsTextBoxValue();
    Thread.sleep(2000);
    dealspage.selectValueFromSourceDropdown();
    
   // dealspage.clickOnSaveBtn();
    
    
    
    
   
}




}
