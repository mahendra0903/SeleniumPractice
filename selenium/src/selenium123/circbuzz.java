package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class circbuzz {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
	    driver.navigate().to("https://www.cricbuzz.com/cricket-stats/icc-rankings/men/teams");
	    driver.manage().window().maximize();
	    
	    WebElement aus = driver.findElement(By.xpath("//div[text()='AUSTRALIA']"));
	    Thread.sleep(3000);
	    String m= aus.getText();
	    
	    WebElement pts = driver.findElement(By.xpath("//div[text()='1844']"));
	    Thread.sleep(3000);
	    String k = pts.getText();
	    
	    System.out.println("Team"+" "+"Points");
	    System.out.println(m+" "+k);
	}

}
