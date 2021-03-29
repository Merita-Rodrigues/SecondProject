package Script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.FlipkartLoginPage;
import pom.FlipkartHomePagePF;

public class Flipkart {
	@Test
	public void flip() throws IOException, InterruptedException {
	
		WebDriver driver = null;
		Properties prop = new Properties();
	    FileInputStream ip = new FileInputStream("D:\\Automation\\NewProject\\data\\config.properties");	
	    prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\NewProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("FlipkartUrl"));
		Thread.sleep(3000);
		
		FlipkartLoginPage ap=new FlipkartLoginPage(driver);
		ap.Emailid().sendKeys(prop.getProperty("username"));
		ap.Password().sendKeys(prop.getProperty("password"));
		ap.Submit().click();
		Thread.sleep(5000);
		
		FlipkartHomePagePF fh=new FlipkartHomePagePF(driver);
		fh.Text().sendKeys(prop.getProperty("textbox"));
		Thread.sleep(5000);
		fh.Search().click();
		Thread.sleep(5000);
		fh.Filter().click();
		Thread.sleep(5000);
		fh.Brand().click();
		Thread.sleep(5000);
		fh.Mobile().click();
		Thread.sleep(5000);	
}
}
