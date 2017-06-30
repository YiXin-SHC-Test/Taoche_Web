package Yixin.Taoche.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testsearch 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver(); /*Æô¶¯»ðºüä¯ÀÀÆ÷*/;
		String baseUrl;		
		baseUrl="http://www.taoche.com/";
		driver.get(baseUrl);
		driver.findElement(By.id("txtSearchEr")).sendKeys("°ÂµÏ");
		driver.findElement(By.id("btnSearchEr")).click();
	}; 

}
