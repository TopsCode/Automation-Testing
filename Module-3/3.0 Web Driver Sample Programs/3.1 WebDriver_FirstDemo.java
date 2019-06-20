package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		//Object Instantiation
		WebDriver driver=new ChromeDriver();
		//Launching the web browser
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
                //closing driver
		driver.close();
	}
}
