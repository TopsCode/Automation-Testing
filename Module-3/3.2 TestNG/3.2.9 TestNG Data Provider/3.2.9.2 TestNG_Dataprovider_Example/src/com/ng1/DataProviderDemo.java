package com.ng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
	WebDriver driver=null;
	@DataProvider(name="tops")
	public static Object[][] credential()
	{
		 return new Object[][] { { "rahul.sanghavi.mca@gmail.com", "rahul12345" }, { "rahul@gmail.com", "rahul123" }};
	}
	@Test(dataProvider="tops")
	public void test(String sUsername , String sPassword) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys(sUsername);
		Thread.sleep(1000);
		driver.findElement(By.name("passwd")).sendKeys(sPassword);
		Thread.sleep(1000);
		driver.findElement(By.name("SubmitLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(1000);
		driver.close();

	}
}
