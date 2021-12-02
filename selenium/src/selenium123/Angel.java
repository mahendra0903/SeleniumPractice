package selenium123;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Angel {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://trade.angelbroking.com/Login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUserID']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='txtTradingPassword']"));
		WebElement LogIn = driver.findElement(By.xpath("//a[@id='loginBtn']"));
		username.sendKeys("kolatemahendra@gmail.com");
		Thread.sleep(3000);
		password.sendKeys("mk@09031997");
		Thread.sleep(3000);
		LogIn.click();
		Thread.sleep(3000);
		ClassA.screenshot((TakesScreenshot) driver);
		Thread.sleep(3000);
		
		
//		WebElement reports = driver.findElement(By.xpath("//a[@id='mnReports']"));
//		reports.click();
//		Thread.sleep(3000);
//		ClassA.screenshot((TakesScreenshot) driver);
//		Thread.sleep(3000);
//		
//		
//		WebElement typeofreport =driver.findElement(By.xpath("//div[@id='filter1']"));
//		typeofreport.click();
//		Thread.sleep(3000);
//		ClassA.screenshot((TakesScreenshot) driver);
//		Thread.sleep(3000);
//		
//		
//		WebElement plsummary =driver.findElement(By.xpath("//a[text()='P&L Summary']"));
//		plsummary.click();
//		Thread.sleep(3000);
//		ClassA.screenshot((TakesScreenshot) driver);
//		Thread.sleep(3000);
//		
//		
//		WebElement exchange =driver.findElement(By.xpath("//div[@id='filter5']"));
//		exchange.click();
//		Thread.sleep(3000);
//		
//		
//		WebElement fno =driver.findElement(By.xpath("//a[@data-ex='F & O']"));
//		fno.click();
//		Thread.sleep(3000);
//		ClassA.screenshot((TakesScreenshot) driver);
//		Thread.sleep(3000);
//		
//		
//		WebElement selectfy =driver.findElement(By.xpath("//div[@id='filter2']"));
//		selectfy.click();
//		Thread.sleep(3000);
//		ClassA.screenshot((TakesScreenshot) driver);
//		Thread.sleep(3000);
//		
//		
//		WebElement year =driver.findElement(By.xpath("//a[@data-finyear='2021-22']"));
//		year.click();
//		Thread.sleep(3000);
//		ClassA.screenshot((TakesScreenshot) driver);
//		Thread.sleep(3000);
//		
//		
//		WebElement go =driver.findElement(By.xpath("//div[@id='btnGo']"));
//		go.click();
//		Thread.sleep(3000);
//		ClassA.screenshot((TakesScreenshot) driver);
		Thread.sleep(3000);
		
		WebElement mk = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[10]"));
		Actions act = new Actions(driver);
		act.moveToElement(mk).perform();
		Thread.sleep(3000);
		WebElement j=driver.findElement(By.xpath("//a[@onclick='SignOut()']"));
		j.click();
		
		
	}

}
