package Yixin.Taoche.TestScripts;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ClearInputBox
{
	public WebDriver driver;
	@Test(dependsOnMethods={"openBrowser"})
	public void clearInputBox()
	{
		driver.get("http://www.taoche.com");
		String inputString="现代";
	    WebElement input=driver.findElement(By.id("txtSearchEr"));
	    WebElement button=driver.findElement(By.id("btnSearchEr")); //定义参数
	    input.clear(); //清除默认文字
	    input.sendKeys(inputString);
	    button.click();
	    try 
	    {
	    	Thread.sleep(5000);
			
		} 
	    catch (InterruptedException e) 
		{
			e.printStackTrace(); //打印异常报告
		}
	    Assert.assertTrue(driver.getPageSource().contains("现代"));
	}

    @Test
    public void openBrowser()
    {
	driver=new FirefoxDriver();
    }
}
