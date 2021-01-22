package com.asm.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.asm.selenium.constant.SeleniumConstants;
public class TagNameLocateById {

	private static final String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
	private static final String CHROME_DRIVER_LOCATION = "C:\\ASM\\zipped\\chromedriver.exe";
	
	// Tagname = what kind of element it is
	public static void main(String[] args) {
		System.setProperty(CHROME_WEB_DRIVER,CHROME_DRIVER_LOCATION);
		String baseUrl = "http://www.facebook.com";
		String tagName = "";
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println("TagName : "+tagName);
		driver.quit();
	}

}
