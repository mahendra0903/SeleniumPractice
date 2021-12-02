package selenium123;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LIC {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
	    driver.navigate().to("https://licindia.in/");
	    driver.manage().window().maximize();
	    
	    WebElement portal = driver.findElement(By.xpath("//a[@title='Customer Portal']"));
	    portal.click();
	    Thread.sleep(3000);
	    
	    WebElement newUser = driver.findElement(By.xpath("//a[text()='New User']"));
	    newUser.click();
	    Thread.sleep(3000);
	    
	    
	    Alert alt = driver.switchTo().alert();
	    alt.accept();
	    Thread.sleep(3000);
	    
	    String mainPageAddr = driver.getWindowHandle(); 
	    System.out.println(mainPageAddr);
	    
	   ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	    
	    
	    
	    
	    for(int i=0;i<addr.size();i++)
	    {
	    	String a = addr.get(i);
	    	 driver.switchTo().window(a);
	    	 String url = driver.getCurrentUrl();
	    	 System.out.println("index"+i+"  "+ a +"  "+url);
	    }
	    Thread.sleep(3000);
	    driver.switchTo().window(addr.get(1));
	    WebElement policy = driver.findElement(By.xpath("//input[@name='policyNumber']"));
	    policy.sendKeys("123456789");
	    Thread.sleep(3000);
	    
	    WebElement instalment = driver.findElement(By.xpath("//input[@name=\"premiumAmount\"]"));
	    instalment.sendKeys("10000");
	    Thread.sleep(3000);
	    
	    
	    WebElement datefield = driver.findElement(By.xpath("//input[@name=\"datefield\"]"));
	    datefield.sendKeys("09/03/1997");
	    Thread.sleep(3000);
	    
	    WebElement mobilenumber = driver.findElement(By.xpath("//input[@name=\"mobileNumber\"]"));
	    mobilenumber.sendKeys("8600865002");
	    Thread.sleep(3000);
	    
	    
	    WebElement email = driver.findElement(By.xpath("//input[@name=\"emailId\"]"));
	    email.sendKeys("kolatemahendra11@gmail.com");
	    Thread.sleep(3000);
	    
	
	    WebElement passport = driver.findElement(By.xpath("//input[@name=\"passportNumber\"]"));
	    passport.sendKeys("A2096457");
	    Thread.sleep(3000);
	    
	    WebElement pan = driver.findElement(By.xpath("//input[@name=\"panNumber\"]"));
	    pan.sendKeys("EABPH2477F");
	    Thread.sleep(3000);
	    
	    WebElement male = driver.findElement(By.xpath("//label[text()=\"Male\"]"));
	    male.click();
	    Thread.sleep(3000);
	    
	    WebElement checkbox = driver.findElement(By.xpath("//input[@name=\"confirmMobilenumber\"]"));
	    checkbox.click();
	    Thread.sleep(3000);
	    
	    boolean result = checkbox.isSelected();
	    if(result)
			{
				System.out.println("it is selected");
			}
			else
			{
				checkbox.click();
			}
	    
	 
	    WebElement proceed = driver.findElement(By.xpath(" //span[@id=\"da_button-1161-btnEl\"]"));
	    proceed.click();
	    Thread.sleep(3000);
	    
	    ClassA.screenshot((TakesScreenshot) driver);
	    
	    Alert alt1 = driver.switchTo().alert();
	    alt1.dismiss();
	    Thread.sleep(3000);
	    driver.quit();
	 	    
	    
	}

}
