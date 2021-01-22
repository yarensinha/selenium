package com.asm.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ASM\\zipped\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/test/delete_customer.php";
		driver.get(baseURL);
		System.out.println("Opening Page");
		System.out.println("Searching Text Box");
		WebElement custId = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		System.out.println("Passing Value");
		custId.sendKeys("saket");
		System.out.println("Clicking Submit");
		custId.submit();
		System.out.println("Accessing alert box");
		Alert alert = driver.switchTo().alert();
		String alertMsg = alert.getText();
		System.out.println(alertMsg);
		Thread.sleep(5000);
		System.out.println("Cliked OK");
		alert.accept();
		driver.quit();
	}

}
