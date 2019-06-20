package com.framework;

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
import org.testng.annotations.Test;

public class DataDrivenDemo 
{
	@Test
	public static String[][] readExcel() throws InvalidFormatException, IOException
	{
		String[][] data=null;
		
		String filepath="C:\\Users\\Admin\\Downloads\\logindetails.xlsx";
		
		File file=new File(filepath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		Sheet sheet=workbook.getSheet("Sheet6");
		
		int noofrows=sheet.getPhysicalNumberOfRows();
		System.out.println("Total Rows is.. "+noofrows);
		
		data=new String[noofrows][];
		
		for(int i=0;i<noofrows;i++)//row 
		{
			
			Row row=sheet.getRow(i);
			
			int cells =row.getPhysicalNumberOfCells();
			System.out.println("Total cols is.. "+cells);
			
			
			data[i]=new String[cells];
			
			for(int c=0;c<cells;c++)//column
			{
				Cell cols=row.getCell(c);
				
				cols.setCellType(CellType.STRING);
				
				String value=cols.getStringCellValue();
			
				data[i][c]=value;
			}	
		}
		return data;
	}
	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tops\\Java_ST_Automation2018\\selenium\\selenium\\driver\\chromedriver.exe");
		String[][] data=readExcel();
		for(int i=0;i<data.length;i++)
		{
		
			driver=new ChromeDriver(); 
			driver.get("http://automationpractice.com/index.php");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sign in")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("email")).sendKeys(data[i][0]);
			Thread.sleep(1000);
			driver.findElement(By.name("passwd")).sendKeys(data[i][1]);
			Thread.sleep(1000);
			driver.findElement(By.name("SubmitLogin")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Sign out")).click();
			Thread.sleep(1000);
			driver.close();
		}
	}
}
