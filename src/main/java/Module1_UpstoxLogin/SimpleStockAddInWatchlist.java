package Module1_UpstoxLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleStockAddInWatchlist 
{
	@FindBy(xpath = "//button[@data-id=\"watchlistAdd\"]") private WebElement AddBTN;
	@FindBy(xpath = "(//input[@type=\"text\"])[1]") private WebElement Searchbox;
	@FindBy(xpath = "//button[@id=\"NSE_EQ|3456\"]") private WebElement AddStoxBTN;
	
	
    public SimpleStockAddInWatchlist(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clicksimpleAdd()
    {
    	AddBTN.click();
    }
    public void inpSearchSample(String Search)
    {
    	Searchbox.sendKeys(Search);
    }
    public void clickStockSample()
    {
    	AddStoxBTN.click();
    }
    
	
}
