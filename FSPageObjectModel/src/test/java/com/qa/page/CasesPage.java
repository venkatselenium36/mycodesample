package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class CasesPage extends TestBase{
	
	Actions act = new Actions(driver);
	
	
	@FindBy(name = "title")
	WebElement titleTxt; 
	
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement descpText;
	
	  
	@FindBy(xpath = "//div[@class='divider text' ]")
	WebElement assignedToTxt; 
			   	
	@FindBy(xpath = "//div[@class='active selected item']/span[contains(text(),'Sha Nir')]")
	WebElement assignedToValue;
	
	@FindBy(xpath = "//div[@name='type']/div[text()='Select']")
	WebElement typeDropdown;
	
	@FindBy(xpath = "//span[text()='Technical Support']")
	WebElement typeDropdownValue;
	
	@FindBy(xpath = "//div[@name ='type' and @class = 'ui selection dropdown']")
	WebElement typeDropdownBox; 
	

	@FindBy(xpath = "//div[@name='status']/div[text()='Select']")
	WebElement statusDropdown;

	@FindBy(xpath = "//span[text()='Reviewing']")
	WebElement statusDropdownValue;

	
	@FindBy(xpath = "//div[@class='two fields'][5]/div[1]/div/div/div/input")
	WebElement closeDatePicker; 
	
	@FindBy(xpath = "//textarea[@name = 'description']")
	WebElement descritionTxt;
	
	@FindBy(xpath = "//div[@name ='status' and @role = 'listbox']")
	WebElement statusTxt; 


	@FindBy(name = "//div[@name='contact']/input[@class='search']")
	//@FindBy(name = "//div[@class='ui fluid search selection upward dropdown']")
	WebElement contactTxtBox; 

	
	@FindBy(xpath = "//span[text()='Shanir Nir nir']")
	WebElement contactSearchValue;

	@FindBy(xpath = "//div[contains(@class,'ui active ')]")
	WebElement dealInputBox; 
	

    @FindBy(xpath = "//div[@name='deal']//input[@class='search']")
    WebElement  dealSearchBox;

@FindBy(xpath ="//div[@name='priority' and contains(@class,'ui selection')]")
WebElement priorityTextBox;

@FindBy(xpath = "//span[text()='High']")
WebElement priorityDropdownValue;

@FindBy(xpath = "//form[@class='ui form segment custom-form-container']/div/div/div/label/div/input")
WebElement tagTextBox;

@FindBy(xpath = "//span[text()='Manual Deal']")
WebElement tagValue;


@FindBy(xpath = "//div[@class='two fields'][4]/div[2]/div[1]/div/div/input")
	WebElement deadlineDatePicker; 

	
//
//	@FindBy(name = "a")
//	WebElement a; 
//
//	@FindBy(name = "a")
//	WebElement a; 
//
//	@FindBy(name = "a")
//	WebElement a; 
//
//	@FindBy(name = "a")
//	WebElement a; 
	
	public CasesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectAssignToValue() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", assignedToTxt);
		act.moveToElement(assignedToValue).build().perform();
		Thread.sleep(500);
//		assignedToValue.click();
		jse.executeScript("arguments[0].click();", assignedToValue);
	}
	
	public void enterCloseDate() throws Exception   {
		closeDatePicker.sendKeys("22/07/2021 00:00");
		Thread.sleep(3000);
		descpText.click();
	}
	
	public void enterDescriptionValue() {
		descpText.sendKeys("Creating a new case");
	}
public void selectValueFromTypeDdopdown() {
    	typeDropdown.click();
    	act.moveToElement(typeDropdownValue).build().perform();
    	typeDropdownValue.click();
    }
	

public void selectValueFromStatusDropdown() {
	    	statusDropdown.click();
	    	act.moveToElement(statusDropdownValue).build().perform();
	    	statusDropdownValue.click();
	    }


public void searchValueFromDealDropdown() {
	dealSearchBox.click();
	dealSearchBox.sendKeys("Test8");
	act.moveToElement(driver.findElement(By.xpath("//span[@class='text' and text()='Test8']"))).build().perform();
	driver.findElement(By.xpath("//span[@class='text' and text()='Test8']")).click();
}

public void enterDeadLineDate() {
	deadlineDatePicker.sendKeys("30/07/2030 00:00");
}

public void searchValueForTag() throws Exception {
	tagTextBox.click();
	tagTextBox.sendKeys("manual Deal");
	act.moveToElement(tagValue).build().perform();
	Thread.sleep(500);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(500);
	jse.executeScript("arguments[0].click();", tagValue);
	
}

public void selectValueFromPriorityDropdown() {
	priorityTextBox.click();
	act.moveToElement(priorityDropdownValue).build().perform();
	priorityDropdownValue.click();
	
}

public void searchValueForContact() {
	contactTxtBox.click();
	contactSearchValue.sendKeys("shanir");
	act.moveToElement(contactSearchValue).build().perform();
	contactSearchValue.click();
}

//Right click on Element
public void rightClickMethod() {
	 WebElement rightClick = driver.findElement(By.xpath(""));
	 act.moveToElement(rightClick).perform();
	 act.contextClick(rightClick).perform();
	 
	 
}

	
}
