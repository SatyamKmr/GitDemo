package Acedemy.Project;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import resource.base;

public class HomePageTest extends base {
    @BeforeTest
	public void initilastion() throws IOException
	{
		driver=initializeDriver();
		//driver.get("http://www.qaclickacademy.com/");
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException 
	{
		//driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage Lpage=new LandingPage(driver);
		Lpage.getLogin().click();
		LoginPage logp=new LoginPage(driver);
		logp.getEmail().sendKeys(username);
		logp.getPass().sendKeys(password);
		System.out.println(text);
		logp.getLogin().click();
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

	@DataProvider
	public Object[][] getData()
	{
		// row indicate how many different type of data
		//column stand for how many each date
		Object[][] data=new Object[2][3];
		data[0][0]="nonrestructeduser@gmail.com";
		data[0][1]="12345";
		data[0][2]="Restructed_User";
		
		data[1][0]="Restructed@gmail.com";
		data[1][1]="9876";
		data[1][2]="Un_Restructed_User"; 
		return data;
	}
}
