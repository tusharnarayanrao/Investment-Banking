package Module1_UpstoxLogin_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Labrary_File.BaseClass;
import Labrary_File.UtilityClass;
import Module1_UpstoxLogin.SimpleStockAddInWatchlist;
import Module1_UpstoxLogin.UpstoxLogin1Page;
import Module1_UpstoxLogin.UpstoxLogin2_YOB_Page;
import Module1_UpstoxLogin.UpstoxLoginHomePage;
import Module1_UpstoxLogin.UpstoxLoginWelcomePage;
import Module1_UpstoxLogin.UpstoxLogoutPage;
import Module1_UpstoxLogin.UpstoxWatchlistStockAddPage;

public class Upstox_Login_Madule_Test extends BaseClass
{
	//Deceleration Of Object
	//WebDriver driver;
	int TCno;
	BaseClass browser;
	UpstoxLogin1Page login1;
	UpstoxLogin2_YOB_Page YOB;
	UpstoxLogoutPage logout;
	UpstoxLoginHomePage home;
	UpstoxLoginWelcomePage welcome;
	UpstoxWatchlistStockAddPage watchlist;
	SimpleStockAddInWatchlist AddStox;
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException
	{
		//Initilisation Of Oject
		//browser=new BaseClass();
		initialisationOfBrowser();
		Thread.sleep(2000);
		login1=new UpstoxLogin1Page(driver);
		YOB=new UpstoxLogin2_YOB_Page(driver);
		
		home=new UpstoxLoginHomePage(driver);
		
		logout=new UpstoxLogoutPage(driver);
		
		welcome=new UpstoxLoginWelcomePage(driver);
		
		watchlist=new UpstoxWatchlistStockAddPage(driver);
		
		AddStox=new SimpleStockAddInWatchlist(driver);
		
	}
	
	@BeforeMethod
	public void loginApp() throws IOException, InterruptedException
	{
		
		
		login1.inpUsernameUpstoxLoginPage(UtilityClass.propertyfile("UN"));
		Thread.sleep(2000);
		login1.inpPasswordUpstoxLoginPage(UtilityClass.propertyfile("Pass"));
		Thread.sleep(2000);
		login1.clickLoginBTNUpstoxLoginPage();
		Thread.sleep(2000);
		YOB.inpUpstoxLogin2PageYOB(UtilityClass.propertyfile("YOB"));
		Thread.sleep(2000);
		welcome.clickUpstoxLogindWelcomePage();
		Thread.sleep(2000);
	}
	
//	@Test
//	public void verifyUsername() throws EncryptedDocumentException, IOException, InterruptedException
//	{   
//		TCno=101;
//		String CURL = driver.getCurrentUrl();
//	    Reporter.log(CURL,true);
//		String acttext = home.getUpstoxHomePageUserName();
//		String exptext = UtilityClass.excel(0, 3);
//		Assert.assertEquals(acttext, exptext, "both are diff");
//		Thread.sleep(5000);
//	}
	
	@Test
	public void Addstock() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCno=102;
		watchlist.clickUpstoxAddBtn();
		watchlist.clickUpstoxSearchbox(UtilityClass.excel(0, 5));
	     String shares = watchlist.selectfromlAutosuggetion();	
	     String exptshare = UtilityClass.excel(0, 6);
	     if(shares==exptshare)
	     {
	    	 watchlist.clickaddBtnWatchlist();
	     }
	     
	}
	
	
	
//	@Test
//	public void StockAdd() throws EncryptedDocumentException, IOException, InterruptedException
//	{
//		Thread.sleep(2000);
//		AddStox.clicksimpleAdd();
//		AddStox.inpSearchSample(UtilityClass.excel(0, 6));
//		AddStox.clickStockSample();
//	}
	
	
	@AfterMethod
	public void logoutApp(ITestResult t1) throws InterruptedException, IOException
	{
		if(t1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.takeScreenShot(driver, TCno);
		}
		Thread.sleep(5000);
		logout.clickUsernameArrow();
		Thread.sleep(1000);
		logout.clickUpstoxLogoutOpt();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	

}
