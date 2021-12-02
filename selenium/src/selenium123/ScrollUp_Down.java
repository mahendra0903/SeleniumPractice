package selenium123;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
	    driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
//	    //ScrollDown upto specific Element
//	    WebElement mk = driver.findElement(By.xpath("(//a[@target='_blank'])[68]"));
//	    JavascriptExecutor j = ((JavascriptExecutor)driver);
//	    j.executeScript("arguments[0].scrollIntoView(true)",mk);
//	    
	   String m = Excel.getExcelData(0,0);
	   System.out.println(m);
	}

}
