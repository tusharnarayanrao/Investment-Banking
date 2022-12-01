package Module1_UpstoxLogin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.auto.common.MoreElements;

import Labrary_File.UtilityClass;

public class UpstoxWatchlistStockAddPage<listWebElement> 
{
	private static final WebElement[] AutoSuggetion = null;
	@FindBy(xpath = "//button[@data-id=\"watchlistAdd\"]") private WebElement AddBTN;
	@FindBy(xpath = "(//input[@type=\"text\"])[1]") private WebElement Searchbox;
	@FindBy(xpath = "//div[@class=\"_1-409uMocfImVt8m4g_uMP\"]/div/div/div") private WebElement Autosuggetion;
	@FindBy(xpath = "//button[@id=\"NSE_EQ|3456\"]") private WebElement AddStoxBTN;
    
	
	public UpstoxWatchlistStockAddPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickUpstoxAddBtn()
	{
		AddBTN.click();
	}
	
	public void clickUpstoxSearchbox(String comname)
	{
		Searchbox.sendKeys(comname);
	}

	public String selectfromlAutosuggetion() 
	{
		return Autosuggetion.getText();
		
		
	
		
//		if(actstock.equals(expstock))
//		{
//			Thread.sleep(2000);
//			AddPlus.click();
//		}
		
	}
	public void clickaddBtnWatchlist()
	{
		AddStoxBTN.click();
	}

}
