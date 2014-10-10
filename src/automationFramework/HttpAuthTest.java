package automationFramework;

import org.openqa.selenium.WebDriver;

public class HttpAuthTest {

	public static void main(String[] args) {
		
		driver = new StartWebDriver("ch").init();
		driver.get("http://user:user@gameroom-webcam.lv.lohika.com");
		
		driver.close();

	}
	
	private static WebDriver driver;
}
