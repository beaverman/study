package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import automationFramework.StartWebDriver;
import pages.HomePage;
import pages.LoginPage;

public class ValidLogin {

	LoginPage lPage;
	HomePage hPage;
	WebDriver driver;
	
	
	public void Prepare() {
		driver = new StartWebDriver("ch").init();
		driver.get("http://www.google.com/ncr");
		hPage = PageFactory.initElements(driver, HomePage.class);
		lPage = PageFactory.initElements(driver, LoginPage.class);
		
	}	
	
	public void RunTest(String username, String password) throws InterruptedException {
		hPage.signinButton.click();
		lPage.Email.sendKeys(username);
		lPage.Password.sendKeys(password);
		lPage.Submit.click();
		
		Thread.sleep(10000);
	}

    public void endTest() {
        driver.quit();
    }

}
