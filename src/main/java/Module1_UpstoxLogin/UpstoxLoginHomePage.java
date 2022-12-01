package Module1_UpstoxLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginHomePage 
{
	@FindBy(xpath = "//span[text()='shivam w.']") private WebElement UN;
    
	public UpstoxLoginHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getUpstoxHomePageUserName()
	{
		String acttext = UN.getText();
		return acttext;
	}
	
	
}
