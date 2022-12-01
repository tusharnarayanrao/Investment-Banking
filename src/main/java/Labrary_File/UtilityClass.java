package Labrary_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String excel(int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Test Data For Test Cases\\for automation.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("POM with DDF with TestNG");
	String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
	return value;
	
	}
	
	public static void takeScreenShot(WebDriver driver, int TCno) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst=new File(System.getProperty("user.dir")+"\\Screen Shot\\TC"+TCno+".jpg");
		FileHandler.copy(src, dst);
	}
	
	public static String propertyfile(String key) throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\PropertyFileForLoginData.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
			
	}
}
