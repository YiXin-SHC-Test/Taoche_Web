package Yixin.Taoche.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testsearch 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver(); /*������������*/;
		String baseUrl;		
		baseUrl="http://www.taoche.com/";
		driver.get(baseUrl);
		driver.findElement(By.id("txtSearchEr")).sendKeys("�µ�");
		driver.findElement(By.id("btnSearchEr")).click();
	}; 

}
