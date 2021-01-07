package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By sign_in=By.cssSelector("a[href*='://rahulshettyacademy.com/sign_']");
	By title=By.cssSelector(".text-center>h2");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(sign_in);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
}
