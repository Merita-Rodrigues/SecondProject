package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class WebBase implements AutoConst{
	
static
{
	
	System.setProperty(CHROME_KEY,CHROME_VALUE);	
	
}


  public static WebDriver driver;
  @BeforeClass
public void OpenApplication()
{
	try
	{
	Reporter.log("Browser session started",true);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	} catch(Exception e)
	{
		Reporter.log("Server down",true);
		System.out.println(e);
	}
}
	
  
  
}
