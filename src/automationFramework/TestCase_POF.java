package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestCase_POF {

	public static void main(String[] args) throws InterruptedException {
		
		driver = new StartWebDriver().init();
		driver.get("http://store.demoqa.com");
		
		PageFactory.initElements(driver, TestCase_POF.class);
		
		lnk_MyAccount.click();
		username.sendKeys("testuser_1");
		password.sendKeys("Test@123");
		submit.click();
		
		Thread.sleep(7000);
		
		logout.click();
		
		
		Thread.sleep(5000);
		driver.close();

	}
	
	public static WebDriver driver;
	
	@FindBy(xpath = ".//*[@id='account']/a") static WebElement lnk_MyAccount;
	
	@FindBy(how = How.ID, using = "log")
	static WebElement username;
	
	@FindBy(how = How.NAME, using = "pwd")
	static WebElement password;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='login']")
	static WebElement submit;
	
	@FindBy(how = How.LINK_TEXT, using = "Log out")
	static WebElement logout;
	

}
