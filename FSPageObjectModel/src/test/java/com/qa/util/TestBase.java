package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"/Users/p-venkataramanaiah/eclipse-workspace/FSPageObjectModel/"
					+"src/test/java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			 e.getMessage();
		}
		
		}
		
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "D:\\Test Improvement\\Java exe file\\Newchromedriver\\91.0.4472.77\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "D:\\Test Improvement\\Java exe file\\Newchromedriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Test Improvement\\Java exe file\\Newchromedriver\\91.0.4472.77\\chromedriver_win32\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
	}

}



