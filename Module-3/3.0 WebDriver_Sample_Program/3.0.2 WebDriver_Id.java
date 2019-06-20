package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_3_Id 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		//WebDriver instantiating
		WebDriver driver=new ChromeDriver();
		
                //getting url
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		Thread.sleep(2000);
		//Finding element of webpage by its Id.
		driver.findElement(By.id("email")).sendKeys("rahul.sanghavi.mca");
		Thread.sleep(1000);
		//Finding elemnt of webpage by its Name
		driver.findElement(By.name("pass")).sendKeys("rahul12345");
		Thread.sleep(1000);
		//Finding elemnt by its linktext
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
