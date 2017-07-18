package Yixin.Taoche.TestScripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Yixin.Taoche.PageObjects.CreateCarPage;
import Yixin.Taoche.Util.WaitUtil;

public class TestCreateCarPage {
	static WebDriver driver;

	@Test
	public void pcCreateCar() throws Exception {
		CreateCarPage createCarPage = new CreateCarPage(driver);
		// 切换个人卖车tab
		createCarPage.tab().click();
		WaitUtil.sleep(2000);
//		WaitUtil.waitWebelement(driver,
//				".//*[@id='carSelect2_letters_A']/p[1]/a");
		// 选择车型按钮
		createCarPage.ChexingBtn().click();
		WaitUtil.sleep(2000);
		// 选择品牌
		createCarPage.PinpaiBtn().click();
		WaitUtil.sleep(2000);
		// 选择车系
		createCarPage.ChexiBtn().click();
		WaitUtil.sleep(2000);
		// 选择车型
		createCarPage.Chexing2Btn().click();
		WaitUtil.sleep(2000);
		// 选择未上牌
		createCarPage.ShangpaidiBtn().click();
		WaitUtil.sleep(2000);
		// 输入表显里程
		createCarPage.LichengInput().sendKeys("1");
		WaitUtil.sleep(2000);
		// 输入车源价格
		createCarPage.PriceInput().sendKeys("1");
		WaitUtil.sleep(2000);
		// 输入手机号
		createCarPage.PhoneInput().sendKeys("15321921018");
		WaitUtil.sleep(2000);
		// 点击获取验证码
		createCarPage.GetCodeBtn().click();
		WaitUtil.sleep(5000);
		// 从接口获取验证码
		String code = getCode();
		WaitUtil.sleep(5000);
		System.out.println(code);
		// 输入验证码
		createCarPage.CodeInput().sendKeys(code);
		WaitUtil.sleep(2000);
		// 选择封面
		createCarPage.FengmianBtn().click();
		Runtime.getRuntime().exec("E:\\test.exe");
		WaitUtil.sleep(2000);
		// 去掉经销商勾选
		createCarPage.JingxiaoshangBtn().click();
		WaitUtil.sleep(2000);
		// 去掉天天拍勾选
		createCarPage.TiantianpaiBtn().click();
		WaitUtil.sleep(2000);
		// 提交
		createCarPage.TijiaoBtn().click();
		WaitUtil.sleep(3000);
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
		System.setProperty("webdriver.chrome.driver",
				"d:\\test\\chromedriver.exe"); // 用谷歌浏览器
		driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.get("http://maiche.taoche.com/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit(); // 关闭浏览器
	}
}
