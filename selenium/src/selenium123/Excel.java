package selenium123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {
	static String ak;
    static String value;
	public static String getExcelData(int row,int cell) throws EncryptedDocumentException, IOException
	{

		String path = "C:\\Users\\DELL\\Desktop\\Software Testing\\testing.xlsx";
		FileInputStream file = new FileInputStream(path);
		Cell getcell = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell);
		
		
		
		try
		{
			String value= getcell.getStringCellValue();
			return value;
		}
		catch(Exception e)
		{
			double m =getcell.getNumericCellValue();
			long a = (long)m;
			String ak =String.valueOf(a);
			System.out.println(ak);
			return ak;
		}
		
		
	}
	  
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		String path = "C:\\Users\\DELL\\Desktop\\Software Testing\\testing.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet s = WorkbookFactory.create(file).getSheet("Sheet1");
	
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				String value = s.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
		
	String data = getExcelData(0,1);
    	System.out.println(data);
    	

//		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();		
//		driver.manage().deleteAllCookies();
//	    driver.navigate().to("https://www.facebook.com/");
//	    driver.manage().window().maximize();
//	    Thread.sleep(2000);
//	    
//	    WebElement user = driver.findElement(By.xpath("//input[@name=\"email\"]"));
//	    user.sendKeys(getExcelData(0,0));
//	    Thread.sleep(2000);
//	    
//	    WebElement pass = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
//	    pass.sendKeys(getExcelData(0,1));
//	    Thread.sleep(2000);
//	    
//	    
//		Excel.getExcelData(0,0);
		    
	}

}
