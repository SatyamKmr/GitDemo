package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

public WebDriver driver;
public Properties prop;
public WebDriver initializeDriver() throws IOException 
{
	prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Satyam kumar\\eclipse-workspace\\new\\Project\\src\\main\\java\\resource\\data.properties");
	prop.load(fis);
	String browser_name=prop.getProperty("browser");
	if(browser_name.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satyam kumar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	  
	}
	else if(browser_name.equals("firefox"))
	{
		
	}
	else if(browser_name.equals("IE"))
	{
		
	}
	return driver;
}

public void getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot tss=(TakesScreenshot)driver;
	File source=tss.getScreenshotAs(OutputType.FILE);
	String destinationFile=System.setProperty("user.dir","\\reports\\"+testCaseName+".png");
	FileUtils.copyFile(source, new File(destinationFile));
}


}
