package Yixin.Taoche.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FirstTestNGDemo 
{
	public WebDriver driver;
	String baseUrl="http://www.taoche.com";
  @Test
    public void testSearch()
   {
	  driver.get(baseUrl+"/");
	  driver.findElement(By.id("txtSearchEr")).sendKeys("奥迪");
	  driver.findElement(By.id("btnSearchEr")).click();
   }
  @BeforeMethod
   public void beforeMethod()
  {
	  driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }

}
