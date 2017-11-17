package com.org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String args[]){
		
		/*String marionetteDriverLocation = "D:\\Murugan Data\\Official\\software\\wires.exe";
	    System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);
	    	    
	    DesiredCapabilities capabilitiesff = DesiredCapabilities.firefox();
	    capabilitiesff.setCapability("marionette", true);
	    capabilitiesff.setCapability("javascriptEnabled", true);*/
	   // driver = new FirefoxDriver(capabilitiesff);
	   // System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);
		//WebDriver driver = new FirefoxDriver(capabilitiesff);
	    
	  /*  File chromefile = new File("C:\\SeleniumScripts\\ConnectQAAutomation\\lib\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chromefile.getAbsolutePath());
		WebDriver driver = new ChromeDriver();*/
		WebDriver driver = new FirefoxDriver();
        driver.navigate().to(("https://qa3.hobsonsemt.net/admin/Account/Login"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("automation");
        driver.findElement(By.id("Password")).sendKeys("Password#1");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.xpath("//button[@class='button']")).click();
        driver.findElement(By.xpath("//div[@id='userMenuName']")).click();
        WebElement we = driver.findElement(By.xpath("//div[@id='userMenuOptions']//a[text()='Update Profile']")); 
        
        Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
		//action.moveToElement(we).click();
		driver.findElement(By.xpath("//div[@id='userMenuOptions']//a[text()='Update Profile']")).click();
		String s1 = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_TextBox_Username']")).getAttribute("disabled");
		System.out.println("Attribute value:" +s1);
        //To Zoom in 
        ///driver.findElement(By.xpath("")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		
		
	}
}
