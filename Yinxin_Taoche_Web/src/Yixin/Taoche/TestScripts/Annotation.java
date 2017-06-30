package Yixin.Taoche.TestScripts;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation 
{
  @Test
  public void testCase1()
  {
	  System.out.print("≤‚ ‘”√¿˝1±ª÷¥––");
  }
  @Test
  public void testCase2()
  {
	  System.out.print("2");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.print("first");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.print("after");
  }
}
