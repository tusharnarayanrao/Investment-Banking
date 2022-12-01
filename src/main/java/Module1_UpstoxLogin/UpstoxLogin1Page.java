package Module1_UpstoxLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1Page 
{
	@FindBy(xpath = "//input[@id=\"userCode\"]") private WebElement Un;
	@FindBy(xpath = "//input[@id=\"password\"]") private WebElement Pas;
	@FindBy(xpath = "//div[contains(text(),'Sign into')]") private WebElement LoginBTN;	
    
	public UpstoxLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpUsernameUpstoxLoginPage(String Username)
	{
		Un.sendKeys(Username);
	}
	
	public void inpPasswordUpstoxLoginPage(String Password)
	{
		Pas.sendKeys(Password);
	}
	
	public void clickLoginBTNUpstoxLoginPage()
	{
		LoginBTN.click();
	}
	
}
