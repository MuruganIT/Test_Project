package com.org.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class aytest {
	public static void main(String args[]) throws InterruptedException{
		 WebDriver driver = new FirefoxDriver();
		//String marionetteDriverLocation = "D:\\Murugan Data\\Official\\software\\wires.exe";
	   // System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);	
		
		
	    //File chromefile = new File("C:\\SeleniumScripts\\ConnectQAAutomation\\lib\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", chromefile.getAbsolutePath());
		//WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(50l, TimeUnit.SECONDS);
		 driver.navigate().to("https://qawebcenter.applyyourself.com/");
         
		 driver.findElement(By.xpath("//input[@name='ClientID']")).sendKeys("ayauto");
		 driver.findElement(By.xpath("//input[@name='UserID']")).sendKeys("ay_automation");
		 driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Auto123+");
		 driver.findElement(By.xpath("//input[@name='imageField2']"));
		 Actions actions = new Actions(driver);
		 WebElement toElement = driver.findElement(By.xpath("//div[@id='oMenu_mnuSelMod']"));
		 actions.moveToElement(toElement).build().perform();
		 toElement = driver.findElement(By.xpath("//div[@id='oMenu_mnuAdm']"));
		 
		 actions.moveToElement(toElement).build().perform();
		 toElement = driver.findElement(By.xpath("//div[@id='oMenu_2_0']//div[@id='oMenu_oMenu5']"));
		 actions.moveToElement(toElement).build().perform();
		 toElement.click();
		 driver.close();
	
	 
		 toElement= driver.findElement(By.xpath("//div[@id='oMenu_oMenu5_0']"));
		 actions.moveToElement(toElement).build().perform();
		 driver.findElement(By.xpath("//div[@id='oMenu_oMenu5_0']//div[text()='Search for Applicants']")).click();
		 System.out.println("About to select Days");
		
		 toElement = driver.findElement(By.xpath("//table//select[@class='FormFields' and @name='Days']"));
		 Select sel = new Select(toElement);
		 sel.selectByVisibleText("30 Day");
		 
		 
		 driver.findElement(By.xpath("//tr[@class='FormHeading']//input[@name='imageField']")).click();
		 //driver.findElement(By.xpath("//div[text()='Search for Applicants']")).click();
		 driver.findElement(By.xpath("//tr[td[a[text()='SmokeTest1482408638397, SMOKETEST1482408638084']]]//img[@alt='Print Application']")).click();
		 System.out.println("The Print Application clicked successfully");
		 Thread.sleep(1000);
		 
		 Set<String> winhand = driver.getWindowHandles();
		 Iterator<String> itrwinhand = winhand.iterator();
		 String parent = itrwinhand.next();
		 
		 String child = itrwinhand.next();
		 driver.switchTo().window(child);
		 System.out.println("The child window switched successfully");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 System.out.println("sleep finished");
		 driver.findElement(By.xpath("//div[@class='textLayer']//div[1]")).click();
		 System.out.println("element clicked");
		 List<WebElement> we = driver.findElements(By.xpath("//div[@class='textLayer']//div"));
		 System.out.println("###"+we.size());
		 for(int i = 1;i<we.size();i++){
			 System.out.println("The size of element=" +we.size());
			 System.out.println(we.get(i).getText());
		 }
		 
		 
	}

}
