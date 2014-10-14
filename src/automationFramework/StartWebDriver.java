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
		try {
			WindowsUtils.tryToKillByName("chromedriver.exe");
			System.out.println("Closing existing webdriver instance. Starting new webdriver");
		}
		catch (Exception x) {
			System.out.println("No webdriver running. Starting new webdriver");
		}

		
		switch (webDriverType) {
				
			case "ff":
				driver = new FirefoxDriver();
				break;
				
			case "ch":
				System.setProperty("webdriver.chrome.driver", "d:\\Work\\Development\\chromedriver.exe");
				driver = new ChromeDriver();

				break;
			default:
				System.setProperty("webdriver.chrome.driver", "d:\\Work\\Development\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return (driver);
	}
	
	
	private WebDriver driver;
	private String webDriverType;
}
