package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage {
	
	@FindBy(xpath = "//button[contains(@class,'ui linkedin button')]")
	WebElement createBtn;
	
	@FindBy(xpath = "//input[@name='title']")
	WebElement titletxt;
	
	@FindBy(xpath = "//div[@class='ui selection upward dropdown']")
	WebElement categorytxt;
	
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement descriptiontxt;
	
	@FindBy(xpath = "//input[@name='all_day']")
	WebElement allDayBtn;
	
	@FindBy(xpath = "")
	WebElement taskSrctxt;
	
	@FindBy(xpath = "")
	WebElement companytxt;
	
	@FindBy(xpath = "")
	WebElement identifiertxt;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement saveBtn;

}
