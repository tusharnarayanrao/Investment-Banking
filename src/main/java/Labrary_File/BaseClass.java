package Labrary_File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass 
{
	public WebDriver driver;

	@SuppressWarnings("deprecation")
	
	public void initialisationOfBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.get(UtilityClass.propertyfile("URL"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

}
