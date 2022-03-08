package com.qa.stepDefination;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefination extends TestBase{
	
	
	LoginPage loginpage;
	HomePage homepage;
	
	
	

@Given("^user opens browser$")
public void user_opens_browser() {
	TestBase.initialization();
   
}

@Then("^user is on login page$")
public void user_is_on_login_page() throws Exception {
	loginpage = new LoginPage();
	String loginpageTitle = loginpage.validateLoginPageTitle();
	assertEquals("#1 Free CRM customer relationship management software cloud", loginpageTitle);
	Thread.sleep(1000);
    loginpage.loginLink();
	
	
}

@Then("^user logs into app$")
public void user_logs_into_app() throws Exception {
	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}

@Then("^validate home page title$")
public void validate_home_page_title() throws Exception {
	Thread.sleep(1000);
	String homePageTitle = homepage.validateHomePageTitle();
	assertEquals("Cogmento CRM", homePageTitle);

}

@Then("^validate logged in user$")
public void validate_logged_in_user() {
	boolean flag = homepage.verifyLoggedInUserName();
	Assert.assertTrue(flag);
	
}


@Then("^Move to Left menu$")
public void move_to_Left_menu() throws Throwable {
    Thread.sleep(1000);
    homepage.moveToLeftMenu();
}



@Then("^click on calender link$")
public void click_on_calender_link() throws Throwable {
	Thread.sleep(1000);
	homepage.moveToLeftMenu();
	Thread.sleep(1000);
    homepage.clickOnCalenderLink();
    Thread.sleep(1000);
    homepage.clickOnCreateBtn();
    Thread.sleep(2000);
    homepage.clickOnAllDayBtn();
    
}




}
