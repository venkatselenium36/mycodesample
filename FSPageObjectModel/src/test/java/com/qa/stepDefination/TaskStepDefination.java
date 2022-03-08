package com.qa.stepDefination;

import com.qa.page.CasesPage;
import com.qa.page.DealsPage;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.page.TaskPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class TaskStepDefination extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	CasesPage casepage;
	TaskPage taskpage;
	

	@Then("^click on task link$")
	public void click_on_task_link() throws Throwable {
		Thread.sleep(3000);
		homepage = new HomePage();
		Thread.sleep(3000);
	    homepage.moveToLeftMenu();
	    Thread.sleep(1000);
	    homepage.clickOnTaskLink();
	}

	@Then("^create new task$")
	public void create_new_task() throws Throwable {
		Thread.sleep(3000);
		dealspage = new  DealsPage();
		dealspage.clickOnCreateBtn();
		Thread.sleep(1000);
		dealspage.enterTextBoxValue();
		Thread.sleep(1000);
		taskpage = new TaskPage();
		taskpage.enterDueDate();
		Thread.sleep(1000);
		taskpage.enterDealValue();
		
		Thread.sleep(1000);
		casepage = new CasesPage();
		
		Thread.sleep(1000);
		casepage.enterCloseDate();
		Thread.sleep(1000);
		casepage.enterDescriptionValue();
		 Thread.sleep(1000);
		 casepage.selectValueFromPriorityDropdown();
		Thread.sleep(1000);
		 dealspage.enterIdentifierTextBoxValue();
		
		Thread.sleep(1000);
		casepage.selectValueFromTypeDdopdown();
		
		Thread.sleep(1000);
		taskpage.enterContactValue();
		Thread.sleep(1000);
		taskpage.enterCaseValue();
		Thread.sleep(1000);
		//taskpage.enterTagsValue();
		
		
		Thread.sleep(1000);
		taskpage.enterComplitionValue();
		Thread.sleep(1000);
		casepage.selectValueFromStatusDropdown();
		 
		
	   
	}


	
	
}
