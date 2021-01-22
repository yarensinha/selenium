package com.asm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
	public static void main(String[] args) {
		System.out.println("Starting selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\ASM\\zipped\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String alertMessage = "";
		String baseURL = "http://jsbin.com/usidix/1";
		driver.get(baseURL);
		 driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	        alertMessage = driver.switchTo().alert().getText();
	        driver.switchTo().alert().accept();
	       
	        System.out.println(alertMessage);
	        driver.quit();
	       
	}
}
