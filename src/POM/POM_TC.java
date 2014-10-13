package POM;
import automationFramework.StartWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class POM_TC {
    public static WebDriver driver;
    private static WebDriver check;

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

        Thread.sleep(1500);
        driver.close();
    }
}
