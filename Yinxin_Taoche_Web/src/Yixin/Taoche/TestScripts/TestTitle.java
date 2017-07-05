package Yixin.Taoche.TestScripts;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestTitle
{
	public WebDriver driver;
	@Test(dependsOnMethods={"OpenBrowser"})
	public void GetTitle()
	{
	 driver.get("http://www.taoche.com");
	 String title=driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("�Գ�-��Ѷ�����ٶ��׳���ͬͶ�ʵ��³����ֳ�����ƽ̨", title);
	}
	@Test
	public void OpenBrowser()
	{
		driver=new FirefoxDriver();
	}
	@Test(dependsOnMethods={"GetTitle"})
	public void CloseBrowser()
	{
		driver.quit();
	}
}


