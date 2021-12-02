package selenium123;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Html_Table {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
	    driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	    driver.manage().window().maximize();
	    
	    List<WebElement> list = driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
	    for(int i=0;i<list.size();i++)
	    {
	    	 String value = list.get(i).getText();
	 	    System.out.println(value);
	    }
	    
	    int rowcount = list.size();
	    System.out.println("row count:"+ rowcount);
	    for(int j=1;j<rowcount;j++)
	    {
	      List<WebElement> listcell = list.get(j).findElements(By.xpath("//table[@id='customers']//tr["+(j+1)+"]//td"));
	      int cellcount = listcell.size();
		    System.out.println("cell count"+ cellcount);
		    
		    for(int k=0;k<cellcount;k++)
		    {
		    	String value = listcell.get(k).getText();
		    	System.out.print(value + " ");
		    }
		    System.out.println();
	    }
	    driver.close();
	}

}
