package com.ng1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeywordDemo 
{
	@DataProvider(name="keywordexample")
	public static Object[][] readExcel() throws InvalidFormatException, IOException
	{
		Object[][] data=null;
		
		String filepath="C:\\Users\\Admin\\Downloads\\logindetails (1).xlsx";
		
		File file=new File(filepath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		Sheet sheet=workbook.getSheet("Sheet6");
		
		int noofrows=sheet.getPhysicalNumberOfRows();
		System.out.println("Total Rows is.. "+noofrows);
		
		data=new Object[noofrows][];
		
		for(int i=0;i<noofrows;i++)//row 
		{
			
			Row row=sheet.getRow(i);
			
			int cells =row.getPhysicalNumberOfCells();
			System.out.println("Total cols is.. "+cells);
			
			
			data[i]=new Object[cells];
			
			for(int c=0;c<cells;c++)//column
			{
				Cell cols=row.getCell(c);
				
				cols.setCellType(CellType.STRING);
				
				String value=cols.getStringCellValue();
			
				data[i][c]=value;
				System.out.println(value);
			}	
		}
		return data;
	}
	WebDriver driver=null;
	
	@Test(dataProvider="keywordexample")
	public void test(String keyword,String data) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		
		if(keyword.equalsIgnoreCase("open"))
		{
			driver=new ChromeDriver(); 
			//Thread.sleep(2000);
		}
		else if(keyword.equalsIgnoreCase("loadurl"))
		{
			driver.get(data);
			//Thread.sleep(2000);
		}
		else if(keyword.equalsIgnoreCase("signin"))
		{
			driver.findElement(By.linkText("Sign in")).click();
			//Thread.sleep(1000);
		}
		else if(keyword.equalsIgnoreCase("enteremail"))
		{
			driver.findElement(By.name("email")).sendKeys(data);
			//Thread.sleep(1000);
		}
		else if(keyword.equalsIgnoreCase("enterpassword"))
		{
			driver.findElement(By.name("passwd")).sendKeys(data);
			//Thread.sleep(1000);
		}
		else if(keyword.equalsIgnoreCase("clicklogin"))
		{
			driver.findElement(By.name("SubmitLogin")).click();
			//Thread.sleep(2000);
		}
		else if(keyword.equalsIgnoreCase("clicklogout"))
		{
			driver.findElement(By.linkText("Sign out")).click();
			//Thread.sleep(2000);
		}
		else if(keyword.equalsIgnoreCase("closebrowser"))
		{
			driver.close();
		}
	}
}
