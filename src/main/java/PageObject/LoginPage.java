package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	By semail=By.id("user_email");
	By password=By.id("user_password");
	By login=By.cssSelector("input[name='commit']");
	By title=By.cssSelector("");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(semail);
	}
	public WebElement getPass()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title	);
	}
}
