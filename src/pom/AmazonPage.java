package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPage  {

    WebDriver driver;

	public AmazonPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="searchDropdownBox")
	WebElement dropdown;
	
	@FindBy(xpath="//*[@id=\"nav-search\"]/form/div[2]")
	WebElement clickonsearch;
	
	@FindBy(xpath="//*[@id=\"leftNav\"]/ul[4]/div/li[1]/span/span/div/label")
	WebElement eng;
	
    @FindBy(linkText="The 7 Keys to Success: Awakening to Your Life Purpose")
	WebElement keybook;
    
    
    @FindBy(xpath="//*[@id=\"p_n_feature_three_browse-bin/9141483031\"]/span/a/div/label/i")
    WebElement hin;
   
	public Select getSelectOption()
	{
	return new Select(dropdown);
	}
	public WebElement ClickonSearch()
	{
		return clickonsearch;
	}
    public WebElement English()
    {
        return eng;
    }
    public WebElement KeyBook()
    {
        return keybook;
    } 
    
    public WebElement Hindi()
    {
        return hin;
    }	
   	
    }
