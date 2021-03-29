package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToastMessage1 {
	
@Test
	public static void verifytoast() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\WebAutomation\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://codeseven.github.io/toastr/demo.html");
	
	
		String toastMessage = driver.findElement(By.className("toast-message")).getText();
		System.out.println("Title of the toast message is:"+" "+toastMessage);
	
		Thread.sleep(2000);
	}

}
