package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

     WebDriver driver;

	public FacebookPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pwd;
	
	@FindBy(id="u_0_b1")
	WebElement click;
	
	public WebElement Email()
	{
		return email;
	}
	public WebElement Password()
	{
		return pwd;
	}
	public WebElement Submit()
	{
		return click;
	}
}
