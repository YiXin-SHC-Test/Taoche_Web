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
		String inputString="�ִ�";
	    WebElement input=driver.findElement(By.id("txtSearchEr"));
	    WebElement button=driver.findElement(By.id("btnSearchEr")); //�������
	    input.clear(); //���Ĭ������
	    input.sendKeys(inputString);
	    button.click();
	    try 
	    {
	    	Thread.sleep(5000);
			
		} 
	    catch (InterruptedException e) 
		{
			e.printStackTrace(); //��ӡ�쳣����
		}
	    Assert.assertTrue(driver.getPageSource().contains("�ִ�"));
	}

    @Test
    public void openBrowser()
    {
	driver=new FirefoxDriver();
    }
}
