package Module1_UpstoxLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin2_YOB_Page 
{
	@FindBy(xpath = "//input[@id=\"yob\"]") private WebElement YOB;
	
	public UpstoxLogin2_YOB_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpUpstoxLogin2PageYOB(String BirthYear)
	{
		YOB.sendKeys(BirthYear);
	}
	

}
