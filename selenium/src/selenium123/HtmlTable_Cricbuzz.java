package selenium123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HtmlTable_Cricbuzz {
	
	public static void main(String[] args) {
		//Code for notification
		ChromeOptions notification = new ChromeOptions();
		notification.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(notification);		
	    driver.navigate().to("https://m.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
	    driver.manage().window().maximize();
	    
	    List<WebElement> list = driver.findElements(By.xpath("//table[@class='table']//tr//th"));
	    for(int i=0;i<=list.size()-1;i++)
	    {
	    	String a = list.get(i).getText();
	    	System.out.print(a+" ");
	    }
	    System.out.println();
	    
	    List<WebElement> listOfRow = driver.findElements(By.xpath("//table[@class='table']//tr"));
	    for(int j=0;j<listOfRow.size();j++)
	    {
	    	  List<WebElement> listOfCell = listOfRow.get(j).findElements(By.xpath("//table[@class='table']//tr["+(j+1)+"]//td"));
	    	  for(int k=0;k<listOfCell.size();k++)
	    	  {
	    		  String value = listOfCell.get(1).getText();
	    		  System.out.println(value+" ");
	    	  } 
	    	  
	    }
	    driver.close();
	    
	}

}
