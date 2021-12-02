package selenium123;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Flip_kart {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",login);
        Thread.sleep(3000);
        	
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		user.sendKeys("8600315002");
		Thread.sleep(3000);
		

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("5002");
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();
		Thread.sleep(3000);
		
		WebElement mk = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act = new Actions(driver);
		act.moveToElement(mk).perform();
		Thread.sleep(3000);
		WebElement ak = driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[10]"));
		ak.click();
		driver.close();
		

		
	}

}
