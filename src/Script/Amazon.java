package Script;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import generic.WebBase;
import pom.AmazonPage;


public class Amazon extends WebBase {
	
	@Test
	public void flip() throws IOException, InterruptedException {
	
		Properties prop = new Properties();
	    FileInputStream ip = new FileInputStream("D:\\Automation\\NewProject\\data\\config.properties");	
	    prop.load(ip);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get(prop.getProperty("AmazonUrl"));
		Thread.sleep(3000);
		
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle =driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Verification successful");
		}
		else
		{
			System.out.println("Verification failed");

		}
	
		AmazonPage amz=new AmazonPage(driver);
		amz.getSelectOption().selectByVisibleText("Books");
		Thread.sleep(3000);
	    amz.ClickonSearch().click();
		Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,1500)");
	    Thread.sleep(3000);
		amz.English().click();
		System.out.println("Successfully clicked on English language");
		Thread.sleep(5000);  
	
		List<WebElement> book = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div/div"));
		Thread.sleep(3000); 
		System.out.println(book.size());
		for(int i=0; i<book.size();i++)
		{
			Thread.sleep(2000); 
			String txt = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div["+(i+1)+"]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")).getText();
			System.out.println(txt);
			String expected = "The 7 Keys to Success: Awakening to Your Life Purpose";
			Thread.sleep(3000);
			if(txt.equals(expected)){
				Thread.sleep(1000);
				System.out.println("Book found");
			    js.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(3000);
			    amz.Hindi().click();
				System.out.println("Successfully clicked on Hindi language");
			 }
			else {
				System.out.println("Book not found");
		   	 } 
		   }		
		        amz.KeyBook().click();
		
	      }
       }








