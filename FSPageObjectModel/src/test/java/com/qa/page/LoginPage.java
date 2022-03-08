package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	//Page Factory
	
	@FindBy(xpath = "//span[text()='Log In']")
	WebElement loginLink;
	
	@FindBy(xpath ="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath ="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath ="//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath ="//span[@class='user-display']")
	WebElement CRMLogo;
	
	
	//initiliazing Page Object
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Action
	
	public void loginLink() throws Exception {
		Thread.sleep(3000);
		loginLink.click();
		//driver.findElement(By.xpath("//span[text()='Log In']")).click();
		//jse.executeScript("arguments[0].click();", loginLink);
	}

	
	public HomePage login(String email, String pwd) throws Exception {
		
		username.sendKeys(email);
		Thread.sleep(1000);
		password.sendKeys(pwd);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", loginBtn);
		return new HomePage();
		
		
	}
	
	public boolean validateCRMImage() {
		return CRMLogo.isDisplayed();
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	
	

}
