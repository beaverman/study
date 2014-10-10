package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class StartWebDriver {
	
	
	public StartWebDriver (String getWebdriverType) {
		webDriverType = getWebdriverType;
	}
	
	public StartWebDriver () {
		webDriverType = "ch";
	}
	
	
	public WebDriver init () {
		
		WindowsUtils.tryToKillByName("chromedriver.exe");
		
		switch (webDriverType) {
				
			case "ff":
				WebDriver temp1 = new FirefoxDriver();
				driver = temp1;
				break;
				
			case "ch":
				System.setProperty("webdriver.chrome.driver", "d:\\Work\\Development\\chromedriver.exe");
				WebDriver temp2 = new ChromeDriver();
				driver = temp2;
				break;
			default:
				System.setProperty("webdriver.chrome.driver", "d:\\Work\\Development\\chromedriver.exe");
				WebDriver temp3 = new ChromeDriver();
				driver = temp3;
				break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return (driver);
	}
	
	
	private WebDriver driver;
	private String webDriverType;
}
