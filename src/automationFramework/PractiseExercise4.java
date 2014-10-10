package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseExercise4 {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("ABOUT")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://www.toolsqa.com");
		driver.navigate().refresh();
		driver.quit();
		
		
		
		
		

	}

}
