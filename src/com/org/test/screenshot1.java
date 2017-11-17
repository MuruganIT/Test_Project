package com.org.test;


public class screenshot1 {
	public static void main(String[] args) throws Exception {

        /*WebDriver driver = new FirefoxDriver();

        try{
            driver.get("http://google.co.in");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            
            //driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("test");
             * 
            driver.findElement(By.xpath("//input[@id='gbqfq1']")).sendKeys("test");
            System.out.println("Entered data in textfield");    
        }   
        catch (Exception e)
        {  
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
            FileUtils.copyFile(scrFile, new File("D:\\screenShot1.png"));
            System.out.println("Screenshot is captured for failed testcase");
        }  */
		
		
		
		String s1 = "test";
		
		System.out.println("The string is: "  +s1+ "");
    }  
}
