package selenium123;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PoPUP {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
	    driver.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	    driver.manage().window().maximize();
	    
	    WebElement Ok = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
	    Ok.click();
	    Thread.sleep(3000);
	    Alert alt = driver.switchTo().alert();
	    alt.accept();
	    Thread.sleep(3000);
	    
	    WebElement cancel = driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
	    cancel.click();
	    Thread.sleep(3000);
	    Alert alt1 = driver.switchTo().alert();
	    alt1.dismiss();
	    Thread.sleep(3000);
	    
	    WebElement click = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
	    click.click();
	    Thread.sleep(3000);
	    Alert alt2 = driver.switchTo().alert();
	    alt2.sendKeys("mahendra");
	    alt2.accept();
	    Thread.sleep(3000);
	    
	}

}
