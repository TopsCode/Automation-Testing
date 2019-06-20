package com.mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenClassDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		//Creating Driver Object
		WebDriver driver=new ChromeDriver();
			driver=new ChromeDriver(); 
		//Login and signout to the application
			driver.get("http://automationpractice.com/index.php");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sign in")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("email")).sendKeys("rahul.sanghavi.mca@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.name("passwd")).sendKeys("rahul12345");
			Thread.sleep(1000);
			driver.findElement(By.name("SubmitLogin")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Sign out")).click();
			Thread.sleep(1000);
			driver.close();
	
	}
}
