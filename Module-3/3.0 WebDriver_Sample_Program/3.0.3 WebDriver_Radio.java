package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Radio 
{
	public static void main(String[] args) throws InterruptedException 
	{
 //Accessing radio button from form
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		//Webdriver instantiation
		WebDriver driver=new ChromeDriver();
		//Getting url
		driver.get("http://demo.guru99.com/test/radio.html");
		
		Thread.sleep(2000);
		//finding radio button here by its id
		driver.findElement(By.id("vfb-7-1")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("vfb-7-2")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-7-3")).click();
		
		Thread.sleep(2000);
		driver.close();
	
	}
}
