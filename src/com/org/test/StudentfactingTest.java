package com.org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StudentfactingTest {
	public static void main(String args[]){
	WebDriver driver = new FirefoxDriver();
	
    driver.navigate().to(("https://qa5.hobsonsemt.net/Portal/EI/Search"));
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.findElement(By.id("CLASSIFICATION_2")).click();
    driver.findElement(By.id("Search")).click();
    String page = driver.findElement(By.xpath("//div[@class='simplegrid-buttongroup-page']")).getText();
    String pageNoArray[] = page.split("Page of");
    int totalPage = Integer.parseInt(pageNoArray[1].trim());
	System.out.println(totalPage);
	}    
}
