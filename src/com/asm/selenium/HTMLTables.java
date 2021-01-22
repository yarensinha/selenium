package com.asm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ASM\\zipped\\chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		String innerText = driver.findElement(
			By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 	
	        System.out.println(innerText); 
	//	driver.quit();
		
		// nested table 
		String baseUrl2 = "http://demo.guru99.com/test/accessing-nested-table.html";
		WebDriver driver2 = new ChromeDriver();

		driver.get(baseUrl2);
		String innerText2 = driver2.findElement(
			By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText(); 		
	        System.out.println(innerText2); 
		driver.quit();
		}
	}


