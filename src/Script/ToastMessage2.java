package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToastMessage2 {
	@Test
	public void verifytoast() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\WebAutomation\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html#");
		Thread.sleep(4000);
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Hover over me']"))).perform();

		String toastMessage = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println(toastMessage);

		Assert.assertEquals(toastMessage, "Hooray!");
		Thread.sleep(2000);
	
	}


}
