package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseExercise3 {

	private static WebDriver driver = null;
		public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.partialLinkText("Partial")).click();	
		System.out.print(driver.findElement(By.tagName("button")).toString());
		driver.findElement(By.linkText("Link Test")).click();
		driver.quit();

	}

}
