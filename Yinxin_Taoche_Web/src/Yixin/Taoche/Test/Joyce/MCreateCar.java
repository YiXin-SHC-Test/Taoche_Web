package Yixin.Taoche.Test.Joyce;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MCreateCar
{
	WebDriver driver;
	@BeforeMethod
	public void  openBrowser()
	{
		driver=new FirefoxDriver();
		driver.get("http://m.taoche.com/sellcar/sellcar.aspx?source=1");
	}
	@Test
	public void createCar() throws IOException, Exception
	{
		WebElement fengmian=driver.findElement(By.id("fileUploadImg1"));
		fengmian.click();
		Runtime.getRuntime().exec("D:\\×Ô¶¯»¯\\test.exe");
		Thread.sleep(15000);
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fileUploadImg1")));		
		
	}
	
	
	

}
