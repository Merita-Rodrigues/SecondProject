package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartHomePage {

     WebDriver driver;

	public FlipkartHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By textbox = By.className("LM6RPg");
	By search = By.className("vh79eN");
    By filter = By.xpath("//*[contains(@title, '6 GB & Above')]");
	By brand =  By.xpath("//*[contains(@title, 'Realme')]");

			
	public WebElement Text()
	{
		return driver.findElement(textbox);
	}
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	public WebElement Filter()
	{
		return driver.findElement(filter);
	}
	public WebElement Brand()
	{
		return driver.findElement(brand);
	}
}
