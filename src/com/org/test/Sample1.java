package com.org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String args[]) throws InterruptedException{
		//File chromefile = new File("C:\\SeleniumScripts\\ConnectQAAutomation\\lib\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\tree1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(50l, TimeUnit.SECONDS);
		driver.navigate().to("https://qawebcenter.applyyourself.com/");
	}

}
