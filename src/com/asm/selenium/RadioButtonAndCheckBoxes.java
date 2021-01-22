package com.asm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBoxes {
	public static void main(String[] args) {
		System.out.println("Starting selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\ASM\\zipped\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 String baseUrl = "http://demo.guru99.com/test/radio.html";					
	     driver.get(baseUrl);	
	     WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
	        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
	        		
	        //Radio Button1 is selected		
	        radio1.click();			
	        System.out.println("Radio Button Option 1 Selected");					
	        		
	        //Radio Button1 is de-selected and Radio Button2 is selected		
	        radio2.click();			
	        System.out.println("Radio Button Option 2 Selected");					
	        		
	        // Selecting CheckBox		
	        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

	        // This will Toggle the Check box 		
	        option1.click();			

	        // Check whether the Check box is toggled on 		
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }		
	         
	        		
	        		
	        //Selecting Checkbox and using isSelected Method		
	        driver.get("http://demo.guru99.com/test/facebook.html");					
	        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
	        for (int i=0; i<2; i++) {											
	            chkFBPersist.click (); 			
	            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
	        }		
			driver.close();
	}

}
