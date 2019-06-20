package com.ng1;


import java.io.File;

import java.io.IOException;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;


public class WorkWithscreenShot 
{
	
public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new  ChromeDriver();
		
Thread.sleep(2000);
		
WebElement searchBox=driver.findElement(By.id("lst-ib"));
		
searchBox.sendKeys("Apple");
		
/*WebElement searchButton=driver.findElement(By.name("btnK"));
		
searchButton.click();*/
		
searchBox.sendKeys(Keys.ENTER);
		
//driver.findElement(By.name("btnK")).click();
		
Thread.sleep(2000);
		
File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
System.out.println(file.getAbsolutePath());
		
System.out.println(file.getName());
		
File afile=new File("/home/tops/Documents/EclipseWorkspace/DharaWorkspaceFT/AutomationConcepts/src/images/"+file.getName());
		
		
try {
			
FileUtils.copyFile(file, afile);
		
} 
catch (IOException e)
 {
			
e.printStackTrace();
		
}
		
		
driver.quit();
	}

}
