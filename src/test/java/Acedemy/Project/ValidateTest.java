package Acedemy.Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.LandingPage;
import resource.base;

public class ValidateTest extends base {
	public WebDriver driver;
	
	@BeforeTest
	public void initilisation() throws IOException
	{
		//driver=initializeDriver();
		//driver.get(prop.getProperty("url"));
	}
	
    @Test
	public void basePageNavigation() throws IOException 
	{
    	driver=initializeDriver();
		driver.get(prop.getProperty("url"));	
		LandingPage Lpage=new LandingPage(driver);
	    Assert.assertEquals(Lpage.getTitle().getText(), "FEATURED COURSES");
	  
	}
    
    @AfterTest
    public void teardown()
    {
    driver.close();	
    }
	
}
