package com.qa.page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import cucumber.api.DataTable;

public class DealsPage extends TestBase{
	
	
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
		
		@FindBy(xpath = "//input[@name='closed']")
		WebElement closedBtn;
		
		@FindBy(name = "title")
		WebElement textBox;
				
		@FindBy(name = "amount")
		WebElement amountField;
		
		@FindBy(xpath = "//div[@name='stage']/div[text()='Select']")
		WebElement stageDropdown;
				
		@FindBy(xpath = "//span[text()='Qualify']")
		WebElement stageDropdownValue;
		
		
		@FindBy(xpath = "//div[@name='status']/div[text()='Select']")
		WebElement statusDropdown;
		
		@FindBy(xpath = "//span[text()='Active']") 
		WebElement statusDropdownValue;
		
		@FindBy(xpath = "//div[@name='type']/div[text()='Select']")
		WebElement typeDropdown;
		
		@FindBy(xpath = "//span[text()='Priority']")
		WebElement typeDropdownValue;
		
		@FindBy(name ="identifier")
		WebElement  identifiertxt;
		
		@FindBy(xpath = "//div[@name='contacts']//input[@class='search']")
		WebElement  companySearchBox;
		
				
				
		@FindBy(xpath = "//div[@name='contacts']//input[@class='search']")
		WebElement  contactSearchBox;
		
		@FindBy(xpath = "//div[contains(@class,'ui active visible fluid ')]/input")
		WebElement tagtxtBox;
		
		
		
		
		@FindBy(name = "probability")
		WebElement probabilityField;
		
		@FindBy(name = "commission")
		WebElement commissionField;
		
		@FindBy(xpath = "//textarea[contains(@name,'next_step')]")
		WebElement nextStpstxtBox;
		
		@FindBy(xpath = "//div[@name='source']/div[text()='Select']")
		WebElement sourceDropdown;
		
		@FindBy(xpath = "//span[text()='Existing Customer']")
		WebElement sourceDropdownValue;
		
		
		@FindBy(xpath = "//button[@class='ui linkedin button']")
		WebElement saveBtn;
				
		public DealsPage() {
			PageFactory.initElements(driver, this);
		}
				
		//*****################**********
		
////		//original test case
//		List<List<String>> dealValues = dealdata.raw();
//		
//		
//		//Company name
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@name='company']//input[@class='search']")).sendKeys("DEAL Ltd");
//		driver.findElement(By.xpath("//div[@name='company']//input[@class='search']")).click();
//		
//		
//		//Contact Details
//		driver.findElement(By.xpath("//div[@name='contacts']//input[@class='search']")).click();
//		//act.moveToElement(driver.findElement(By.xpath("//span[@class='text' and text()='Shanir Nir nir']"))).build().perform();
//		//driver.findElement(By.xpath("//span[@class='text' and text()='Shanir Nir nir']")).click();
//		driver.findElement(By.xpath("//div[@name='contacts']//input[@class='search']")).sendKeys("1234567890");
//		driver.findElement(By.xpath("//div[@name='contacts']//input[@class='search']")).click();
//		
//		
//		//Tag test box
//		driver.findElement(By.xpath("//div[@class='ui active visible fluid multiple search selection dropdown']//input[@class='search']")).sendKeys("Test");
//		//div[@class='ui active visible fluid multiple search selection dropdown']//input[@class='search']
//		
		
		//********################************
		
		
		//Action
	    public void clickOnDealsLink() {
			act.moveToElement(dealsLink).build().perform();
			dealsLink.click();
		}
	    public void clickOnCreateBtn() {
			createBtn.click();
		}
			    
	    public void enterTextBoxValue() {
	    	textBox.sendKeys("NewTestDeal123");
	    }
	    
//	    public void enterTextBoxValue(DataTable data) {
//	    	
//	    	List<List<String>> dd = data.raw();
//	    	textBox.sendKeys(dd.get(0).get(0));
//	    }
	    
	    public void enterAmount() {
	    	amountField.sendKeys("1000");
	    }
	    
	    public void selectValueFromStageDropdown() {
	    	stageDropdown.click();
	    	act.moveToElement(stageDropdownValue).build().perform();
	    	stageDropdownValue.click();
	    }
	    
	    public void selectValueFromStatusDropdown() {
	    	statusDropdown.click();
	    	act.moveToElement(statusDropdownValue).build().perform();
	    	statusDropdownValue.click();
	    }
	    	    
	    public void scrollDown() {
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
	    }
	    
	    public void scrollUp() {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,-1000)");
	    	//js.executeScript("window.scrollBy(2000,0)");
	    }
	    
	    public void selectValueFromTypeDdopdown() {
	    	typeDropdown.click();
	    	act.moveToElement(typeDropdownValue).build().perform();
	    	typeDropdownValue.click();
	    }
	    	    
	    public void enterIdentifierTextBoxValue() {
	    	identifiertxt.sendKeys("Test@123");
	    }
	    
	    
	    public void searchvalueFromCompanyDropdown() {
	    	companySearchBox.click();
	    	companySearchBox.sendKeys("ShaNir Co");
	    	act.moveToElement(driver.findElement(By.xpath("//span[@class='text' and text()='ShaNir Co']"))).build().perform();
			driver.findElement(By.xpath("//span[@class='text' and text()='ShaNir Co']")).click();
	    }
	    
	    public void searchValueFromContactDropdown() {
	    	contactSearchBox.click();
	    	contactSearchBox.sendKeys("Shanir");
	    	act.moveToElement(driver.findElement(By.xpath("//span[@class='text' and text()='Shanir Nir nir']"))).build().perform();
			driver.findElement(By.xpath("//span[@class='text' and text()='Shanir Nir nir']")).click();
	    }
	    
	    
	    public void searchValueFromTagSearchBox() {
	    	tagtxtBox.sendKeys("Test@123");
	    	act.moveToElement(driver.findElement(By.xpath("//span[@class='text' and text()='Test@123']"))).build().perform();
	    	driver.findElement(By.xpath("//span[@class='text' and text()='Test@123']")).click();
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    public void enterProbability() {
	    	probabilityField.sendKeys("20");
	    }
	    
	    public void enterCommision() {
	    	commissionField.sendKeys("2");
	    	
	    }
	    
		public void clickOnClosedBtn() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", closedBtn);
		}
		
		
		public void enterNextStepsTextBoxValue() {
			nextStpstxtBox.sendKeys("this is the test message: ");
		}
		
		public void selectValueFromSourceDropdown() {
			sourceDropdown.click();
			act.moveToElement(sourceDropdownValue).build().perform();
			sourceDropdownValue.click();
			
			
		}
		
		public void clickOnSaveBtn() {
			saveBtn.click();
			
		}
	


}
