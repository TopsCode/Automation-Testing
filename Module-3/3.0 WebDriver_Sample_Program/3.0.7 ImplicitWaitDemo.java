package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
//Implicit wait demo
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		//Insantiating Webdriver
		WebDriver driver=new ChromeDriver();
		
//Wating for seconds maintioned used implicitlyWait()
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("rahul.sanghavi.mca@gmail.com");
		Thread.sleep(1000);
		
		driver.close();
	
	}
}
