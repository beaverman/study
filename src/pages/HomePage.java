package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath = ".//*[text() = 'Sign in']") public WebElement signinButton;
	@FindBy(xpath = ".//*[@id='gs_htif0']") public WebElement searchTextbox;
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver driver;
}