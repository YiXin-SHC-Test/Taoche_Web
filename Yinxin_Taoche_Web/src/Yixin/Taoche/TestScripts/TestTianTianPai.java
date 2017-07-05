package Yixin.Taoche.TestScripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Yixin.Taoche.Util.WaitUtil;

public class TestTianTianPai
{
	public WebDriver driver;
	@Test(dependsOnMethods={"openBrowser"})
	public void tianTianPai()
	{
		driver.get("http://maiche.taoche.com");
		WebElement city=driver.findElement(By.xpath("//*[@id='spTTcity']"));
		String cityText = city.getText();
		Assert.assertEquals("北京", cityText);
		WebElement phone=driver.findElement(By.id("txtPhone1"));
		WebElement click=driver.findElement(By.id("sub1"));
		phone.sendKeys("15712808014");
		click.click();
		WaitUtil.sleep(5000);		
		Assert.assertTrue(driver.getPageSource().contains("提交成功！专属顾问会在24小时内联系您"));
	}
	@Test
	public void openBrowser()
	{
		driver=new FirefoxDriver();
	}

}

