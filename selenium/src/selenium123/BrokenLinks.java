package selenium123;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	   	
			WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			user.sendKeys("8600315002");
			Thread.sleep(1000);
			

			WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
			pass.sendKeys("5002");
			Thread.sleep(1000);
			
			WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			submit.click();
			Thread.sleep(1000);
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			List<WebElement> brokenlink = new ArrayList<WebElement>();
			for(int i=0;i<links.size();i++)
			{
				if(links.get(i).getAttribute("href")==null)
				{
					brokenlink.add(links.get(i));
				}
			}
			System.out.println(brokenlink.size());
			Thread.sleep(1000);
			driver.close();
	}

}
