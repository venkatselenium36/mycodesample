package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class TaskPage extends TestBase{
	
	
	@FindBy(name = "title")
	WebElement titleTxtBox; 
	
	@FindBy(xpath = "//div[@class='two fields'][3]/div[1]/div[1]/div/div/input")
	WebElement dueDateField;
	
	@FindBy(xpath= "//form[@class='ui form segment custom-form-container']/div[4]/div/div/div/input")
	WebElement dealTxtField;
	
	@FindBy(xpath ="//form[@class='ui form segment custom-form-container']/div[4]/div/div/div/i")
	WebElement searchIcon;
	
	@FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div[3]/div[2]/div/div/input")
	WebElement contactTxtField;
	
	@FindBy(xpath ="//form[contains(@class,'ui form segment')]/div[4]/div[2]//input")
	WebElement caseTxtField;
	
	@FindBy(xpath = "//form[contains(@class,'ui form segment')]/div[5]/div[2]//input")
	WebElement tagTxtFeild;
	
	@FindBy(name = "completion")
	WebElement completionField; 
	
	
	
	
	
	
	public TaskPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterDueDate() throws InterruptedException {
		dueDateField.sendKeys("25/07/2025 00:00");
		Thread.sleep(500);
		dueDateField.click();
	}
	public void enterDealValue() {
		dealTxtField.click();
		dealTxtField.sendKeys("Shanir");
		searchIcon.click();
	}
	public void enterContactValue() {
		contactTxtField.click();
		contactTxtField.sendKeys("NewContactPerson");
		searchIcon.click();
	}
	
	public void enterCaseValue() {
		caseTxtField.click();
		caseTxtField.sendKeys("First Test Case");
		searchIcon.click();
	}
	public void enterTagsValue() {
		tagTxtFeild.click();
		tagTxtFeild.sendKeys("Tes8");
		searchIcon.click();
	}
	
	public void enterComplitionValue() {
		completionField.sendKeys("5");
	}
	
	
}
