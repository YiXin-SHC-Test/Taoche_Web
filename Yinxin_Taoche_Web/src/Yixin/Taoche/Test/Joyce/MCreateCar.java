package Yixin.Taoche.Test.Joyce;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Yixin.Taoche.Util.WaitUtil;

public class MCreateCar
{
	WebDriver driver;
	//�������
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
		//�����ϴ�
		driver.findElement(By.id("fileUploadImg1")).click();
		Runtime.getRuntime().exec("E:\\test.exe");
		//ѡ��Ʒ��
		WaitUtil.sleep(2000); 
		driver.findElement(By.id("aCar")).click();
		WaitUtil.sleep(2000);
		driver.findElement(By.xpath("//span[text()='����']")).click();
		//ѡ��ϵ
		WaitUtil.sleep(2000);
		driver.findElement(By.xpath("//*[@id='popSerial']/div/div[3]/div[2]/div/ul/li[4]/a")).click();
		//ѡ����
		WaitUtil.sleep(2000);
        driver.findElement(By.xpath("//*[@id='chooseCarPopup']/div[3]/div/ul/li[1]/a")).click();
        //ѡ������ʱ��
		WaitUtil.sleep(2000);
        driver.findElement(By.id("aBuyCarDate")).click();
        //ѡ��������
		WaitUtil.sleep(2000);
        driver.findElement(By.xpath("//*[@id='popDateYear']/div/ul/li[2]/a")).click();
        //ѡ��������
		WaitUtil.sleep(2000);	
	    driver.findElement(By.xpath("//*[@id='popDateMonth']/div/ul/li[13]/a")).click();
		WaitUtil.sleep(2000);
		//ѡ�����Ƶ�
		driver.findElement(By.id("aArea")).click();
		//ѡ�����Ƶ�ʡ��
	    WaitUtil.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ulProvince']/li[3]/a")).click();
		//ѡ�����Ƶس���
		WaitUtil.sleep(2000);
		driver.findElement(By.xpath("//*[@id='divCityContent']/ul/li[2]/a[text()='����']")).click();
		//ѡ��������
		WaitUtil.sleep(2000);
		driver.findElement(By.id("txtMileage")).sendKeys("1");
		//ѡ������ɫ
		WaitUtil.sleep(2000);
		driver.findElement(By.id("aColor")).click();
		WaitUtil.sleep(2000);
		driver.findElement(By.xpath("//a[text()='��ɫ']")).click();
		WaitUtil.sleep(2000);
		//ѡ��Ԥ�ۼ۸�
		driver.findElement(By.id("txtPrice")).sendKeys("1");		
		WaitUtil.sleep(2000);
		//��������
		driver.findElement(By.id("txtName")).sendKeys("����");
		WaitUtil.sleep(2000);
		//�����ֻ�����
		driver.findElement(By.id("txtMobile")).sendKeys("15321921018");	
	    WaitUtil.sleep(2000);
	    //ѡ�����ڳ���
		driver.findElement(By.id("aCarArea")).click();
	    WaitUtil.sleep(2000);
     	driver.findElement(By.xpath("//a[text()='����']")).click();
		WaitUtil.sleep(2000);
		driver.findElement(By.xpath("//*[@id='divCityContent']/ul/li[2]/a[text()='����']")).click();				
		WaitUtil.sleep(2000);
		//ȥ�������ĳ���ѡ
		driver.findElement(By.xpath(".//*[@id='Form1']/div[13]/div/em")).click();
		WaitUtil.sleep(2000);
		//�ύ
		driver.findElement(By.id("lnkSubmit")).click();	
		WaitUtil.sleep(2000);
		//�����ύ�Ƿ�ɹ�
		Assert.assertTrue(driver.getPageSource().contains("�����ɹ�"));
	}
	//�ر������
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}
