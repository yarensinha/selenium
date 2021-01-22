package com.asm.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ASM\\zipped\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/popup.php";
		driver.get(baseURL);
		driver.manage().window().maximize();
		System.out.println("Opening Page");
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		String mainWindow = driver.getWindowHandle();
		 // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
    Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!mainWindow.equalsIgnoreCase(ChildWindow))			
        {    		
             
                // Switching to Child window
                driver.switchTo().window(ChildWindow);	                                                                                                           
                driver.findElement(By.name("emailid"))
                .sendKeys("gaurav.3n@gmail.com");                			
                
                driver.findElement(By.name("btnLogin")).click();			
                             
		// Closing the Child Window.
                    driver.close();		
        }		
    }		
    // Switching to Parent window i.e Main Window.
        driver.switchTo().window(mainWindow);	
        driver.quit();
	}

}
