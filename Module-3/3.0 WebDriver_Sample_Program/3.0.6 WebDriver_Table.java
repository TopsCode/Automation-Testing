package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Table 
{
	public static void main(String[] args) throws InterruptedException 
	{
//Accessing tables using Webdriver
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		//instantiating webdriver
		WebDriver driver=new ChromeDriver();
		/*
		driver.get("file:///D://bhavin_online//Selenium_Automation//src//html//first.html");
		
		Thread.sleep(2000);
		//finding xpath of data from table
		String cell=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText();
		System.out.println("Cell value is... "+cell);
		Thread.sleep(1000);*/
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(1000);
		
//printing value of data from table		
		String val=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th[1]")).getText();
		System.out.println("value is.. "+val);
	}
}
