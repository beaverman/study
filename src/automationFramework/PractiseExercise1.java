package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseExercise1 {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("http://www.store.demoqa.com");
		String title = driver.getTitle();
		System.out.print("The title  is: " + title + "\n" + "Title lenght is: " + title.length() + " characters\n");
		String url = driver.getCurrentUrl();
		System.out.print("The URL  is: " + url + "\n" + "URL lenght is: " + url.length() + " characters\n");
		
		driver.navigate().refresh();
		
		String source = driver.getPageSource();
		System.out.print("The URL  is: " + source + "\n" + "URL lenght is: " + source.length() + " characters\n");
		driver.quit();
	}

}
