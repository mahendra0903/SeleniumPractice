package selenium123;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		  ClassA.screenshot((TakesScreenshot) driver);
		  Thread.sleep(3000);
			driver.close();
			
//		WebElement button = driver.findElement(By.xpath("//button[text()='✕']"));
//		button.click();
//		Thread.sleep(3000);
//		WebElement image = driver.findElement(By.xpath("//img[@alt='Travel']"));
//		image.click();
//		Thread.sleep(3000);
//		WebElement from = driver.findElement(By.className("//input[@name='0-departcity']"));
//		from.click();
//		Thread.sleep(3000);
//		from.sendKeys("pune");
//		Thread.sleep(3000);
//    	WebElement to = driver.findElement(By.xpath("//input[@name='0-arrivalcity']"));
//		to.click();
//		Thread.sleep(3000);
//		to.sendKeys("mumbai");
//		Thread.sleep(3000);
//		WebElement date = driver.findElement(By.xpath("//input[@name='0-datefrom']"));
//		date.click();
//		Thread.sleep(3000);
//		//WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
//		//cont.click();
//		
	}

}
