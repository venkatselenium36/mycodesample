package com.qa.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	
	Actions act = new Actions(driver);
	
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement homePagetitle;
	
	@FindBy(xpath = "//span[@class='item-text']")
	WebElement sideMenu;
	
	@FindBy(xpath = "//i[@class='edit icon']")
	WebElement createNewDeals;
	
	
	
	
	@FindBy(xpath ="//span[contains(text(),'Sha Nir')]")
	WebElement loggedInUserName;
	
	@FindBy(xpath ="//span[text()='Calendar']")
	WebElement calenderLink;
	
	@FindBy(xpath ="//span[text()='Contacts']")
	WebElement  contactsLink;
	
	@FindBy(xpath ="//span[text()='Companies']")
	WebElement companiesLink;
	
	@FindBy(xpath ="//span[text()='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath ="//span[text()='Tasks']")
	WebElement tasksLink;
	
	@FindBy(xpath ="//span[text()='Cases']")
	WebElement casesLink;
	
	@FindBy(xpath ="//span[text()='Calls']")
	WebElement callsLink;
	
	@FindBy(xpath ="//span[text()='Documents']")
	WebElement documentsLink;
	
	@FindBy(xpath ="//span[contains(text(),'Home')]")
	WebElement leftMenu;
	
	@FindBy(xpath = "//i[contains(@class,'edit icon')]")
	WebElement createBtn;
	
	@FindBy(xpath = "//input[@name='all_day']")
	WebElement allDayBtn;
	
	
	//initilazing Page object 
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Action
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLoggedInUserName() {
		return loggedInUserName.isDisplayed();
	}

	
	public void moveToLeftMenu() {
		//Actions act = new Actions(driver);
		act.moveToElement(leftMenu).build().perform();
		
	}
	
    public void clickOnCalenderLink() {
    	act.moveToElement(calenderLink).build().perform();
    	calenderLink.click();
     }
    
    public void clickOnCasesLink() {
    	act.moveToElement(casesLink).build().perform();
    	casesLink.click();
    }
    public void clickOnTaskLink() {
    	act.moveToElement(tasksLink).build().perform();
    	tasksLink.click();
    }
    public void clickOnCreateBtn() {
		createBtn.click();
	}
	
	public void clickOnAllDayBtn() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", allDayBtn);
	}
}
