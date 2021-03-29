package Script;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.Lib;
import generic.WebBase;
import pom.AmazonWebsitePage;

public class AmazonWebsite extends WebBase
{
	public class click
	{
		AmazonWebsitePage first = new AmazonWebsitePage(driver);

		public void mobile() throws InterruptedException {
			first.SelectMobile();
		}

		public void scroll() throws InterruptedException
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3000)");
			Thread.sleep(3000);
		}

		public void send() throws InterruptedException
		{
			String sms = Lib.getProperty(CONFIG_PATH, "BrandName");
			first.EnterBrand(sms);	
			first.ClickElement();
		}
	}

	@Test(priority=1)
	public void login() throws InterruptedException
	{
		try {
			String url = Lib.getProperty(CONFIG_PATH,"AmazonUrl");
			driver.get(url);
			click a = new click();
			a.mobile();
			a.send();
		}catch(Exception e)
		{
			Reporter.log(e.getMessage(),true);
			Assert.fail();
		}
	}
}
