package selenium123;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_PoPUP {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
	    driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
	    driver.manage().window().maximize();
	    
	    WebElement alertbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
//	    WebElement confirmbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
//	    WebElement promptbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
//	    WebElement lineBreaks = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));


	    alertbox.click();
//	    confirmbox.click();
//	    promptbox.click();
//	    lineBreaks.click();
	    Thread.sleep(3000);
	    
	    String mainPageAddr = driver.getWindowHandle();
	    System.out.println(mainPageAddr);
	    
	    ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//	    for(int i=0;i<addr.size();i++)
//	    {
//	    	 String a = addr.get(i);
//	    	 driver.switchTo().window(a);
//	    	 String url = driver.getCurrentUrl();
//	    	 System.out.println("index"+i+"  "+ a +"  "+url);
//	    	
//	    
	    driver.switchTo().window(mainPageAddr);
	    driver.switchTo().frame("iframeResult");
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	    WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
	    tryit.click();
	    Alert alt = driver.switchTo().alert();
	    alt.accept(); 
	    Thread.sleep(3000);
	    
	   
}
	   
}
