package Module1_UpstoxLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogoutPage 
{
	@FindBy(xpath = "//span[text()='shivam w.']") private WebElement UserNameArrow;
	@FindBy(xpath = "//div[text()='Logout']") private WebElement LogoutOPT;
    
	public UpstoxLogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickUsernameArrow()
	{
		UserNameArrow.click();
	}
	
	public void clickUpstoxLogoutOpt()
	{
		LogoutOPT.click();
	}
	
}
