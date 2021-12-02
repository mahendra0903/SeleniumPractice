 package selenium123;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class PostOffice {
	

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
	    driver.navigate().to("https://www.indiapost.gov.in/VAS/pages/userregistration.aspx");
	    driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@aria-label=\"User identifier\"]"));
		user.sendKeys("1234");
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.xpath("//select[@tabindex=\"3\"]"));
		Select s = new Select(firstname);
		Thread.sleep(3000);
		s.selectByIndex(1);
		
		WebElement name = driver.findElement(By.xpath("//input[@title=\"First Name\"]"));
		name.sendKeys("Mahendra");
		Thread.sleep(3000);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@title=\"Last Name\"]"));
		lastname.sendKeys("Kolate");
		Thread.sleep(3000);
		
		WebElement hint = driver.findElement(By.xpath("//select[@title=\"Hint Question\"]"));
		Select r = new Select(hint);
		r.selectByIndex(1);
		Thread.sleep(3000);
		
		WebElement hintans = driver.findElement(By.xpath("//input[@title=\"Hint Answer\"]"));
		hintans.sendKeys("Undargoan");
		Thread.sleep(3000);
		
		WebElement address = driver.findElement(By.xpath("//input[@title=\"Address\"]"));
		address.sendKeys("At-undargoan,Post-Sogoan");
		Thread.sleep(3000);
		
		WebElement addline2 = driver.findElement(By.xpath("//input[@aria-label=\"Address line 2\"]"));
		addline2.sendKeys("Ta-Karmala,Dist-Solapur");
		Thread.sleep(3000);
		
		WebElement addline3 = driver.findElement(By.xpath("//input[@aria-label=\"Address line 3\"]"));
		addline3.sendKeys("State-Maharastra");
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.xpath("//select[@title=\"Country\"]"));
		Select m = new Select(country);
		m.selectByVisibleText("India");
		Thread.sleep(3000);
		
		WebElement state = driver.findElement(By.xpath("//select[@title=\"State\"]"));
		Select k = new Select(state);
		k.selectByVisibleText("Maharashtra");
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.xpath("//select[@title=\"City / District\"]"));
		Select c = new Select(city);
		c.selectByValue("0311");
		Thread.sleep(3000);
		
		WebElement pincode = driver.findElement(By.xpath("//input[@title=\"Pincode\"]"));
		pincode.sendKeys("413206");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@title=\"Email\"]"));
		email.sendKeys("kolatemahendra@gmail.com");
		Thread.sleep(3000);
		
		WebElement mobile = driver.findElement(By.xpath("//input[@title=\"Mobile\"]"));
		mobile.sendKeys("8600315002");
		Thread.sleep(3000);
	    ClassA.screenshot((TakesScreenshot) driver);
		Thread.sleep(3000);
		driver.close();
		
//		WebElement news = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
//		//news.click();
//		Thread.sleep(3000);
//		
//		boolean result = news.isSelected();
//		if(result)
//		{
//			System.out.println("it is selected");
//		}
//		else
//		{
//			news.click();
//		}
//		
		
		
	}

}
