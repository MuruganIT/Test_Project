package com.org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
public static void main(String args[]){
	//System.setProperty("webdriver.gecko.driver", "D:\\Murugan Data\\Official\\software\\geckodriver.exe");
	//String marionetteDriverLocation = "D:\\Murugan Data\\Official\\software\\geckodriver.exe";
   // System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);
    //WebDriver driver = new MarionetteDriver();
    //DesiredCapabilities capabilitiesff = DesiredCapabilities.firefox();
    //capabilitiesff.setCapability("marionette", true);
    //capabilitiesff.setCapability("javascriptEnabled", true);
    //driver = new FirefoxDriver(capabilitiesff);
	
    	 WebDriver driver = new FirefoxDriver();
    
         driver.navigate().to(("https://www.flipkart.com/"));
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver.manage().window().maximize();  
         //driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("automation");
         //driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password#1");
         //driver.findElement(By.xpath("//input[@value='Login']")).click();
         //driver.get("https://qa3.hobsonsemt.net/admin/Admin/AdminHome.aspx");
       //  driver.navigate().to(("https://qa3.hobsonsemt.net/admin/Admin/AdminHome.aspx"));
         
         /*driver.findElement(By.xpath("//button[@class='_n_31 ms-fwt-r o365button']//span[2]")).click();
         System.out.println("Click = 'Unread' mail");
         driver.findElement(By.xpath("//button[@aria-label='Unread']//span[text()='Unread']")).click();
         System.out.println("Click =  mail");
         driver.findElement(By.xpath("//span[text()='AppReview new user account set up']/ancestor::div[1]")).click();
         System.out.println("Click on 'Link'");
         driver.findElement(By.xpath("//a[text()='Click here to create your initial password']")).click();
         System.out.println("Task Ended");
         */
	 
	 /*driver.navigate().to(("https://webcenterdemo.applyyourself.com"));
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.manage().window().maximize(); 
     driver.findElement(By.xpath("//input[@name='ClientID']")).sendKeys("ayauto");
     driver.findElement(By.xpath("//input[@name='UserID']")).sendKeys("ay_jreddy");
     driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Aaaa111!");
     driver.findElement(By.xpath("//input[@alt='Login']")).click();
     Actions actions = new Actions(driver);
     WebElement we = driver.findElement(By.xpath("//div[@id='oMenu_mnuSelMod_0']"));
     actions.moveToElement(we).build().perform();
     */
    // driver.findElement(By.xpath("//li[contains(@id,'tab')]/a[text() = 'Admin']")).click();
     //String expected =   "Overview;Users;New;Manage;Groups;New;Manage;Roles;New;Manage;Record Access Accounts;New;Manage;Manage Profile";
     //driver.findElement(By.xpath("//h1[a[contains(text(),'Groups')]]/following-sibling::ul//a[text()='Manage']")).click();
     //driver.findElement(By.xpath("//table[@id='Table12']//td[text()='AAAA']/preceding-sibling::td//input")).click();
     //driver.findElement(By.xpath("//input[@value='Delete']")).click();
     
    // String expected1 = expected.replace(";", "\n");
     
     /*ring actual = driver.findElement(By.xpath("//b[span[contains(@id,'lblBottomDeleteMsgPart1')]]")).getText();
     String expected1 = "Groups will be deleted permanently from the database.";
     if(actual.equals(expected1)){
    	 System.out.println("pass");
    	 System.out.println("The expected: '"+expected1+"'. Actual: '"+actual+"'");
     }else{
    	 System.out.println("fail");
    	 System.out.print("The expected: '"+expected1+"'");
    	 System.out.print("Actual: '"+actual+"'");
     }
      */ 
    /* driver.findElement(By.xpath("//h1/a[text()='Users']/parent::h1/following-sibling::ul/li/a[text()='New']")).click();
     System.out.println(driver.findElement(By.xpath("//div[span[text()='User Information']]/following-sibling::table[@class='formtable']//tbody//tr//label[contains(text(),'First Name')]/ancestor::tr")).getText());
    System.out.println("------------");
    String text = driver.findElement(By.xpath("//div[span[text()='User Information']]/following-sibling::table[@class='formtable']//tbody//tr//label[contains(text(),'First Name')]/ancestor::tr")).getText();
    String expected = "First Name * :";
    System.out.println(text.trim());
    if(expected.equals(text.trim())){
    	System.out.println("the 'expected and 'Actual are equal");
    }else{
    	System.out.println("the expected and actual are not equal");
    }*/
     
     /*driver.findElement(By.xpath("//td[span[text()='ZC Nissar']]/following-sibling::td//a")).click();
     
     String table = "//table[@id='ctl00_ContentPlaceHolder1_GenericContactsNavigatorControl1_grdContacts_ctl01']";
     String tablecolumnclick = table + "//th//a[contains(text(),'z~!@#%^()_`-={}|[]')]";
        
     List<WebElement> we = driver.findElements(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_GenericContactsNavigatorControl1_grdContacts_ctl01']//td[17]"));
        
     ArrayList<String> listStrings = new ArrayList<>();
     
     for(int i=0;i<we.size();i++){
    	 String actualData = we.get(i).getText();
    	 listStrings.add(actualData);
    	 System.out.println("Before sort");
    	 System.out.println(actualData);
     }
     driver.findElement(By.xpath(tablecolumnclick)).click();
     Collections.sort(listStrings);
     for(int j=0; j<listStrings.size();j++){
    	 System.out.println("Aftersort");
    	 System.out.println(listStrings.get(j));*/
         
         
         driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("lenovo p2");
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         driver.findElement(By.xpath("//a[@title='Lenovo P2 (Grey/Graphite Grey, 32 GB)']")).click();
         driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
         
         
         
         
         
         
         
         
     }
    

     
}
