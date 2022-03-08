package com.qa.stepDefination;

import static org.junit.Assert.assertEquals;

import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinatio extends TestBase{
	
	//LoginPage loginpage = new LoginPage();
	LoginPage loginpage;
	HomePage homepage;
	//initialization();

	@Given("^user open browser$")
	public void user_open_browser()  {
		TestBase.initialization();
	    
	}

	@Then("^user on login page$")
	public void user_on_login_page() throws Exception {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		assertEquals("#1 Free CRM customer relationship management software cloud", title);
		Thread.sleep(3000);
	    loginpage.loginLink();
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password() throws Exception {
				
		Thread.sleep(1000);
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button()  {
	   
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed()  {
	   
	}

	@Then("^validat home page title$")
	public void validat_home_page_title()  {
	  
	}

	@Then("^validate loggedin username$")
	public void validate_loggedin_username()  {
	   
	}



}
