package com.asm.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	public static final String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
	public static final String CHROME_DRIVER_LOCATION = "C:\\ASM\\zipped\\chromedriver.exe";

	public static void main(String[] args) {
		System.setProperty(CHROME_WEB_DRIVER,CHROME_DRIVER_LOCATION);
		WebDriver driver = new ChromeDriver();
	//	String baseURL = "http://newtours.demoaut.com";
		String baseURL = "http://www.facebook.com";
		String var = "";
		
		driver.get(baseURL);
		var = driver.findElement(By.className("inputtext_55r1_6luy")).getText();
		System.out.println("Var : "+var);
		driver.quit();
	}
}
