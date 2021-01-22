package com.asm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAndFindElement {

	public static void main(String[] args) {
			System.out.println("Starting selenium");
			System.setProperty("webdriver.chrome.driver", "C:\\ASM\\zipped\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			String baseURL = "http://demo.guru99.com/test/ajax.html";
			driver.get(baseURL);
			System.out.println("Radio button");
			// Find the radio button for “No” using its ID and click on it
			driver.findElement(By.id("no")).click();
			System.out.println("Radio button clicked");	
			//Click on Check Button
			System.out.println("Check Button");
			driver.findElement(By.id("buttoncheck")).click();
			System.out.println("Check button verified");
			
		    List elements = driver.findElements(By.name("name"));
		    System.out.println("Number of elements:" +elements.size());

		    for (int i=0; i<elements.size();i++){
		      System.out.println("Radio button text:" + ((WebElement) elements.get(i)).getAttribute("value"));
			driver.close();
		    }
	}

}
