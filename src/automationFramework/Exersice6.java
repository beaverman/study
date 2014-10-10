package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exersice6 {
	
	public static WebDriver driver = null;
	
	public static void main (String [] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		String test = (driver.findElement(By.xpath("//button[contains(.,'Alert Box')]")).getLocation()).toString();
		test = "The coordinates of \"Alert Box\" button are: " + test;
		System.out.print(test);
		driver.findElement(By.xpath("//button[contains(.,'Alert Box')]")).click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.close();
	}

}
