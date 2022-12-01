package Module1_UpstoxLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginWelcomePage
{
	@FindBy(xpath = "(//div[contains(text(),'No')])[2]") private WebElement NoIMGood;
	
	public UpstoxLoginWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickUpstoxLogindWelcomePage()
	{
		NoIMGood.click();
	}

}
