package automationFramework;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise5 {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		
		//Initiate Firefox with defaults
		driver = new FirefoxDriver();
		
		//Set timeout
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Open website
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		//Get WindowHandle
		String currentWindowName = driver.getWindowHandle();
		System.out.print(currentWindowName + "\n");
		
		//Click button to open new window
		driver.findElement(By.xpath("//button[contains(.,'Message')]")).click();
		
		//Get all window handles
		Set<String> handles = driver.getWindowHandles();
		handles.remove(currentWindowName);
		
		//Select popup
		String popupWindow = handles.iterator().next();
		System.out.print(popupWindow);
		//Switch to popup
		driver.switchTo().window(popupWindow);
		
		driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
