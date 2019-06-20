package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Check 
{
	public static void main(String[] args) throws InterruptedException 
	{
//Finding checkbox
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		//instantiating webdriver
		WebDriver driver=new ChromeDriver();
		//Geting Url
		driver.get("http://demo.guru99.com/test/radio.html");
		
		Thread.sleep(2000);
	        //finding Checkbox using Id.
		driver.findElement(By.id("vfb-6-0")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-6-2")).click();
		Thread.sleep(2000);
	}
}
