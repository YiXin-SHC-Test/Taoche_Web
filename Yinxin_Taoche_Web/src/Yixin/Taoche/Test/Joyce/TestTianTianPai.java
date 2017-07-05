package Yixin.Taoche.Test.Joyce;

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
		driver.manage().window().maximize();
		WebElement city=driver.findElement(By.xpath("//*[@id='spTTcity']"));
		String cityText = city.getText();
		Assert.assertEquals("����", cityText);
		city.click();
		WebElement cityshenzhen=driver.findElement(By.xpath(".//*[@id='ttCitys']/p/a[text()='����']"));
		cityshenzhen.click();
		WebElement phone=driver.findElement(By.id("txtPhone1"));
		WebElement click=driver.findElement(By.id("sub1"));
		phone.sendKeys("15712808014");
		click.click();
		WaitUtil.sleep(5000);		
		Assert.assertTrue(driver.getPageSource().contains("�ύ�ɹ���ר�����ʻ���24Сʱ����ϵ��"));
	}
	@Test
	public void openBrowser()
	{
		driver=new FirefoxDriver();
	}

}

