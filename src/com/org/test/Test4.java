package com.org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class Test4 implements IReporter{
	public static void main(String args[]) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(50l, TimeUnit.SECONDS);
		 driver.navigate().to("https://qa3.hobsonsemt.net/admin/Account/Login");
         
		 driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("automation");
		 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password#1");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 driver.findElement(By.xpath("//a[text()='Communications']")).click();
		 driver.findElement(By.xpath("//a[text()='New Topic']")).click();
		 driver.findElement(By.xpath("//a[span[text()='HTML']]")).click();
		 Thread.sleep(1000);
		 //List<WebElement> we = driver.findElements(By.xpath(""));
		 //String  we[] = driver.findElements(By.xpath(""));
		
	WebElement we = driver.findElement(By.xpath("//iframe[2]"));
		 System.out.println("Before switch to iframe");
		 driver.switchTo().frame(we);

		 System.out.println("After switch to iframe");
		 driver.findElement(By.xpath("//body/textarea")).clear();
		 
		
	}

	@Override
	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,
			String arg2) {
		// TODO Auto-generated method stub
		
	}
	
}
