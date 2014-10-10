package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com/automation-practice-form/");
		

		Select Continents = new Select(driver.findElement(By.name("continents")));
		
		//Select by visible text - Europe
		Continents.selectByVisibleText("Europe");
		Thread.sleep(1000);
		
		
		
		//Select by index - Africa
		Continents.selectByIndex(2);
		Thread.sleep(1000);
		
		
		// Select North America 
		List<WebElement> continentsList = Continents.getOptions();
		int listSize = continentsList.size();
		
		for (int i = 0; i < listSize; i++) {
			System.out.println(continentsList.get(i).getText());
			if ( "North America".equals(continentsList.get(i).getText()) ) {
				Continents.selectByIndex(i);
			}
		}
		Thread.sleep(1000);

		
		
		// Select and de-select Browser Commands
		Select Multi = new Select(driver.findElement(By.name("selenium_commands")));
		List<WebElement> multiElements = Multi.getOptions();
		int multiSize = multiElements.size();
		
		for (int i = 0; i < multiSize; i++) {
			if ( "Browser Commands".equals(multiElements.get(i).getText()) ) {
				Multi.selectByIndex(i);
				locator = i;
			}			
		}
		Thread.sleep(1000);
		
		
		Multi.deselectByIndex(locator);
		Thread.sleep(1000);
		
		Multi.selectByVisibleText("Navigation Commands");
		Thread.sleep(1000);
		
		Multi.deselectByVisibleText("Navigation Commands");
		Thread.sleep(1000);
		
	
		for (int i = 0; i < multiSize; i++) {
			Multi.selectByIndex(i);
			System.out.println(multiElements.get(i).getText().toString());
		}
		Thread.sleep(1000);
		
		
		for (int i = 0; i < multiSize; i++) {
			Multi.deselectByIndex(i);
		}
		Thread.sleep(1000);
		
		
		driver.close();
		
		
		
		

	}
	
	private static int locator;
	private static WebDriver driver;

}
