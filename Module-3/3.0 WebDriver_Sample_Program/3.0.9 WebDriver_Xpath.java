package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_5_Xpath 
{
//Xpath as locator
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		//Webdriver instantiation
		WebDriver driver=new ChromeDriver();
		//getting url
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		Thread.sleep(2000);
		//Finding xpath
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/a")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
