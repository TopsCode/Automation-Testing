package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_4_Css 
{
	public static void main(String[] args) throws InterruptedException
	{
//Accessing elemnt using CSSselector

		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		Thread.sleep(2000);
		//finding email using its cssselector name
		/*driver.findElement(By.cssSelector("input#email")).sendKeys("rahul.sanghavi.mca@gmail.com");
		Thread.sleep(2000);
		*/
		/*driver.findElement(By.cssSelector("input.inputtext")).sendKeys("rahul.sanghavi.mca@gmail.com");
		Thread.sleep(2000);
		*/
		/*driver.findElement(By.cssSelector("input#u_0_b")).click();
		Thread.sleep(2000);*/
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("rahul123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pass']")).clear();
		Thread.sleep(2000);
		driver.close();
	}
}
