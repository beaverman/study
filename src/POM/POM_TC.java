package POM;
import automationFramework.StartWebDriver;
import org.openqa.selenium.WebDriver;


public class POM_TC {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting browser");
        driver = new StartWebDriver("ch").init();

        System.out.println("Navigating to SignIn page");
        driver.get("http://www.google.com/ncr");
        HomePage.signInButton(driver).click();
        Thread.sleep(500);

        System.out.println("Entering username");
        SignInPage.Email(driver).sendKeys("pekelnuj.didko@gmail.com");
        Thread.sleep(350);

        System.out.println("Entering password");
        SignInPage.Password(driver).sendKeys("testpass");

        System.out.println("Signing in!");
        SignInPage.SignIn(driver).click();

        Thread.sleep(2000);
        driver.close();
    }
}
