package com.asm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrames {
	
	public static void main(String[] args) {
		System.out.println("Starting selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\ASM\\zipped\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/selenium/deprecated.html";
		driver.get(baseURL);
		driver.switchTo().frame("classFrame");
		String txt = driver.findElement(By.linkText("Deprecated")).getText();
		System.out.println("T : "+txt);
		driver.findElement(By.linkText("Deprecated")).click();
        driver.quit(); 
		
	}

}
