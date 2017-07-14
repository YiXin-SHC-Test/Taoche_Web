package Yixin.Taoche.Test.Joyce;



import junit.framework.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import Yixin.Taoche.Util.WaitUtil;

public class PCSearch
{
	JavascriptExecutor js;
	public WebDriver driver;
	@Test
	public void clearInputBox()
	{
		driver.get("http://www.taoche.com");
		String inputString="现代";
	    WebElement input=driver.findElement(By.id("txtSearchEr"));
	    input.clear(); //清除默认文字
	    //输入关键词
	    input.sendKeys(inputString);
	    WaitUtil.sleep(2000);	    
	    //搜索联想词
	   List<WebElement>suggetionOptions=driver.findElements(By.xpath("//*[@id='divList']/ul/li"));
		for(WebElement element:suggetionOptions)
		{
			if(element.getText().contains("现代 酷派"))
		{
				System.out.println(element.getText());
			element.click();
				break;
		}
		}
	    WaitUtil.sleep(2000);
	    Assert.assertTrue(driver.getPageSource().contains("酷派"));	    
	}
	
    @BeforeMethod
    public void openBrowser()
    {
	driver=new FirefoxDriver();
    }
    @AfterMethod
    public void closeBrowser()
    {
    	driver.quit();
    }
}
