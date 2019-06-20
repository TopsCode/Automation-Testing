package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Select 
{
	public static void main(String[] args) throws InterruptedException 
	{
//Dropdown list finding
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		//Instatiating Webdriver
		WebDriver driver=new ChromeDriver();
		//Getting url
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Thread.sleep(2000);
		//finding elemnt from dropdown using findelemnt()
		Select s1=new Select(driver.findElement(By.name("country")));
		
		s1.selectByVisibleText("INDIA");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
