package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePagePF {

     WebDriver driver;

	public FlipkartHomePagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="LM6RPg")
	WebElement textbox;
	
	@FindBy(className="vh79eN")
	WebElement search;
	
	@FindBy(xpath="//*[contains(@title,'6 GB & Above')]")
	WebElement filter;

	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[2]/div/div/label/div[2]")
	WebElement brand;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement mobile;
	
	public WebElement Text()
	{
		return textbox;
	}
	public WebElement Search()
	{
		return search;
	}
	public WebElement Filter()
	{
		return filter;
	}
	public WebElement Brand()
	{
		return brand;
	}
	public WebElement Mobile()
	{
		return mobile;
	}
	
	}
