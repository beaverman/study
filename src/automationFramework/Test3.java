package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test3 {

	public static void main(String[] args) {
		
		//Initialize webdriver
		driver = new StartWebDriver("ff").init();
		
		//Get page
		driver.get("http://www.toolsqa.com/automation-practice-table/");
		
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText());

		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
		
		if ("http://www.toolsqa.com/automation-practice-table/#".equals(driver.getCurrentUrl())) {
			System.out.println("The link has been clicked!");
		}
		
		
		int rowNumber = 2;
		int collumnNumber = 3;
		System.out.println(driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+rowNumber+"]/td["+collumnNumber+"]")).getText());
		
		
		driver.close();
				
	}
	
	private static WebDriver driver;
}