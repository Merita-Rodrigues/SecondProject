package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonWebsitePage {
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[2]")
	WebElement mobile;
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement enterbrand;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement clickele;
   
	public AmazonWebsitePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void SelectMobile() throws InterruptedException
	{
		mobile.click();
		Thread.sleep(2000);
	}
	
	public void EnterBrand(String sms) throws InterruptedException
	{
		enterbrand.sendKeys(sms);
		Thread.sleep(2000);
	}
    
    public void ClickElement() throws InterruptedException
    {
        clickele.click();
        Thread.sleep(2000);
    }	
	
}

