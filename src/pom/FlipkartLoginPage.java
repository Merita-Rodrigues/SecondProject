package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartLoginPage {

     WebDriver driver;

	public FlipkartLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By username = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By login = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");

	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(login);
	}
	
	
	
}