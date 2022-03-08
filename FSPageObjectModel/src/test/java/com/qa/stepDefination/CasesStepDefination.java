package com.qa.stepDefination;

import org.openqa.selenium.Alert;

import com.qa.page.CasesPage;
import com.qa.page.DealsPage;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class CasesStepDefination extends TestBase{
		 
	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	CasesPage casepage;
	
	

@Then("^click on cases link$")
public void click_on_cases_link() throws Throwable {
	
	Thread.sleep(3000);
	homepage = new HomePage();
	Thread.sleep(3000);
    homepage.moveToLeftMenu();
    Thread.sleep(1000);
    homepage.clickOnCasesLink();
    
}

@Then("^create new cases$")
public void create_new_cases() throws Throwable {
	
	Thread.sleep(3000);
	dealspage = new  DealsPage();
	dealspage.clickOnCreateBtn();
	Thread.sleep(1000);
	dealspage.enterTextBoxValue();
	Thread.sleep(1000);
	casepage = new CasesPage();
	
	//Thread.sleep(1000);
	//casepage.selectAssignToValue();
	
	Thread.sleep(1000);
	casepage.selectValueFromTypeDdopdown();
	
	Thread.sleep(3000);
	casepage.enterCloseDate();
	
	Thread.sleep(1000);
	casepage.enterDescriptionValue();
	
	 Thread.sleep(1000);
	 casepage.selectValueFromStatusDropdown();
	 Thread.sleep(1000);
	 casepage.searchValueForContact();
	 
	 
	 
	 Thread.sleep(1000);
	 casepage.searchValueFromDealDropdown();
	 Thread.sleep(1000);
	 casepage.enterDeadLineDate();
	 Thread.sleep(1000);
	 //casepage.searchValueForTag();
	 Thread.sleep(1000);
	 casepage.selectValueFromPriorityDropdown();
	 Thread.sleep(1000);
	 dealspage.enterIdentifierTextBoxValue();
	 
	 
//	 Alert Pop up window
	 String mainPage = driver.getWindowHandle();
	  Alert alt = driver.switchTo().alert();
	  alt.accept();
	  //	  or
	  alt.dismiss();
	  driver.switchTo().window(mainPage);
   
}

}
