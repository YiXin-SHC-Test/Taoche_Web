package Yixin.Taoche.Test.Joyce;

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
		WaitUtil.sleep(5000); 
		//Thread.sleep(10000);
		//WebDriverWait wait=new WebDriverWait(driver, 10);		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fileUploadImg1")));		
		WebElement carName=driver.findElement(By.id("aCar"));
		carName.click();
		WaitUtil.sleep(5000);
		WebElement carPinpai=driver.findElement(By.xpath("//span[text()='±êÖÂ']"));
		carPinpai.click();
		WaitUtil.sleep(5000);
		WebElement carChexi=driver.findElement(By.xpath("//*[@id='popSerial']/div/div[3]/div[2]/div/ul/li[4]/a"));
		carChexi.click();
		WaitUtil.sleep(5000);
		WebElement carChexing=driver.findElement(By.xpath("//*[@id='chooseCarPopup']/div[3]/div/ul/li[1]/a"));
		carChexing.click();
		WaitUtil.sleep(5000);
		WebElement time=driver.findElement(By.id("aBuyCarDate"));
		time.click();
		WebElement year=driver.findElement(By.xpath("//*[@id='popDateYear']/div/ul/li[2]/a"));
		year.click();
		WebElement nonth=driver.findElement(By.xpath("//*[@id='popDateMonth']/div/ul/li[13]/a"));
		nonth.click();
		
		
		
		
		
	}
}
