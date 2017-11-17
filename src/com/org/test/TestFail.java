package com.org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class TestFail {
	WebDriver driver =null;
	
	@Test
	public void test1(){
		driver.findElement(By.xpath("//a[text()='Communications']")).click();
		String  actual = driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceHolder1_lblTitle']")).getText();
		String expected = "Communications Overvie";
		String message = "Expected text: '"+expected+"' did not match with actual text: '"+actual+"'";
		Assert.assertEquals(expected, actual, message);
		driver.findElement(By.xpath("//a[text()='Events, Interviews & Trips']"));
	}
	
	@BeforeSuite
	public void launchBrower(){
		driver = new FirefoxDriver();
		driver.navigate().to("http://qa3.hobsonsemt.net/admin/");
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("automation");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	@AfterSuite
	public void closeBrower(){
		driver.quit();
	}
	@Test
	public void test2() throws AWTException{
		driver.findElement(By.xpath("//a[text()='Content']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		 Robot robot = new Robot();
		 robot.keyPress(java.awt.event.KeyEvent.VK_TAB);
	     
		
		
	}
	
	
}
