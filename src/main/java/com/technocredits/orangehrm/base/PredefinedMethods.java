package com.technocredits.orangehrm.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedMethods {
static ChromeDriver driver;
	
	/*public PredefinedMethods() {
		driver = new ChromeDriver();
	}*/
	public void initializeBrowser(){
		if(driver == null){
			System.setProperty("webdriver.chrome.driver", "D:\\Technocredits\\Oct18_Framework\\orangehrmautomation\\src\\test\\resources\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
		}
			
	}
	
	public void setText(String locator, String value){
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	public void click(String locator){
		driver.findElement(By.xpath(locator)).click();
	}

}
