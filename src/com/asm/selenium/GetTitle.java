package com.asm.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.out.println("Starting selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\ASM\\zipped\\chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		driver.quit();
	}

}
