package Yixin.Taoche.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDuanYan {
	public WebDriver driver;
	String baseUrl = "http://www.taoche.com";

	@Test
	public void testDuanYan() {
		driver.get(baseUrl);// 注册
		WebElement inputBox = driver.findElement(By.id("txtSearchEr"));
		Assert.assertTrue(inputBox.isDisplayed());  		//判断输入框是否存在
		inputBox.sendKeys("宝马");
		WebElement searchButton=driver.findElement(By.id("btnSearchEr"));
		Assert.assertTrue(searchButton.isDisplayed());  //判断搜索按钮是否存在
		searchButton.click();
		 try
		 {
			 Thread.sleep(5000);
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }   //当点击搜索后，等待5s钟，让页面显示完全
		
		Assert.assertTrue(driver.getPageSource().contains("宝马")); //判断搜索结果页面，是否包含期待关键词
	}

	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}

}
