package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "Email") public WebElement Email;
	@FindBy(id = "Passwd") public WebElement Password;
	@FindBy(id = "signIn") public WebElement Submit;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;

	}

	public WebDriver driver;
}