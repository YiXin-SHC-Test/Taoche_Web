package Yixin.Taoche.Test.Joyce;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Yixin.Taoche.Util.WaitUtil;


public class MCreateCar
{
	WebDriver driver;
	@BeforeMethod
	public void  openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "d:\\test\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://m.taoche.com/sellcar/sellcar.aspx?source=1");
		
	}
	@Test
	public void CreateCar() throws Exception
	{
		WebElement fengmian=driver.findElement(By.id("fileUploadImg1"));
		fengmian.click();
		Runtime.getRuntime().exec("E:\\test.exe");
		WaitUtil.sleep(2000); 
		//Thread.sleep(10000);
		//WebDriverWait wait=new WebDriverWait(driver, 10);		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fileUploadImg1")));		
		WebElement carName=driver.findElement(By.id("aCar"));
		carName.click();
		WaitUtil.sleep(2000);
		WebElement carPinpai=driver.findElement(By.xpath("//span[text()='标致']"));
		carPinpai.click();
		WaitUtil.sleep(2000);
		WebElement carChexi=driver.findElement(By.xpath("//*[@id='popSerial']/div/div[3]/div[2]/div/ul/li[4]/a"));
		carChexi.click();
		WaitUtil.sleep(2000);
		WebElement carChexing=driver.findElement(By.xpath("//*[@id='chooseCarPopup']/div[3]/div/ul/li[1]/a"));
		carChexing.click();
		WaitUtil.sleep(2000);
		WebElement shangpaitime=driver.findElement(By.id("aBuyCarDate"));
		shangpaitime.click();
		WaitUtil.sleep(2000);
		WebElement year=driver.findElement(By.xpath("//*[@id='popDateYear']/div/ul/li[2]/a"));
		year.click();
		WaitUtil.sleep(2000);	
		WebElement nonth=driver.findElement(By.xpath("//*[@id='popDateMonth']/div/ul/li[13]/a"));
		nonth.click();
		WaitUtil.sleep(2000);
		WebElement shangpaiaArea=driver.findElement(By.id("aArea"));
		shangpaiaArea.click();
	    WaitUtil.sleep(2000);
		WebElement shangpaiaSheng=driver.findElement(By.xpath("//*[@id='ulProvince']/li[3]/a"));
		shangpaiaSheng.click();
		WaitUtil.sleep(2000);
		WebElement shangpaiaCity=driver.findElement(By.xpath("//*[@id='divCityContent']/ul/li[2]/a[text()='北京']"));
		shangpaiaCity.click();
		WaitUtil.sleep(2000);
		WebElement mileage=driver.findElement(By.id("txtMileage"));
		mileage.sendKeys("1");
		WaitUtil.sleep(2000);
		WebElement color=driver.findElement(By.id("aColor"));
		color.click();
		WaitUtil.sleep(2000);
		WebElement carcolor=driver.findElement(By.xpath("//a[text()='黑色']"));
		carcolor.click();
		WaitUtil.sleep(2000);
		WebElement carmoney=driver.findElement(By.id("txtPrice"));
		carmoney.sendKeys("1");		
		WaitUtil.sleep(2000);
		WebElement username=driver.findElement(By.id("txtName"));
		username.sendKeys("测试");
		WaitUtil.sleep(2000);
		WebElement userMobile=driver.findElement(By.id("txtMobile"));
		userMobile.sendKeys("15321921018");	
	    WaitUtil.sleep(2000);
		WebElement carArea=driver.findElement(By.id("aCarArea"));
		carArea.click();
	    WaitUtil.sleep(2000);
     	WebElement carAreaSheng=driver.findElement(By.xpath("//a[text()='北京']"));
     	carAreaSheng.click();
		WaitUtil.sleep(2000);
		WebElement carAreaCity=driver.findElement(By.xpath("//*[@id='divCityContent']/ul/li[2]/a[text()='北京']"));
		carAreaCity.click();				
		WaitUtil.sleep(2000);
		WebElement dayForm=driver.findElement(By.xpath(".//*[@id='Form1']/div[13]/div/em"));
		dayForm.click();
		WaitUtil.sleep(2000);
		WebElement setButton=driver.findElement(By.id("lnkSubmit"));
		setButton.click();	
		WaitUtil.sleep(2000);
		Assert.assertTrue(driver.getPageSource().contains("发布成功"));
//		WebElement success=driver.findElement(By.xpath(".//*[@id='popSuccess']/div[1]/div/p"));
//		String successtext=success.getText();
//		System.out.println(successtext);
//		Assert.assertEquals("发布成功", successtext);
	}
}
