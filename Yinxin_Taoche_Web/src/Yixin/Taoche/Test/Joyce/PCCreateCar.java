package Yixin.Taoche.Test.Joyce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Yixin.Taoche.Util.WaitUtil;

public class PCCreateCar {
	static WebDriver driver;

	@Test
	public void pcCreateCar() throws Exception{
		driver.findElement(By.id("li2")).click();
		WaitUtil.sleep(2000);
		driver.findElement(By.id("carSelect2")).click();
		WaitUtil.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='carSelect2_letters_A']/p[1]/a"))
				.click();
		WaitUtil.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='carSelect2_serial_list']/div/p/a[text()='奥迪100']")).click();
		WaitUtil.sleep(2000);
		driver.findElement(By.xpath("//*[@id='carSelect2_cartype_list']/div[1]/p[1]/a")).click();
		WaitUtil.sleep(2000);
		driver.findElement(By.id("ckbReg2")).click();
		WaitUtil.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='citySelect2_provincelist']/p/a[text()='北京']")).click();
//		WaitUtil.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='citySelect2_citylist']/p/a[text()='北京']")).click();
//		WaitUtil.sleep(2000);
//		driver.findElement(By.id("dateSelect2")).click();
//		WaitUtil.sleep(2000);
//		driver.findElement(
//				By.xpath("//*[@id='dateSelect2_year_list']/p/a[text()='2016年']"))
//				.click();
//		WaitUtil.sleep(2000);
//		driver.findElement(
//				By.xpath("//*[@id='dateSelect2_month_list']/p/a[text()='10月']"))
//				.click();
//		WaitUtil.sleep(2000);
		driver.findElement(By.id("txtDrive2")).sendKeys("1");
		WaitUtil.sleep(2000);
		driver.findElement(By.id("txtPrice2")).sendKeys("1");
		WaitUtil.sleep(2000);
		driver.findElement(By.id("txtPhone2")).sendKeys("15321921018");
		WaitUtil.sleep(2000);
		driver.findElement(By.id("smsCode2")).click();
		WaitUtil.sleep(10000);
		String code = getCode();
		WaitUtil.sleep(5000);
		System.out.println(code);
		driver.findElement(By.id("txtCode2")).sendKeys(code);
		WaitUtil.sleep(50000);
		driver.findElement(By.id("aUploadImg")).click();
		Runtime.getRuntime().exec("E:\\test.exe");
		WaitUtil.sleep(1000);
		driver.findElement(By.id("ckbToDealer2")).click();
		WaitUtil.sleep(1000);
		driver.findElement(By.id("ckbToTtpc2")).click();
		WaitUtil.sleep(1000);
		driver.findElement(By.id("sub2")).click();
		Assert.assertTrue(driver.getPageSource().contains("发布成功"));				
	}

	public static String getCode() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ajax.taoche.cn/smscode/getautotestcode.ashx?m=15321921018&t=1");
		WebElement element = driver.findElement(By.xpath("html/body"));
		String text = element.getText();
		return text;
	}

	@BeforeMethod
	public void openBrowser() {
		/*System.setProperty("webdriver.chrome.driver",
				"d:\\test\\chromedriver.exe");
	     driver = new ChromeDriver();*/
		driver = new FirefoxDriver();
		driver.get("http://maiche.taoche.com/");
//		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}
}
