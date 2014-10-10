package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com/automation-practice-form/");
		
		
		List<WebElement> chbxList1 = driver.findElements(By.name("sex"));
		boolean chbxState = chbxList1.get(0).isSelected();
		if (chbxState) chbxList1.get(1).click();
		
		
		
		for (WebElement temp : driver.findElements(By.name("exp"))) {
			if ( "exp-2".equals(temp.getAttribute("id")) ) {
				temp.click();
			}
		}
		
		
		for (WebElement temp : driver.findElements(By.name("profession"))) {
			if ( "Automation Tester".equals(temp.getAttribute("value")) ) {
				temp.click();
			}
		}
		
		
		
		driver.findElement(By.cssSelector("input[value = \"Selenium IDE\"]")).click();
		

	}
	
	private static WebDriver driver;
	
	
}
