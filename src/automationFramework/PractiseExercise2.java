package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseExercise2 {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
	
		driver.get("http://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("Romko");
		driver.findElement(By.name("lastname")).sendKeys("Incognito");
		driver.findElement(By.name("submit")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	

	}

}
