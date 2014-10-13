package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    public static WebElement Email (WebDriver driver) {
        WebElement element = driver.findElement(By.id("Email"));
        return element;
    }

    public static WebElement Password (WebDriver driver) {
        WebElement element = driver.findElement(By.id("Passwd"));
        return element;
    }


    public static WebElement SignIn (WebDriver driver) {
        WebElement element = driver.findElement(By.id("signIn"));
        return element;
    }

}
